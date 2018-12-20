package de.fhws.bonusblatt;

/**
 * Aufgabe1
 */
public class Aufgabe1 {

    public static void main(String[] args) {
        Uhr uhr = new Uhr(24, 23, 34);
        Uhr u = new Uhr(23, 59, 59);

        System.out.println(uhr.getTagesSek());
        System.out.println(u.getTagesSek());
        
        u.setUhr(0, 0, 0);
        System.out.println(u.toString());

        for (int i = 0; i < 24 * 3600; i++) {
            u.naechsteSek();
            System.out.println(u.toString());
        }
    }
}