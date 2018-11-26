package de.fhws.aufgabenblatt5;

public class Aufgabe2 {

	public static void main(String[] args) {
		double summe = 0.0;
		double summand = 0.0;
		int index = 1;
		
		do {
			summand = 1.0 / Math.pow(index++, 2);
			summe += summand;
			System.out.println("Summand: " + summand + " Summe: " + summe);
		} while(summand > 10e-5);
		
		System.out.println("Summe: " + summe + " mal 6 ergibt: " + 6 * summe);

	}

}
