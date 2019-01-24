package de.fhws.bonusblatt2;

/**
 * Schreibtisch
 */
public class Schreibtisch {
    private boolean imSchreibtisch;
    private boolean[] faecher = new boolean[3];

    public Schreibtisch() {
        this.imSchreibtisch = Math.random() >= 0.5 ? true : false;
        if (imSchreibtisch) {
            int schublade = (int) (Math.random() * 3);
            faecher[schublade] = true;
        }
    }

    public boolean isImSchreibtisch() {
        return this.imSchreibtisch;
    }

    public boolean isFachEins() {
        return this.faecher[0];
    }
    
    public boolean isFachZwei() {
        return this.faecher[1];
    }
    
    public boolean isFachDrei() {
        return this.faecher[2];
    }
}