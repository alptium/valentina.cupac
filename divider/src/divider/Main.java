package divider;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Input the first number: ");
			int firstNumber = scanner.nextInt();
			
			System.out.println("Input the second number: ");
			int secondNumber = scanner.nextInt();
			
			System.out.println("System is now doing the calculation...");
			int quotient = firstNumber / secondNumber;
			
			System.out.println("Result of division " + firstNumber + " / " + secondNumber + " is: " + quotient);	
		}
		
	}

}
