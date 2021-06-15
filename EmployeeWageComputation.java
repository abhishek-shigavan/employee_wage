/**
 * EmployeeWageComputation --- Program to compute Monthly Wage
 * 
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables 
	public static final int IS_PRESENT =1;
	public static final int IS_PART_TIME =2;
	public static final int WAGE_PER_HOUR =20;
	public static final int WORKING_DAY_PER_MONTH =20;
	public static final int MAX_WORKING_HOUR =100;
/**
 * Checking attendance & according to it
 * set value of working hours
 * Sum up this working hours to get total working hours.
 * Compute Monthly wage using total working hours.
 * 
 * @return No return	
 */
	public static void getEmployeeWage() {
		
		//local variables
		int empWorkHours =0;
		int totalWorkingHour =0;
		
		//ensuring wage will be computed till working day limit
		for(int i=1; i<=WORKING_DAY_PER_MONTH; i++) {
			
			//checking for maximum working day / hours limit
			if (i <= WORKING_DAY_PER_MONTH && totalWorkingHour <= MAX_WORKING_HOUR ) 
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
			else {
				break;
			}
		}
		//computing monthly wage 
		int empMonthlyWage = totalWorkingHour * WAGE_PER_HOUR;
		System.out.println("Monthly Wage of Employee : " +empMonthlyWage);
	}
/**
 * Prints out welcome message.
 * Calling getEmployeeWage method 
 * 
 * @return No return value.
 */	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program...!!");
		
		getEmployeeWage();	
	}
}
