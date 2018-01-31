package org.alptium.valentinacupac.samples.multiplier;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Input the first number: ");
			int firstNumber = scanner.nextInt();
			
			System.out.println("Input the second number: ");
			int secondNumber = scanner.nextInt();
			
			System.out.println("System is now doing the calculation...");
			int product = firstNumber * secondNumber;
			
			System.out.println("Result of multiplication " + firstNumber + " * " + secondNumber + " is: " + product);	
		}
	}

}
