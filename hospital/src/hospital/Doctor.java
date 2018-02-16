package hospital;

public class Doctor {
	
	// Attributes of the class Doctor
	
	private String name;
	private String surname;
	private int birthYear;
	private boolean isFullTimeEmployee;
	
	// Constructor for the class Doctor
	
	public Doctor(String name, String surname, int birthYear, boolean isFullTimeEmployee) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.isFullTimeEmployee = isFullTimeEmployee;
	}

	// Methods of the class Doctor
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
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
