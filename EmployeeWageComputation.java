/**
 * EmployeeWageComputation	-- Computing monthly wage
 *                          of employee of different companies
 *                                                   
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables 
	public static final int IS_PRESENT =1;
	public static final int IS_PART_TIME =2;
	//instance variables
	private String company_Name;
	private int wage_Per_Hour;
	private int working_Day_Per_Month;
	private int max_Working_Hour;
	private int empMonthlyWage;
	
	public EmployeeWageComputation(String company_Name, int wage_Per_Hour, int working_Day_Per_Month,int max_Working_Hour) {
		
		this.company_Name = company_Name;
		this.wage_Per_Hour = wage_Per_Hour;
		this.working_Day_Per_Month = working_Day_Per_Month;
		this.max_Working_Hour = max_Working_Hour;
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
	public void getEmployeeWage() {
		
		//local variables
		int empWorkHours =0;
		int totalWorkingHour =0;
		int totalWorkingDay =0;
	
			//checking for maximum working day / hours limit
			while(totalWorkingDay <= working_Day_Per_Month && totalWorkingHour <= max_Working_Hour ) 
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
		empMonthlyWage = totalWorkingHour * wage_Per_Hour;
	}
	
	@Override
	public String toString() {
		return "EmployeeWageComputation [Company Name = " + company_Name + ", Monthly Wage Of Employee = " + empMonthlyWage + "]";
	}
/**
 * Prints out welcome message.
 * Calling getEmployeeWage for multiple 
 * companies using multiple object
 *  
 * @return No return value.
 */	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program...!!");
		//creating object for multiple company
		EmployeeWageComputation dMart = new EmployeeWageComputation("D-Mart", 30, 25, 100);
		EmployeeWageComputation reliance = new EmployeeWageComputation("Reliance", 40, 25, 120);
		EmployeeWageComputation bigBazar = new EmployeeWageComputation("Big Bazar", 35, 22, 105);
		
		dMart.getEmployeeWage();
		System.out.println(dMart);
		
		reliance.getEmployeeWage();
		System.out.println(reliance);
		
		bigBazar.getEmployeeWage();
		System.out.println(bigBazar);
	}
}

