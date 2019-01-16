package de.fhws.bonusblatt2;

/**
 * Personen
 */
public class Person {

    private int alter;
    private String nachname;
    private Person prev;
    private Person next;

    /**
     * @return the alter
     */
    public int getAlter() {
        return alter;
    }

    /**
     * @param alter the alter to set
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * @return the nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param nachname the nachname to set
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return the prev
     */
    public Person getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Person prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public Person getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Person next) {
        this.next = next;
    }
}