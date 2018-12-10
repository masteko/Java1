package de.fhws.aufgabenblatt9;

/**
 * Aufgabe4
 */
public class Aufgabe4 {

    public static void main(String[] args) {
        char[] a = {'c', 'd', 'e'};
        char[] b = {'1', 'u'};
        char[] aundb = konkatenieren(a, b);

        System.out.println(String.valueOf(aundb));
    }

    public static char[] konkatenieren(char[] a, char[] b) {
        return (String.valueOf(a) + String.valueOf(b)).toCharArray();
    }
}