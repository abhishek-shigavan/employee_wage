/**
 * EmployeeWageComputation --- Program to check Employee is 
 * 			       Present / Absent.
 * 
 * @author Abhishek Shigavan
 *
 */
public class EmployeeWageComputation {
	
	//constant variables
	public static final int IS_PRESENT =1;
/**
 * Checking & printing attendance
 * 
 * @return No return	
 */	
    public static void main(String[] args) {

            System.out.println("Welcome to Employee Wage Computation Program...!!");

            int empAttendance = (int)(Math.floor(Math.random() * 10)) % 2;
            
            //checking attendance
            if (empAttendance == IS_PRESENT) {
                    System.out.println("Employee is Present");
            }
            else {
                    System.out.println("Employee is Absent");
            }
    }
}

