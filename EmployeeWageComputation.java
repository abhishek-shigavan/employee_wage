public class EmployeeWageComputation {

	public static void main(String[] args) {

		final int isPresent=1;
		final int isPartTime=2;
		int wagePerHour=20;
		int empWorkingHour;
		int empDailyWage;
		int workingDayPerMonth=20;
		int empInitialWage=0;
		int empMonthlyWage=0;

		System.out.println("Welcome to Employee Wage Computation Program...!!");

		for(int i=1; i<=workingDayPerMonth; i++) {
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

		empDailyWage = wagePerHour * empWorkingHour ;
		System.out.println("Daily Wage of Employee : " +empDailyWage);
		empMonthlyWage = empDailyWage + empInitialWage ;
		empInitialWage = empMonthlyWage ;

	}
		System.out.println("Monthly Wage of Employee : " +empMonthlyWage);
	}
}
