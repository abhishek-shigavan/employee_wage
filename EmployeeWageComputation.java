public class EmployeeWageComputation {

	public static void main(String[] args) {

		final int isPresent = 1;
		final int isPartTime =2;
		int wagePerHour = 20;
		int empWorkingHour;

		System.out.println("Welcome to Employee Wage Computation Program...!!");

		int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;

		switch (empCheck) {
		case isPresent: {
			empWorkingHour =8;
			System.out.println("Employee is Present");
			break;
		}

		case isPartTime: {
			empWorkingHour =4;
			System.out.println("Employee is Part Time Present");
			break;
		}
		default:
			empWorkingHour =0;
			System.out.println("employee is Absent");
		}

		int empDailyWage = wagePerHour * empWorkingHour ;

		System.out.println("Daily wage of Employee: "+empDailyWage);
	}
}
