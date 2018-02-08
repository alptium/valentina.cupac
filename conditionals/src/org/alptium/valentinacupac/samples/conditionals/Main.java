package org.alptium.valentinacupac.samples.conditionals;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * IF STATEMENTS
		 */
		
		
		// Comparison operators
		
		// < Less than
		// <= Less than or equal to
		// > Greater than
		// >= Greater than or equal to
		
		// Equality operators
		// == Equal to
		// != Not equal to
		
		// Boolean operations
		// && "AND"
		// || "OR"
		// ! "NOT"
		
		
		
		double salary = 200.34; // salary in EUR
		char nameInitial = 'F';
		int age = 18; 
		boolean isEmployed = true;
		boolean isChild = false;
		
		// Simple: only salary is condition
		
		if(salary > 300.56) { // vece od / greater than
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: must have both salary "AND" the name initial letter is 'F'
		
		if(salary > 300.56 && nameInitial == 'F') {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: if either the person has minimum required salary, "OR" age is 18
		if(salary > 300.56 || age == 18) {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: if either the person has minimum required salary, "OR" age is greater than or equal 18 
		if(salary > 300.56 || age >= 18) {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: if either the person has minimum required salary, "OR" age is (strictly) greater than 18 
		if(salary > 300.56 || age > 18) {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: if either the person has minimum required salary, "AND" person is employed 
		if(salary > 300.56 && isEmployed) {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// complex: if either the person has minimum required salary, "AND" person is "NOT" a child 
		if(salary > 300.56 && !isChild) {
			System.out.println("Your loan has been approved");
		} else {
			System.out.println("Your loan has been declined / rejected.");
		}
		
		// TODO: combine with arays
		
		
		// account manager for Social Networking, who makes accounts for people on Facebook
		
		// conditions - "Requirements document: ": person must have access to internet, must have electronic device, must have at least 12 years old
		// Translated to "Technical specifications": has internet access AND has electronic device AND is at least 12 years old
		
		// Use joining words: AND (&&) / OR (||) / NOT (!)
		
		// Naming rule: no spaces allowed, must start with letter
		
		// Naming convention (standardization) - Java / C# "camelCase" start with lowercase, and all other words with uppercase
		// Other languages: C: has_internet_access
		
		boolean hasinternetaccess = false;
		boolean HASINTERNETaccess = false;
		boolean HAS_INTERNET_access = false;
		
		
		boolean hasInternetAccess = false;
		boolean hasElectronicDevice = true;
		int age2 = 19;
		
		
		
		
		// At least 12 years old
		// >=            Age "Greater than or equal to" 12
		
		// < Less than
		// <= Less than or equal to
		// > Greater than
		// >= Greater than or equal to
		
		// Equality operators
		// == Equal to
		// != Not equal to
		
		// Boolean operations
		// && "AND"
		// || "OR"
		// ! "NOT"
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		if(hasInternetAccess && hasElectronicDevice && age2 >= 12) {
			System.out.println("Your account has been created.");
		} else {
			System.out.println("Your account has not been created.");
		}
		
		
		// SUMMARY ----- foundations of programming
		// data in memory (variables - boxes in memory)
		// --- integers, characters, strings, etc.
		// operations on that data (addition, subtraction, multiplication, vision)
		// Boolean logic ---- used for if-else
		// Repetition: loops ---- repeat some actions while a condition is true
		
		
		
	}

}
