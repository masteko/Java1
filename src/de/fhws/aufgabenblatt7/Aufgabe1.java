package de.fhws.aufgabenblatt7;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Basis ein:");
		double b = scanner.nextDouble();
		System.out.println("Geben Sie den Exponent ein:");
		int e = scanner.nextInt();
		
		System.out.println(exponent(b,e));
		
		scanner.close();
	}
	
	public static double exponent(double b, int n) {
		return n == 0 ? 1 : b * exponent(b, n - 1);
	}

}
