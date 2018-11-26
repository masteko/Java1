package de.fhws.aufgabenblatt4;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int output = 0;
		char first;
		char second;
		
		System.out.println("Gib die 1. Aussage ein (t/f)");
		do {
			first = scanner.nextLine().charAt(0);
			if (first != 116 && first != 102) {
				System.out.println("keine Gültige eingabe, nur 't' oder 'f' erlaubt");
			}
		} while (first != 116 && first != 102);
		
		System.out.println("Gib die 2. Aussage ein (t/f)");
		do {
			second = scanner.nextLine().charAt(0);
			if (second != 116 && second != 102) {
				System.out.println("keine Gültige eingabe, nur 't' oder 'f' erlaubt");
			}
		} while (second != 116 && second != 102);
		
		output += first == 116 ? 2 : 0;
		output += second == 116 ? 1 : 0;

		System.out.println(output);
		
		scanner.close();		
	}

}
