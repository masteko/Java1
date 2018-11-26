package de.fhws.aufgabenblatt4;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte gib ein Jahr ein");
		int input = scanner.nextInt();
		boolean multipleOf4 = input % 4 == 0;
		boolean multipleOf100 = input % 100 == 0;
		boolean multipleOf400 = input % 400 == 0;
		
		if (!multipleOf4) {
			System.out.println(input + " ist kein Schaltjahr, da nicht ganzzahlig durch 4 teilbar");
		} else if (!multipleOf100) {
			System.out.println(input + " ist ein Schaltjahr, da ganzzahlig durch 4 teilbar");
		} else if (!multipleOf400) {
			System.out.println(input + " ist kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht durch 400");
		} else {
			System.out.println(input + " ist ein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber auch durch 400");
		}
		
		scanner.close();
	}

}
