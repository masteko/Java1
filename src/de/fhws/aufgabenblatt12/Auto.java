package de.fhws.aufgabenblatt12;

/**
 * Auto
 */
public class Auto {
    private static int produzierteAutos = 0;
    private String marke;
    private double hubraum;
    private String farbe;
    private int anzahlTueren;
    private String motorTyp;

    public Auto(String marke, double hubraum, String farbe, int anzahlTueren, String motorTyp)  {
        this.marke = marke;
        this.hubraum = hubraum;
        this.farbe = farbe;
        this.anzahlTueren = anzahlTueren;
        this.motorTyp = motorTyp;
        produzierteAutos++;
    }

    public static double berechneUmsatz(int durchschnittspreis) {
        return durchschnittspreis * produzierteAutos;
    }

    public static Auto groessterHubraum(Auto[] Autos) {
        if (Autos.length == 0) {
            throw new RuntimeException("Keine Autos übergeben");
        }
        Auto result = Autos[0];
        for (int i = 1; i < Autos.length; i++) {
            if (result.hubraum < Autos[i].hubraum) {
                result = Autos[i];
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Marke: " + this.marke + ", Hubraum: " + this.hubraum + "l, Farbe: " + this.farbe + ", mit " + this.anzahlTueren + " Türen und einem " + this.motorTyp + " Motor.";
    }
}