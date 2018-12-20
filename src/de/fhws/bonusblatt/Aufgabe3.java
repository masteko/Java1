package de.fhws.bonusblatt;

/**
 * Aufgabe3
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        Raum r1 = new Raum("I.2.15", 60);
        Raum r2 = new Raum("I.2.1", 25);

        System.out.println("Raum " + r1.getKennung() + " ist " + (r1.istRaumBelegt() ? "belegt" : "noch frei"));
        System.out.println("Raum " + r2.getKennung() + " ist " + (r2.istRaumBelegt() ? "belegt" : "noch frei"));
        
        r2.belegeRaum();
        
        System.out.println("Raum " + r1.getKennung() + " ist " + (r1.istRaumBelegt() ? "belegt" : "noch frei"));
        System.out.println("Raum " + r2.getKennung() + " ist " + (r2.istRaumBelegt() ? "belegt" : "noch frei"));
    }
}