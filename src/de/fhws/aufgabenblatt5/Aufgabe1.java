package de.fhws.aufgabenblatt5;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = 0.0;
        double g = 9.80665;
        int index = 1;

        System.out.println("Bitte Falldauer in Sekunden eingeben:");
        int duration = scanner.nextInt();

        while(duration - index > 0) {
            distance = 1.0/2.0 * g * Math.pow(index, 2);
            if (index % 6 == 0 || index == 1) {
            	System.out.println("Zeit: " + index + " Sekunden: Zurückgelegte Strecke: " + distance);            	
            }
            index++;
        }

        scanner.close();
    }
}
