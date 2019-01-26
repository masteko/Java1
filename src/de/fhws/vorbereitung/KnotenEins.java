package de.fhws.vorbereitung;

import de.fhws.bonusblatt2.Knoten;

/**
 * KnotenEins
 */
public class KnotenEins {
    private String name;
    private KnotenEins next;

    public KnotenEins(String name) {
        this.name = name;
    }

    public KnotenEins(String name, KnotenEins n) {
        this(name);
        this.next = n;
    }

    public String getName() {
        return this.name;
    }

    public void setNext(KnotenEins n) {
        this.next = n;
    }

    public KnotenEins getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return this.name;
    }
}