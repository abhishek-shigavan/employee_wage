/**
 * EmployeeWageComputation	-- Computing monthly wage of 
 * 				employee of different companies
 *                                                   
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables 
	public static final int IS_PRESENT =1;
	public static final int IS_PART_TIME =2;
	
	private int no_OfCompany =0;
	
	//defining array to store object of different companies
	private CompanyEmpWage[] companyWageArray;
	
	//It will create array when object is created
	public EmployeeWageComputation() {
		//creating array
		companyWageArray = new CompanyEmpWage[5];
	}
/**
 * This method create company object with its details
 * and store it into array (companyWageArray[])
 * 	
 * @return No return
 */
	private void addCompanyEmpWage(String company_Name, int wage_Per_Hour, int working_Day_Per_Month, int max_Working_Hour) {
		
		//storing companies object into array
		companyWageArray[no_OfCompany] = new CompanyEmpWage(company_Name, wage_Per_Hour, working_Day_Per_Month, max_Working_Hour);
		//incrementing index for next company
		no_OfCompany++;
	}
/**
 * This method iterates through company array
 * & passes each company object to getEmployeeWage() 
 * method to compute monthly wage
 *
 * @retrun No return	
 */
	private void computeEmpWage() {
		
		for(int i=0; i < no_OfCompany; i++) {
			
			companyWageArray[i].setEmpMonthlyWage(this.getEmployeeWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}
	}
/**
 * This method checks attendance & accordingly
 * sets value of working hour.
 * Sum up this working hours to get total working
 * hours
 * Computes monthly wage using total working hour
 * & wage per hour 
 * 
 * @return No return	
 */
	public int getEmployeeWage(CompanyEmpWage companyEmpWage) {
		
		//local variables
		int empWorkHours =0, totalWorkingHour =0, totalWorkingDay =0;
	
			//checking for maximum working day / hours limit
			while(totalWorkingDay <= companyEmpWage.getWorking_Day_Per_Month() && totalWorkingHour <= companyEmpWage.getMax_Working_Hour() ) 
			{	
				//generating attendance
				int empAttendance = (int)(Math.floor(Math.random() * 10)) % 3;

				//checking for attendance & setting work hour value
				switch (empAttendance) {
					case IS_PRESENT: {
						empWorkHours =8;
						break;
					}
					case IS_PART_TIME: {
						empWorkHours =4;
						break;
					}
					default: {
						empWorkHours =0;
						break;
					}
				}
				
				//adding working hours into total working hours
				totalWorkingHour += empWorkHours;
			}
		//computing monthly wage
		return totalWorkingHour * companyEmpWage.getWage_Per_Hour();
	}
/**
 * Prints out welcome message.
 *  
 * Calling methods
 *  
 * @return No return value.
 */	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program...!!");
		//creating object for multiple company
		EmployeeWageComputation employeeWgeComputation = new EmployeeWageComputation();		
		
		//passing company details to create company object & storing it in array
		employeeWgeComputation.addCompanyEmpWage("D-Mart", 30, 25, 120);
		employeeWgeComputation.addCompanyEmpWage("Reliance", 40, 22, 110);
		employeeWgeComputation.addCompanyEmpWage("Big Bazar", 35, 27, 105);
		//calling compute wage 
		employeeWgeComputation.computeEmpWage();
	}
}
