package de.fhws.aufgabenblatt7;

import java.util.Scanner;

public class Aufgabe3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl ein:");
		System.out.println(faculty(scanner.nextInt()));
		scanner.close();
	}
	
	private static int faculty(int x) {
		int result = 1;
		for (int i = 2; i <= x; i++) {
			result *= i;
		}
		return result;
	}
}
