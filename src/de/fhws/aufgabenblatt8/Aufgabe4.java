package de.fhws.aufgabenblatt8;

import java.util.Scanner;

/**
 * Aufgabe4
 */
public class Aufgabe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die Zahl ein:");
        double x = scanner.nextDouble();
        System.out.println(sinus(x));
        System.out.println(Math.sin(x));
        scanner.close();
    }
 
    private static double sinus(double x) {
        double zaehler = x;
        double nenner = 1;
        double summe = x / 1; 
        double summand = x / 1;

        for (int i = 1; summand > 1E-15 || summand < -1E-15; i+=1) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * (i * 2) * (i * 2 + 1);
            summand = zaehler / nenner;
            summe += summand;
        }

        return summe;
    }
}