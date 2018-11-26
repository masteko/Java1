package de.fhws.aufgabenblatt3;

public class Aufgabe4 {

	public static void main(String[] args) {
		String[] diceEyes = {"eins", "zwei", "drei", "vier", "fünf" , "sechs"};
		int diceEye = (int) (Math.random() * 3) ;
		System.out.println(diceEyes[diceEye] + " gewürfelt");
	}

}
