package de.fhws.aufgabenblatt3;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int r = input % 7;
		
		if (r == 0) {
			System.out.println("Die Zahl ist durch 7 teilbar" + r);
		} else {
			System.out.println("Die Zahl ist nicht durch 7 teilbar" + r);
		}
		
		scanner.close();
	}

}
