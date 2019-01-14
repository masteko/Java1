package de.fhws.aufgabenblatt12;

/**
 * Raum
 */
public class Raum {

    private String kennung;
    private int maxSitzplaetze;
    private boolean belegt; //wird durch Aufgabe 4 überflüssig
    private Vorlesung vorlesung;

    public Raum(String kennung, int maxSitzplaetze) {
        this.kennung = kennung;
        this.maxSitzplaetze = maxSitzplaetze;
    }

    public String getKennung() {
        return this.kennung;
    }

    public void belegeRaum(Vorlesung v) {
        this.belegt = true; //wird durch Aufgabe 4 überflüssig
        this.vorlesung = v;
    }

    public void gebeRaumFrei() {
        this.belegt = false; //wird durch Aufgabe 4 überflüssig
        this.vorlesung = null;
    }

    public Vorlesung istRaumBelegt() {
        return this.vorlesung;
    }
}