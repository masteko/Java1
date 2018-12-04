package de.fhws.aufgabenblatt9;

/**
 * Aufgabe1
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        int[] lottozahlen = {4, 2, 34, 48, 47, 1};
        int niedrigste = 0;
        int index = 0;
    
        for (int i = 0; i < lottozahlen.length; i++) {
            niedrigste = lottozahlen[i];
            index = i;

            for (int y = i + 1; y < lottozahlen.length; y++) {
                if (lottozahlen[y] < niedrigste) {
                    niedrigste = lottozahlen[y];
                    index = y;
                }
            }

            if (index != i) {
                lottozahlen[index] = lottozahlen[i];
                lottozahlen[i] = niedrigste;
            }
        }
        
        for (int i = 0; i < lottozahlen.length; i++) {
            System.out.print(lottozahlen[i] + " ");
        }
    }
}