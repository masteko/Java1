package de.fhws.bonusblatt;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        Uhr[] weltzeit = new Uhr[24];

        for (int i = 0; i < weltzeit.length; i++) {
            weltzeit[i] = new Uhr(i, 23, 7);
        }

        for (int i = 0; i < weltzeit.length; i++) {
            System.out.println(weltzeit[i].toString());
            weltzeit[i].naechsteSek();
            System.out.println(weltzeit[i].toString());
        }
    }
}