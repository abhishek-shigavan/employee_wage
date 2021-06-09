public class EmployeeWageComputation {

	public static void main(String[] args) {

		int isPresent = 1;
		int isPartTime =2;
		int wagePerHour = 20;
		int empWorkingHour;

		System.out.println("Welcome to Employee Wage Computation Program...!!");

		int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;

		if (empCheck == isPresent) {
			empWorkingHour = 8;
			System.out.println("Employee is Present");
		}
		else if (empCheck == isPartTime) {
			empWorkingHour = 4;
			System.out.println("Employee is Part Time Present");
		}
		else {
			empWorkingHour = 0;
			System.out.println("Employee is Absent");
		}

		int empDailyWage = wagePerHour * empWorkingHour ;

		System.out.println("Daily wage of Employee: "+empDailyWage);
	}
}

