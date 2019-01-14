package de.fhws.aufgabenblatt12;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        Raum r1 = new Raum("I.2.15", 60);
        Raum r2 = new Raum("I.2.1", 25);
        Student s1 = new Student("Michael");
        Student s2 = new Student("Petra");

        r1.betreteRaum(s1);
        System.out.println(r1.toString());
        
        r1.betreteRaum(s2);
        System.out.println(r1.toString());
        
        r1.verlasseRaum(s2);
        System.out.println(r1.toString());
    }
}