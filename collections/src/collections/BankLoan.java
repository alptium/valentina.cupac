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

	public double getMaxAmount() {
		return maxAmount;
	}
}
