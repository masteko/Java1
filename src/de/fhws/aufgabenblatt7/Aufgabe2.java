package de.fhws.aufgabenblatt7;

public class Aufgabe2 {

	public static void main(String[] args) {
		System.out.println(round(-4.4));
		System.out.println(Math.round(-4.4));
		System.out.println(round(-4.6));
		System.out.println(Math.round(-4.6));
		System.out.println(round(1.999, 1));
	}

	public static int round(double n) {
		return (int) n + (int) (n * 10 % 10 / 5);
		// return (int) n + 0.5; is the shortest solution i could think of, but just for positive numbers
	}

	public static double round(double n, int i) {
		double e = Double.parseDouble(1 + "e" + i); //parseDouble is required to use the scientific "e" with variables
		return round(n * e) / e;
	}
}
