package de.fhws.aufgabenblatt6;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValidInput = false;
		int input;
		int rest;
		int product = 1;
		
		System.out.println("Geben Sie bitte eine Zahl ein:");
		
		do {
			input = scanner.nextInt();
			
			if (input >= 0 && input <= 1e6) {
				isValidInput = true;
			} else {
				System.out.println("FEHLER - Zahl ist ungueltig.");
			}			
		} while (!isValidInput);
		
		rest = input;
		
		do {
			product *= rest % 10;
			rest /= 10;
		} while (rest != 0);
		
		System.out.println("Das Querprodukt der Zahl " + input + " betraegt " + product);
		
		scanner.close();
	}
}
