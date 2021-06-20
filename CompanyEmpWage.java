/**
 * CompanyEmpWage -- Defining Properties of Company
 * 					 & method to get & set values of properties
 *  
 * @author Abhishek Shigavan
 *
 */
public class CompanyEmpWage {
	
	//instance variables
	private String company_Name;
	private int wage_Per_Hour;
	private int working_Day_Per_Month;
	private int max_Working_Hour;
	private int empMonthlyWage;
	
	public CompanyEmpWage() {
	
	}

	public CompanyEmpWage(String company_Name, int wage_Per_Hour, int working_Day_Per_Month, int max_Working_Hour) {
		
		this.company_Name = company_Name;
		this.wage_Per_Hour = wage_Per_Hour;
		this.working_Day_Per_Month = working_Day_Per_Month;
		this.max_Working_Hour = max_Working_Hour;
	}
	

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public int getWage_Per_Hour() {
		return wage_Per_Hour;
	}

	public void setWage_Per_Hour(int wage_Per_Hour) {
		this.wage_Per_Hour = wage_Per_Hour;
	}

	public int getWorking_Day_Per_Month() {
		return working_Day_Per_Month;
	}

	public void setWorking_Day_Per_Month(int working_Day_Per_Month) {
		this.working_Day_Per_Month = working_Day_Per_Month;
	}

	public int getMax_Working_Hour() {
		return max_Working_Hour;
	}

	public void setMax_Working_Hour(int max_Working_Hour) {
		this.max_Working_Hour = max_Working_Hour;
	}

	public int getEmpMonthlyWage() {
		return empMonthlyWage;
	}

	public void setEmpMonthlyWage(int empMonthlyWage) {
		this.empMonthlyWage = empMonthlyWage;
	}
	//object print format
	@Override
	public String toString() {
		return "CompanyEmpWage [Company Name = " + company_Name + ", Employee Monthly Wage = " + empMonthlyWage + "]";
	}
}
