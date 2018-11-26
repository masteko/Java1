package de.fhws.aufgabenblatt6;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Basis ein:");
		double basis = scanner.nextDouble();
		System.out.println("Geben Sie den Exponent ein:");
		int exponent = scanner.nextInt();
		
		System.out.println(basis + " hoch " + exponent + " ergibt " + potenz(basis, exponent));
		
		scanner.close();
	}
	
	public static double potenz(double a, int b) {
		double result = a;
		
		if (b == 0)	return 1;

		for (int i = 1; i < b; i++) {
			result *= a;
		}
		
		if (b < 0) result = 1/ result;
		
		return result;
	}
}