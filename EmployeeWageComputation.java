/**
 * EmployeeWageComputation --- Program to check monthly attendance 
 * 			       of employee & according to it computing Monthly Wage
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
 * Checking attendance & accordingly
 * setting work hours.
 * Ensuring Maximum working day / hour limit should not exceed. 
 * Computing Monthly Wage as per total work hours.
 * Printing Monthly Wage
 * 
 * @return No return	
 */	
    public static void main(String[] args) {
    	//local variables
    	int empWorkHours =0;
    	int totalWorkingHour =0;
    	
    	System.out.println("Welcome to Employee Wage Computation Program...!!");
    	
    	for(int i=1; i <= WORKING_DAY_PER_MONTH; i++) {
            
    		//checking for maximum working day / hours limit
		if (i <= WORKING_DAY_PER_MONTH && totalWorkingHour <= MAX_WORKING_HOUR ) {
				
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
        System.out.println("Monthly Wage of Employee : "+empMonthlyWage);
    }
}

