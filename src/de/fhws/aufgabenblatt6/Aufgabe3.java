package de.fhws.aufgabenblatt6;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Anzahl der Rechtecke für die Näherung ein:");
		int input = scanner.nextInt();
		
		double estimatedPi = 1d/input;

		for (int i = 1; i < input; i++) {
			estimatedPi += (Math.sqrt(1 - Math.pow((1d/input * i), 2)) * 1d/input);
		}
		
		estimatedPi *= 4;
		
		System.out.println("Pi ist geschaetzt: " + estimatedPi);
		
		scanner.close();
	}

}
