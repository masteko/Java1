package de.fhws.aufgabenblatt12;

/**
 * Raum
 */
public class Raum {

    private String kennung;
    private int maxSitzplaetze;
    private boolean belegt; //wird durch Aufgabe 4 überflüssig
    private Vorlesung vorlesung;
    private Student[] studenten;
    private int belegteSitzplaetze;

    public Raum(String kennung, int maxSitzplaetze) {
        this.kennung = kennung;
        this.maxSitzplaetze = maxSitzplaetze;
        this.studenten = new Student[maxSitzplaetze];
    }

    public void betreteRaum(Student s) {
        if (belegteSitzplaetze < maxSitzplaetze) {
            for (int i = 0; i < studenten.length; i++) {
                if (studenten[i] != null) {
                    studenten[i] = s;
                    belegteSitzplaetze++;
                    break;
                }
            }
        }
    }

    public void verlasseRaum(Student s) {
        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] == s) {
                studenten[i] = null;
                belegteSitzplaetze--;
                break;
            }
        }
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

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] != null) {                
                result += (studenten[i].getName() + " ");
                System.out.println("hallo");
            }
        }

        return result;
    }
}