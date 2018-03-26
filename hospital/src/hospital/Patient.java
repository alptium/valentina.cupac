package hospital;

public class Patient extends Person {
	private String illness;
	
	public Patient(String name, String surname, String illness) {
		super(name, surname);
		
		this.illness = illness;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}
}
