public interface EmpWageInterface {
	
	public void addCompanyEmpWage(String company_Name, int wage_Per_Hour, int working_Day_Per_Month, int max_Working_Hour);
	
	public void computeEmpWage();

	public void viewDailyWageRecord();

}
