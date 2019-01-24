package de.fhws.bonusblatt2;

/**
 * Aufgabe7
 */
public class Aufgabe7 {
    public static void main(String[] args) {
        
        Schreibtisch[] s = new Schreibtisch[1000000];
        int total = 0;
        int imFachDrei = 0;
    
        for (int i = 0; i < s.length; i++) {
            s[i] = new Schreibtisch();

            if (!s[i].isFachEins() && !s[i].isFachZwei()) {
                total++;

                if (s[i].isFachDrei()) {
                    imFachDrei++;
                }
            }
        }

        System.out.printf("Die Muenze war bei %,d Schreibtischen %,d mal nicht im 1. und 2. Fach. Und bei diesen %,d mal im 3. Fach \n", s.length, total, imFachDrei);
        System.out.printf("Die Wahrscheinlichkeit betraegt demnach: %.2f%%", (imFachDrei / (double) total * 100));
    }
}