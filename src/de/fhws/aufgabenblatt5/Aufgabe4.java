package de.fhws.aufgabenblatt5;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte gib eine Zahl ein: ");
		int x = scanner.nextInt();
		boolean istPrimzahl = true;
		
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				istPrimzahl = false;
				break;
			}
		}
		
		System.out.println(x + " ist " + (istPrimzahl ? "eine" : "keine") + " Primzahl");
		
		scanner.close();
	}

}
