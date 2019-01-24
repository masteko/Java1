package de.fhws.bonusblatt2;

/**
 * Ticker
 */
public class Ticker {

    private char[] nachricht_ref;

    public Ticker(int groesse) {
        this.nachricht_ref = new char[(groesse > 0 ? groesse : 200)];

        for (int i = 0; i < nachricht_ref.length; i++) {
            nachricht_ref[i] = ' ';
        }
    }

    public int getGroesse() {
        return this.nachricht_ref.length;
    }

    public void setNachricht(char[] nachricht_ref) {
        for (int i = 0; i < this.nachricht_ref.length; i++) {
            if (i >= nachricht_ref.length) {
                this.nachricht_ref[i] = '+';
            } else {
                this.nachricht_ref[i] = nachricht_ref[i];
            }
        }
    }

    public char[] getNachricht() {
        char[] result = new char[this.nachricht_ref.length];

        for (int i = 0; i < this.nachricht_ref.length; i++) {
            result[i] = this.nachricht_ref[i];
        }

        return result;
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht_ref.length; i++) {
            this.nachricht_ref[i] = zeichen;
        }
    }

    public void resetNachricht() {
        resetNachricht('+');
    }

    public void rotateNachricht(int distance) {
        if (distance > 0 && distance < this.nachricht_ref.length) {
            char[] tmp = getNachricht();

            for (int i = distance; i < this.nachricht_ref.length + distance; i++) {
                this.nachricht_ref[(i - distance)] = tmp[i % this.nachricht_ref.length];
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.nachricht_ref);
    }
}