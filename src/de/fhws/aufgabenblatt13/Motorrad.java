package de.fhws.aufgabenblatt13;

/**
 * Motorrad
 */
public class Motorrad {

    private int hubraum;
    private Motorrad prev;
    private Motorrad next;

    public Motorrad(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getHubraum() {
        return hubraum;
    }

    public Motorrad getNext() {
        return this.next;
    }

    public void setNext(Motorrad m) {
        this.next = m;
    }

    public Motorrad getPrev() {
        return this.prev;
    }

    public void setPrev(Motorrad m) {
        this.prev = m;
    }

    @Override
    public String toString() {
        return String.valueOf(hubraum);
    }
}