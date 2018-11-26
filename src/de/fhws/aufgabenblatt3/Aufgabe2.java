package de.fhws.aufgabenblatt3;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double output;
		
		System.out.println("Bitte gebe den Durchmesser an");
		double d1 = scanner.nextDouble();
		
		System.out.println("Bitte gebe den Preis an");
		double p1 = scanner.nextDouble();

		System.out.println("Bitte gebe den Durchmesser der 2. Pizza an");
		double d2 = scanner.nextDouble();
		
		System.out.println("Bitte gebe den Preis der 2. Pizza an");
		double p2 = scanner.nextDouble();

		double a1 = Math.pow(d1/2, 2) * Math.PI;
		double a2 = Math.pow(d2/2, 2) * Math.PI;
		
		if (a1/p1 > a2/p2) {
			output = d1;
		} else {
			output = d2;
		}
		
		System.out.println("Die Pizza mit dem Durchmesser " + output + "cm hat das bessere Grössen-/Preisverhältnis");
		scanner.close();
	}
}
