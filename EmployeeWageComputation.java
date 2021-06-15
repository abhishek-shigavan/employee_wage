/**
 * EmployeeWageComputation --- Program to check Employee is Present / 
 * 		               Part Time / Absent & computing Daily Wage.
 * 
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables
	public static final int IS_PRESENT =1;
	public static final int IS_PART_TIME =2;
	public static final int WAGE_PER_HOUR =20;
/**
 * Checking attendance & accordingly
 * setting work hours.
 * Computing Daily Wage as per work hours.
 * Printing Daily Wage
 * 
 * @return No return	
 */	
    public static void main(String[] args) {
    		//local variables
    		int empWorkHours =0;
    		
            System.out.println("Welcome to Employee Wage Computation Program...!!");

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
            
            //computing daily wage
            int empDailyWage = empWorkHours * WAGE_PER_HOUR;
            System.out.println("Daily Wage of Employee : "+empDailyWage);
    }
}

