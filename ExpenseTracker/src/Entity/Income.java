package Entity;

public class Income {
	
	private Double income;
	private String incomeType;
	
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public String getIncomeType() {
		return incomeType;
	}
	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}
	public Income() {
		super();
		
	}
	public Income(Double income, String incomeType) {
		super();
		this.income = income;
		this.incomeType = incomeType;
	}
	@Override
	public String toString() {
		return "Income [income=" + income + ", incomeType=" + incomeType + "]";
	}
	
	

}
