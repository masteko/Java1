package de.fhws.aufgabenblatt11;

/**
 * Aufgabe1
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(ziffernZaehlen("Im Jahre 1492 segelte Columbus nach Indien.".toCharArray()));
    }

    public static int ziffernZaehlen(char[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                sum++;
            }
        }
        return sum;
    }
}