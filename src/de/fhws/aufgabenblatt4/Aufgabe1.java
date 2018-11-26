package de.fhws.aufgabenblatt4;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte gib deine Matrikelnummer ein");
		
		int input = scanner.nextInt();
		boolean isValidMatNo = (input >= 50e5 && input < 52e5) || (input >= 61e5 && input < 62e5);
		
		if (isValidMatNo) {
			System.out.println("Die Matrikelnummer ist gueltig");
		} else {
			System.out.println("Bitte geben Sie eine gueltige Matrikelnummer ein (7 Stellen, startet mit 50, 51 oder 61)");
		}
		
		scanner.close();
	}

}
