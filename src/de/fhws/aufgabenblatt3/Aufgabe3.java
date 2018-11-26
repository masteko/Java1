package de.fhws.aufgabenblatt3;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char input = scanner.nextLine().charAt(0);
		String output = "";
		
		if (input >= 65 && input <= 90) {
			output += "Großbuchstabe, ";
		}
		
		if (input == 48 || input == 49) {
			output += "binäre Ziffer, ";
		}
		
		if (input >= 48 && input <= 55) {
			output += "oktale Ziffer, ";			
		}
		
		if (input >= 48 && input <= 57 || 
			input >= 65 && input <= 70 ||
			input >= 97 && input <= 102) {
			output += "hexadezimale Ziffer, ";
		}
		
		if (output.equals("")) {
			System.out.println("Unbekannt");
		} else {
			System.out.println(output.substring(0, output.length() - 2));
		}		
		
		scanner.close();
	}

}
