package de.fhws.misc;

/**
 * Fach
 */
public class Fach {
    private int number;
    private boolean open = false;

    public Fach(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return open ? "o" : "z";

        //alternative:
        // if (open) {
        //     return "o";
        // } else {
        //     return "z";
        // }
    }
}