package de.fhws.aufgabenblatt8;

/**
 * Aufgabe3
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        System.out.println(gebrochenerAnteil(34.029));
        System.out.println(gebrochenerAnteil(-4.19));
        System.out.println(gebrochenerAnteil(0.001));
    }

    private static double gebrochenerAnteil(double x) {
        String[] doubleArray = String.valueOf(x).split("\\.");
        return (Integer.valueOf(doubleArray[0]) >= 0 ? 1 : -1) * Double.valueOf("0." + doubleArray[1]);
    }
}