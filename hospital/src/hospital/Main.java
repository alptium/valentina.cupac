package hospital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to this hospital!");
		
		// Non Object Oriented Programming (non-OOP)
		runDemoNonOop1();
		runDemoNonOop2();

		// Object Oriented Programming (OOP)
		runDemoOop1();
		runDemoOop12(); // OOP with console reading in/out
		runDemoOop2();
	}
	
	private static void runDemoNonOop1() {
		System.out.println("Running Demo - Non Object Oriented - Single record...");
		
		String name = "Petar";
		String surname = "Petrovic";
		int birthYear = 1954;
		boolean isFullTimeEmployee = true;
		
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Year of Birth: " + birthYear);
		System.out.println("Is employed fulltime: " + isFullTimeEmployee);
	}
	
	private static void runDemoNonOop2() {
		System.out.println("Running Demo - Non Object Oriented - Multiple records...");
		
		String names[] = new String[3];
		String surnames[] = new String[3];
		int birthYears[] = new int[3];
		boolean areFulltimeEmployees[] = new boolean[3];
		
		names[0] = "Petar";
		names[1] = "Marija";
		names[2] = "Jovan";
		
		surnames[0] = "Petrovic";
		surnames[1] = "Marjanovic";
		surnames[2] = "Jovanovic";
		
		birthYears[0] = 1954;
		birthYears[1] = 1965;
		birthYears[2] = 1928;
		
		areFulltimeEmployees[0] = true;
		areFulltimeEmployees[1] = true;		
		areFulltimeEmployees[2] = false;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("=============================================");
			System.out.println("Name: " + names[i]);
			System.out.println("Surname: " + surnames[i]);
			System.out.println("Year of Birth: " + birthYears[i]);
			System.out.println("Is employed fulltime: " + areFulltimeEmployees[i]);
			System.out.println("=============================================");
		}
	}
	
	private static void runDemoOop1() {
		System.out.println("Running Demo - Object Oriented - Single record...");
		
		Doctor doctor = new Doctor("Petar", "Petrovic", 1954, true);
		
		System.out.println("=============================================");
		System.out.println("Name: " + doctor.getName());
		System.out.println("Surname: " + doctor.getSurname());
		System.out.println("Year of Birth: " + doctor.getBirthYear());
		System.out.println("Is employed fulltime: " + doctor.isFullTimeEmployee());
		System.out.println("=============================================");
	}
	
	private static void runDemoOop12() {
		System.out.println("Running Demo - Object Oriented - Single record...");
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the doctor name");
			String name = scanner.next();
			
			System.out.println("Enter the doctor surname");
			String surname = scanner.next();
			
			System.out.println("Enter the doctor birthyear");
			int birthYear = scanner.nextInt();
			
			System.out.println("Enter if the doctor is a full time employee (true/false)");
			boolean isFullTimeEmployee = scanner.nextBoolean();
			
			Doctor doctor = new Doctor(name, surname, birthYear, isFullTimeEmployee);
			
			System.out.println("=============================================");
			System.out.println("Name: " + doctor.getName());
			System.out.println("Surname: " + doctor.getSurname());
			System.out.println("Year of Birth: " + doctor.getBirthYear());
			System.out.println("Is employed fulltime: " + doctor.isFullTimeEmployee());
			System.out.println("=============================================");
		}
	}
	
	
	
	private static void runDemoOop2() {
		System.out.println("Running Demo - Object Oriented - Multiple records...");
		
		Doctor doctors[] = new Doctor[3];
		
		doctors[0] = new Doctor("Petar", "Petrovic", 1954, true);
		doctors[1] = new Doctor("Marija", "Marjanovic", 1965, true);
		doctors[2] = new Doctor("Jovan", "Jovanovic", 1928, false);
		
		for(int i = 0; i < 3; i++)
		{
			Doctor doctor = doctors[i];
			
			System.out.println("=============================================");
			System.out.println("Name: " + doctor.getName());
			System.out.println("Surname: " + doctor.getSurname());
			System.out.println("Year of Birth: " + doctor.getBirthYear());
			System.out.println("Is employed fulltime: " + doctor.isFullTimeEmployee());
			System.out.println("=============================================");
		}
	}
}
