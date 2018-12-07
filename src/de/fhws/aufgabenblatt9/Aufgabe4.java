package de.fhws.aufgabenblatt9;

/**
 * Aufgabe4
 */
public class Aufgabe4 {

    public static void main(String[] args) {
        char[] a = {'c', 'd', 'e'};
        char[] b = {'1', 'u'};
        char[] aundb = konkatenieren(a, b);

        for (int i = 0; i < aundb.length; i++) {
            System.out.println(aundb[i]);
        }
    }

    public static char[] konkatenieren(char[] a, char[] b) {
        char[] result = new char[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}