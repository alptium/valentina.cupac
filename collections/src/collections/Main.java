package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Patient> patients = new ArrayList<Patient>();
		
		Patient patient1 = new Patient("asfas", "Ssfasgasg");
		Patient patient2 = new Patient("asfas", "Ssfasgasg");		
		Patient patient3 = new Patient("asfas", "Ssfasgasg");	
		Patient patient4 = new Patient("asfas", "Ssfasgasgsdggsdgsdhdsh");		
		
		try(Scanner scanner = new Scanner(System.in)) {
			String name = scanner.next();
			String surname = scanner.next();
			
			Patient patient = new Patient(name, surname);
			patients.add(patient);
		}
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(new Patient("sddsh4wet", "eswwywey"));
		
		for(Patient patient : patients) {
			System.out.println("Name: " + patient.getName());
			System.out.println("Surname: " + patient.getSurname());
		}
		
		for(int i = 0; i < patients.size(); i++) {
			Patient patient = patients.get(i);
			System.out.println("Position: " + (i + 1));
			System.out.println("Name: " + patient.getName());
			System.out.println("Surname: " + patient.getSurname());
		}
		
		int totalCount = patients.size();
		
		boolean containsPatient2 = patients.contains(patient2);
		boolean containsPatient4 = patients.contains(patient4);
		
		Patient firstPatient = patients.get(0);
		Patient secondPatient = patients.get(1);
		
		boolean isEmpty = patients.isEmpty();
		
		patients.remove(3);
		
		List<Patient> subList = patients.subList(0, 2);
		
		ArrayList<Patient> cloned = (ArrayList<Patient>) patients.clone();
		
		ArrayList<BankLoan> bankLoans = new ArrayList<>();
		bankLoans.add(new BankLoan("Bank loan1 ", 2000));
		bankLoans.add(new BankLoan("Bank loan2 ", 5000));
		
		ArrayList<Applicant> applicants = new ArrayList<>();
		applicants.add(new Applicant("Mary", "Smith", bankLoans.get(0), true));
		applicants.add(new Applicant("John", "Smith", bankLoans.get(1), false));
		applicants.add(new Applicant("Mike", "Smith", bankLoans.get(1), false));
		applicants.add(new Applicant("Mike", "Smith", bankLoans.get(0), true));
		
		
		for(Applicant applicant : applicants) {
			if(applicant.isAccepted()) {
				System.out.println("Name: " + applicant.getName());
			}
		}
		
		for(Applicant applicant : applicants) {
			if(!applicant.isAccepted()) {
				System.out.println("Name: " + applicant.getName());
			}
		}
		
		// DATABASE: 
		// TABLE: BankLoan
		// COLUMNS: Id, Name, MaxAmount
		
		// TABLE: Applicant
		// COLUMNS: Id, Name, Surname, BankLoanId (FK)
		
	}
	
	private static void RunDemo1() {
		int a = 5;
		System.out.println(a);
	}
	
	private static void RunDemo2() {

	}

}
