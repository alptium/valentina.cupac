package hospital;

public class Doctor extends Person {
	
	private int birthYear;
	private boolean isFullTimeEmployee;
	
	// Constructor for the class Doctor
	
	public Doctor(String name, String surname, int birthYear, boolean isFullTimeEmployee) {
		super(name, surname);
		
		this.birthYear = birthYear;
		this.isFullTimeEmployee = isFullTimeEmployee;
	}

	// Methods of the class Doctor
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public boolean isFullTimeEmployee() {
		return isFullTimeEmployee;
	}
	
	public void examinePatient() {
		System.out.println("Examining patient...");
	}
	
	public void diagnoseIllness() {
		System.out.println("Diagnosing illness...");
	}
	
	public void prescribeTherapy() {
		System.out.println("Prescribing therapy...");
	}
}
