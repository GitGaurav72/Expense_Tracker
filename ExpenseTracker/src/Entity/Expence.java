package Entity;

public class Expence {
	
	private Double expence;
	private String expenceType;
	public Double getExpence() {
		return expence;
	}
	public void setExpence(Double expence) {
		this.expence = expence;
	}
	public String getExpenceType() {
		return expenceType;
	}
	public void setExpenceType(String expenceType) {
		this.expenceType = expenceType;
	}
	public Expence(Double expence, String expenceType) {
		super();
		this.expence = expence;
		this.expenceType = expenceType;
	}
	public Expence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Expence [expence=" + expence + ", expenceType=" + expenceType + "]";
	}
	
	

}
