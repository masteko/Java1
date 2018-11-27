package de.fhws.aufgabenblatt8;

import java.util.Scanner;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe der Zahl:");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Zahl muss groesser null sein");
        } else {
            char[] numberArray = String.valueOf(number).toCharArray();
            System.out.println("Eingabe der Sterne:");
            int stars = scanner.nextInt();
    
            if (stars < 0) {
                System.out.println("Zahl muss groesser gleich null sein");
            } else {
                for (int i = numberArray.length - 1; i >= 0 ; i--) {
                    System.out.print(numberArray[i]);
        
                    if (i == 0) break;
                    for (int j = 0; j < stars; j++) {
                        System.out.print("*");
                    }
                }
            }
        }

        scanner.close();
    }
}