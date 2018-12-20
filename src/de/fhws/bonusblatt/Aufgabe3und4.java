package de.fhws.bonusblatt;

/**
 * Aufgabe3
 */
public class Aufgabe3und4 {

    public static void main(String[] args) {
        Raum r1 = new Raum("I.2.15", 60);
        Raum r2 = new Raum("I.2.1", 25);
        Vorlesung v = new Vorlesung("Grundlagen der Menschenmanipulation", "Prof. Dr. Arsch", "Besserwisserei");

        System.out.println("Raum " + r1.getKennung() + " ist " + (r1.istRaumBelegt() != null ? "durch " + r1.istRaumBelegt().getName() + " belegt" : "noch frei"));
        System.out.println("Raum " + r2.getKennung() + " ist " + (r2.istRaumBelegt() != null ? "durch " + r2.istRaumBelegt().getName() + " belegt" : "noch frei"));
        
        r2.belegeRaum(v);
        
        System.out.println("Raum " + r1.getKennung() + " ist " + (r1.istRaumBelegt() != null ? "durch " + r1.istRaumBelegt().getName() + " belegt" : "noch frei"));
        System.out.println("Raum " + r2.getKennung() + " ist " + (r2.istRaumBelegt() != null ? "durch " + r2.istRaumBelegt().getName() + " belegt" : "noch frei"));
    }
}