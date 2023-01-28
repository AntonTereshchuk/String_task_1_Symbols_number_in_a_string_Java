package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String enteredString;
		int symbolsNumber = 0;
		
		System.out.println("Please enter a string: ");
		enteredString = sc.nextLine();
		
		char[] stringSymbols = enteredString.toCharArray();
		
		for (int i = 0; i < stringSymbols.length; i++) {
			if (stringSymbols[i] == 'b') {
				symbolsNumber += 1;
			}
		}
		
		System.out.println();
		System.out.println("Symbols number in the string: " + symbolsNumber);
		sc.close();
	
	}

}
