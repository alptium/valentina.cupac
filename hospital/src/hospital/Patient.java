package hospital;

public class Patient {
	private String name;
	private String surname;
	private String illness;
	
	public Patient(String name, String surname, String illness) {
		this.name = name;
		this.surname = surname;
		this.illness = illness;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}
}
