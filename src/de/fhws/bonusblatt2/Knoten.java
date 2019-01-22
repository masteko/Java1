package de.fhws.bonusblatt2;

/**
 * Knoten
 */
public class Knoten {
    private String wort;
    private String bedeutung;

    private Knoten left;
    private Knoten right;

    public Knoten(String wort, String bedeutung){
        this.wort = wort;
        this.bedeutung = bedeutung;
    }

    /**
     * @return the wort
     */
    public String getWort() {
        return wort;
    }

    /**
     * @param wort the wort to set
     */
    public void setWort(String wort) {
        this.wort = wort;
    }

    /**
     * @return the bedeutung
     */
    public String getBedeutung() {
        return bedeutung;
    }

    /**
     * @param bedeutung the bedeutung to set
     */
    public void setBedeutung(String bedeutung) {
        this.bedeutung = bedeutung;
    }

    /**
     * @return the left
     */
    public Knoten getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Knoten left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Knoten getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Knoten right) {
        this.right = right;
    }

    @Override 
    public String toString() {
        return this.wort;
    }
}