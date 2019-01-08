package de.fhws.aufgabenblatt12;

/**
 * Aufgabenblatt1
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        Auto[] autos = new Auto[3];
        autos[1] = new Auto("Porsche", 3, "Weiss", 3, "Benzin");
        autos[0] = new Auto("VW", 1.8, "Blau", 3, "Diesel");
        autos[2] = new Auto("BMW", 2, "Pink", 5, "Benzin"); 

        System.out.println(Auto.berechneUmsatz(60));
    }
}