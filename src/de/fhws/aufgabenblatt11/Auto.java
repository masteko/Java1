package de.fhws.aufgabenblatt11;

/**
 * Auto
 */
public class Auto {
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
    }

    public static Auto groessterHubraum(Auto[] autos) {
        Auto result = autos[0];
        for (int i = 1; i < autos.length; i++) {
            if (result.hubraum < autos[i].hubraum) {
                result = autos[i];
            }
        }

        return result;
    }

    public String toString() {
        return "Marke: " + this.marke + ", Hubraum: " + this.hubraum + "l, Farbe: " + this.farbe + ", mit " + this.anzahlTueren + " Türen und einem " + this.motorTyp + " Motor.";
    }
}