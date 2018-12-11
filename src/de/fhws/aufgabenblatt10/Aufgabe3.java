package de.fhws.aufgabenblatt10;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Aufgabe3
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = { "Programmiersprache", "Studium", "Hochhaus", "Schifffahrt", "Hörsaal" };
        int tries = 1;
        char c;
        char guess;
        String word = words[(int) (Math.random() * words.length)].toUpperCase();
        int gaps = word.length();
        char[] foundCharacters = new char[word.length()];

        do {
            System.out.print(tries++ + ". Versuch: ");
            for (int i = 0; i < foundCharacters.length; i++) {
                c = foundCharacters[i];
                System.out.print((c != '\u0000' ? c : '_') + " ");
            }
            System.out.println();
            guess = scanner.nextLine().toUpperCase().toCharArray()[0];

            for (int i = word.indexOf(guess); i >= 0; i = word.indexOf(guess, i + 1)) {
                foundCharacters[i] = word.charAt(i);
                gaps--;
            }
        } while(tries <= 15 && gaps > 0);

        scanner.close();
    }
}