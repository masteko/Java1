package de.fhws.aufgabenblatt4;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie die Stunden ein:");
		int hours = scanner.nextInt();
		
		System.out.println("Geben Sie die Minuten ein:");
		int minutes = scanner.nextInt();

		System.out.println("Geben Sie die Sekunden ein:");
		int seconds = scanner.nextInt();
		
		if (hours < 0 || minutes < 0 || seconds < 0 || hours > 23 || minutes > 59 || seconds > 59) {
			System.out.printf("%02d:%02d:%02d ist keine gültige Uhrzeit", hours, minutes, seconds);
		} else {
			System.out.printf("%02d:%02d:%02d ist eine gültige Uhrzeit", hours, minutes, seconds);
		}
		
		scanner.close();
	}

}
