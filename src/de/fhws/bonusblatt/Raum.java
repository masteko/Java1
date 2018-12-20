package de.fhws.bonusblatt;

/**
 * Raum
 */
public class Raum {

    private String kennung;
    private int maxSitzplaetze;
    private boolean belegt;

    public Raum(String kennung, int maxSitzplaetze) {
        this.kennung = kennung;
        this.maxSitzplaetze = maxSitzplaetze;
    }

    public String getKennung() {
        return this.kennung;
    }

    public void belegeRaum() {
        this.belegt = true;
    }

    public void gebeRaumFrei() {
        this.belegt = false;
    }

    public boolean istRaumBelegt() {
        return this.belegt;
    }
}