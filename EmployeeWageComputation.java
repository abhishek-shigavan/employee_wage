import java.util.ArrayList;
import java.util.List;
/**
 * EmployeeWageComputation	-- Computing monthly wage of 
 * 				   employee of different companies
 *                                                   
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation implements EmpWageInterface{
	
	//constant variables 
	public static final int IS_PRESENT =1;
	public static final int IS_PART_TIME =2;
	
	//defining ArrayList to store object of different companies & storing wage
	private List<CompanyEmpWage> companyEmpWageList;
	private List<CompanyWageStore> companyWageStoreList;
	
	//It will create ArrayList when object is created
	public EmployeeWageComputation() {
		//creating ArrayList
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		companyWageStoreList = new ArrayList<CompanyWageStore>();
	}
/**
 * This method create company object with its properties
 * and store it into ArrayList (companyEmpWageList)
 * 	
 * @return No return
 */
	public void addCompanyEmpWage(String company_Name, int wage_Per_Hour, int working_Day_Per_Month, int max_Working_Hour) {
	
		//Creating object of CompanyEmpWage with company properties
		CompanyEmpWage company = new CompanyEmpWage(company_Name, wage_Per_Hour, working_Day_Per_Month, max_Working_Hour);
		//storing into ArrayList
		companyEmpWageList.add(company);
	}
/**
 * This method iterates through company ArrayList
 * & passes each company object to getEmployeeWage() 
 * method to compute monthly wage	
 * 
 * @return No return
 */
	public void computeEmpWage() {
		
		for(int i=0; i < companyEmpWageList.size(); i++) {
			
			CompanyEmpWage company = companyEmpWageList.get(i);
			//calling getEmployeeWage to get monthly wage & setting it as Employee monthly wage
			company.setEmpMonthlyWage(this.getEmployeeWage(company));
		
			System.out.println("\n Monthly Report :");
			System.out.println(companyEmpWageList.get(i)+"\n");
		}
	}
/**
 * This methods prints employees day wise
 * daily wage along with total wage
 * 
 * @return No return	
 */
	public void viewDailyWageRecord() {
		
		for(int i=0; i < companyWageStoreList.size(); i++) {
			//printing companyWageStoreList data
			System.out.println(companyWageStoreList.get(i));
		}
	}
/**
 * This method checks attendance & accordingly
 * sets value of working hour.
 * Sum up this working hours to get total working
 * hours
 * Computes monthly wage using total working hour
 * & wage per hour 
 * Storing daily wage along with total wage
 * @return No return	
 */
	public int getEmployeeWage(CompanyEmpWage companyEmpWage) {
		
		//local variables
		int empWorkHours =0, totalWorkingHour =0, totalWorkingDay =0, totalEmployeeWage =0;
	
			//checking for maximum working day / hours limit
			while(totalWorkingDay <= companyEmpWage.getWorking_Day_Per_Month() && totalWorkingHour <= companyEmpWage.getMax_Working_Hour() ) 
			{	
				totalWorkingDay++;
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
				
				//computing daily wage
				int dailyWage = companyEmpWage.getWage_Per_Hour() * empWorkHours;
				//computing totalEmployeeWage
				totalEmployeeWage = totalEmployeeWage + dailyWage;
				//storing company name
				String company_Name = companyEmpWage.getCompany_Name();
				
				//creating new object & passing properties to object
				CompanyWageStore companyWageStore = new CompanyWageStore(company_Name, totalWorkingDay, dailyWage, totalEmployeeWage);
				//adding to ArrayList
				companyWageStoreList.add(companyWageStore);
				
			}
		
			return totalEmployeeWage;
	}
/**
 * Prints out welcome message.
 *  
 * @return No return value.
 */	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program...!!");
		
		EmpWageInterface employeeWgeComputation = new EmployeeWageComputation();		
		
		//passing company details to create company object & storing it in ArrayList
		employeeWgeComputation.addCompanyEmpWage("D-Mart", 30, 20, 120);
		employeeWgeComputation.addCompanyEmpWage("Reliance", 40, 22, 110);
		employeeWgeComputation.addCompanyEmpWage("Big Bazar", 35, 27, 105);
		//calling compute wage 
		employeeWgeComputation.computeEmpWage();
		
		employeeWgeComputation.viewDailyWageRecord();
		
	}
}
