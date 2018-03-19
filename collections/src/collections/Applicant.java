package collections;

public class Applicant {
	private String name;
	private String surname;
	private BankLoan bankLoan;
	private boolean isAccepted;
	
	public Applicant(String name, String surname, BankLoan bankLoan, boolean isAccepted) {
		this.name = name;
		this.surname = surname;
		this.bankLoan = bankLoan;
		this.isAccepted = isAccepted;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public BankLoan getBankLoan() {
		return bankLoan;
	}
	
	public boolean isAccepted() {
		return isAccepted;
	}
}
