package de.fhws.aufgabenblatt6;

public class Aufgabe1 {
	public static void main(String[] args) {
		System.out.println("Fahrenheit\t\tCelsius");			
		for (int i = 0; i <= 300; i++) {
			float celsius = (5/9f) * (i - 32);
			System.out.printf("%d\t\t\t%.2f\n", i, celsius);
		}
	}
}
