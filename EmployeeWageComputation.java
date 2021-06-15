/**
 * EmployeeWageComputation --- Program to check Employee is 
 *                             Present / Absent & computing Daily Wage.
 * 
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables
	public static final int IS_PRESENT =1;
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

            int empAttendance = (int)(Math.floor(Math.random() * 10)) % 2;
            
            //checking attendance
            if (empAttendance == IS_PRESENT) {
            		empWorkHours =8;
                    System.out.println("Employee is Present");
            }
            else {
            		empWorkHours =0;
                    System.out.println("Employee is Absent");
            }
            
            //computing daily wage
            int empDailyWage = empWorkHours * WAGE_PER_HOUR;
            System.out.println("Daily Wage of Employee : "+empDailyWage);
    }
}

