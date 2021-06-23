/**
 * CompanyWageStore -- This class defines properties 
 * 		       to store daily wage record & defines
 * 		       get & set method 	
 * 			
 * @author Abhishek Shigavan
 *
 */
public class CompanyWageStore {
	
	private String company_Name;
	private int day_No;
	private int daily_Wage;
	private int total_Wage;
	
	public CompanyWageStore() {
		
	}

	public CompanyWageStore(String company_Name, int day_No, int daily_Wage, int total_Wage) {
		
		this.company_Name = company_Name;
		this.day_No = day_No;
		this.daily_Wage = daily_Wage;
		this.total_Wage = total_Wage;
	}

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public int getDay_No() {
		return day_No;
	}

	public void setDay_No(int day_No) {
		this.day_No = day_No;
	}

	public int getDaily_Wage() {
		return daily_Wage;
	}

	public void setDaily_Wage(int daily_Wage) {
		this.daily_Wage = daily_Wage;
	}

	public int getTotal_Wage() {
		return total_Wage;
	}

	public void setTotal_Wage(int total_Wage) {
		this.total_Wage = total_Wage;
	}

	@Override
	public String toString() {
		return "CompanyWageStore [Company Name = " + company_Name + ", Day No = " + day_No + ", Daily Wage = " + daily_Wage
				+ ", Total Wage = " + total_Wage + "]";
	}
}
