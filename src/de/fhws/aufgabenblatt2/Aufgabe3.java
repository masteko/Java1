package de.fhws.aufgabenblatt2;

public class Aufgabe3 {

	public static void main(String[] args) {
		double p = 6;
		double q = 5;
		
		double discriminant = Math.sqrt((Math.pow((p/2), 2) - q));
		
		double result1 = -p/2 + discriminant;
		double result2 = -p/2 - discriminant;
		
		System.out.println("Die Ergebnisse lauten: " + result1 + " und " + result2);
	}

}
