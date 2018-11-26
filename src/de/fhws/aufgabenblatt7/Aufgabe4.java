package de.fhws.aufgabenblatt7;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		print(scanner.nextInt());
		scanner.close();
	}
	
	public static void print(int x) {
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j < x - i; j++) {
				System.out.print(" ");				
			}
			for(int z = 0; z < i; z++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
