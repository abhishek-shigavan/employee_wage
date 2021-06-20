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
	public static void getEmployeeWage(String company_Name, int wage_Per_Hour, int working_Day_Per_Month, int max_Working_Hour) {
		
		//local variables
		int empWorkHours =0, totalWorkingHour =0, totalWorkingDay =0;
	
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
		int empMonthlyWage = totalWorkingHour * wage_Per_Hour;
		System.out.println("Company : "+company_Name+"\n Monthly Wage of "+company_Name+" Employee : " +empMonthlyWage);
	}
/**
 * Prints out welcome message.
 * Calling getEmployeeWage method 
 * 
 * @return No return value.
 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program...!!");
		//passing values for multiple companies
		getEmployeeWage("D-mart", 30, 25, 100 );
		getEmployeeWage("Reliance", 40, 25, 120 );
		getEmployeeWage("Big-Bazar", 35, 22, 105 );
	}
}

