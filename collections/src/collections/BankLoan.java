package collections;

public class BankLoan {
	private String name;
	private double maxAmount;
	
	public BankLoan(String name, double maxAmount) {
		this.setName(name);
		this.setMaxAmount(maxAmount);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getMaxAmount() {
		return maxAmount;
	}
	
	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}
}
