package org.alptium.valentinacupac.samples.arraysloops;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * PRIMITIVE TYPES
		 */
		
		// Primitive types
		
		int dsgsdg = 5; // integer (celoviti broj)
		double lala = 34.5352; // double precision floating number (informal: like decimal) -- decimalni broj 
		char tik = 'a'; // character (karakter / znak / simbol)
		boolean mdew = true; // boolean (sprksi?) - kondicional? / tacno/netacno / da/ne (true / false)
		
		int lala2 = 5; // creating box in memory (informal) ---- initialization & assignment
		lala2 = 7; // updating the value inside the box in memory (informal) ---- assignment
		lala2 = 100; // updating the value inside the box in memory (informal) ---- assignment
		
		boolean mek = true;
		mek = false;
		mek = true;
		mek = true;
		
		/*
		 * COMPOSITE TYPES
		 */
		
		// Composite types
		String wqrwe = "My name is Valentina"; // string = string of characters (string / textualni tip)
		// TODO: VC: Insert date example and other calendar types
		
		// Composite types - arrays (nizovi)
		
		
		String person0 = "Valentina";
		String person1 = "Marija";		
		String person2 = "Marko";	
		String person3 = "Djordje";
		/// etc.
		
		// Array of integers
		int[] accountIds = new int[4];
		accountIds[0] = 10001;
		accountIds[1] = 10002;
		accountIds[2] = 10003;
		accountIds[3] = 10004;
		
		// Array of strings (name of people who have a bank account)
		String[] people = new String[4]; // array of strings, containing space for 4 strings
		people[0] = "Valentina";
		people[1] = "Marija";
		people[2] = "Marko";
		people[3] = "Djordje";
		
		// Array of doubles (the bank account balance of those people)
		double[] balances = new double[4];
		balances[0] = 400.23;
		balances[1] = 800.24;
		balances[2] = 950.324;
		balances[3] = 28300.23;
		
		// Array of boolean values ()
		boolean[] haveLoans = new boolean[4];
		haveLoans[0] = true;
		haveLoans[1] = true;
		haveLoans[2] = false;
		haveLoans[3] = true;
		
		char[] genders = new char[4];
		genders[0] = 'F';
		genders[1] = 'F';
		genders[2] = 'M';
		genders[3] = 'M';
				
		// boolean variable have names starting with "is", "has", "have", etc. (upitne stavke)
		
		
		/*
		 * LOOPS
		 */
		
		// Without loops
		
		System.out.println("=====================================");
		System.out.println("These are the results WITHOUT loops");
		
		System.out.println(people[0]);
		System.out.println(people[1]);
		System.out.println(people[2]);
		System.out.println(people[3]);
		
		// With loops (petlja ----- ponavljanje neke operacije)

		System.out.println();
		System.out.println();
		System.out.println("=====================================");
		System.out.println("These are the results WITH loops");
		
		// Ovaj i sluzi kao "counter" (brojac)
		int i = 0; // box in memory, box name is i, its type is integer, and has value 0
		
		// dok / je
		while(i < 4) { // dok je i manje nego 4, odradi sve sto je izmedju zabrada { }
			System.out.println(people[i]); // ispisi element iz niza na poziciji i
			i = i + 1; /// EQUIVALENT TO: i++;
		}
		
		// program continues here now
		
		for(int j = 0; j < 4; j++) {
			System.out.println(people[j]); // ispisi element iz niza na poziciji i
		}
		
		// Pocni sa vrednoscu j: 0
		// Izvrsi komande unutra tela petlje
		// Uvecaj brojac za jedan (j++)
		// Ovo raditi sve dok je j < 4
	}

}
