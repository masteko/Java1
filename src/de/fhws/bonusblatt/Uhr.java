package de.fhws.bonusblatt;

/**
 * Uhr
 */
public class Uhr {
    private int std;
    private int min;
    private int sek;

    public Uhr(int std, int min, int sek) {
        if (gueltigeUhrzeit(std, min, sek)) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        } else {
            this.std = 12;
            this.min = 0;
            this.sek = 0;
        }
    }

    private boolean gueltigeUhrzeit(int std, int min, int sek) {
        return std >= 0 && std < 24 && min >= 0 && min < 60 && sek >= 0 && sek < 60;
    }

    public void setUhr(int std, int min, int sek) {
        if (gueltigeUhrzeit(std, min, sek)) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        } else {
            System.out.println("ungueltige Uhrzeit!");
        }
    }

    public void naechsteSek() {
        this.sek = (this.sek + 1) % 60;
        if (this.sek == 0) {
            this.min = (this.min + 1) % 60;
            if (this.min == 0) {
                this.std = (this.std + 1) % 24;
            }
        }
    }

    public long getTagesSek() {
        return (long) this.std * 60 * 60 + this.min * 60 + this.sek;
    }

    public int getStd() {
        return this.std;
    }

    public int getMin() {
        return this.min;
    }

    public int getSek() {
        return this.sek;
    }

    public String toString() {
      return String.format("%02d:%02d:%02d", this.std, this.min, this.sek);  
    }
}