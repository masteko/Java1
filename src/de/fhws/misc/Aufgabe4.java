package de.fhws.misc;

/**
 * Aufgabe4
 */
public class Aufgabe4 {
    public static void main(String[] args) {
        Fach[] faecher = erzeugeFaecher(100);
        printFaecher(faecher);
        abendroutinte(faecher);
        System.out.println(anzahlOffeneFaecher(faecher));
    }

    public static Fach[] erzeugeFaecher(int count) {
        Fach[] result = new Fach[count];

        for (int i = 0; i < count; i++) {
            result[i] = new Fach(i + 1); // + 1 da wir bei 0 starten, das erste Fach aber 1 ist.
        }

        return result;
    }

    public static void printFaecher(Fach[] faecher) {
        for (int i = 0; i < faecher.length; i++) {
            System.out.print(faecher[i]);
        }
        System.out.println(); //mache zur Übersichtlichkeit danach einen Zeilenumbruch
    }

    public static void abendroutinte(Fach[] faecher) {
        for (int i = 0; i < 100; i++) { //das sind die 100 Durchgänge des Hausmeisters
            for (int j = 0; j < faecher.length; j++) {
                if (i == 0) { //erster Durchgang -> alle öffnen
                    faecher[j].setOpen(true);
                } else { // alle weiteren Durchgänge
                    if ((j + 1) % (i + 1) == 0) {
                        faecher[j].setOpen(!faecher[j].isOpen()); //toggle den open status
                    }
                }
            }
            printFaecher(faecher);
        }
    }

    public static int anzahlOffeneFaecher(Fach[] faecher) {
        int sum = 0;

        for (int i = 0; i < faecher.length; i++) {
            sum += faecher[i].isOpen() ? 1 : 0;
        }

        return sum;
    }
}