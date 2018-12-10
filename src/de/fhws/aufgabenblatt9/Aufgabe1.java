package de.fhws.aufgabenblatt9;

/**
 * Aufgabe1
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        int[] lottozahlen = zieheLottozahlen();
        
        sort(lottozahlen);

        for (int i = 0; i < lottozahlen.length; i++) {
            System.out.print(lottozahlen[i] + " ");
        }
    }

    public static int[] zieheLottozahlen() {
        boolean[] vergeben = new boolean[50];
        int[] lottozahlen = new int[6];
        int i = 0;

        while (i < lottozahlen.length) {
            int lottozahl = (int) (Math.random() * 49 + 1);
            lottozahlen[i] = lottozahl;
            if (!vergeben[lottozahl]) {
                i++;
                vergeben[lottozahl] = true;
            }
        }

        return lottozahlen;
    }

    public static void sort(int[] array) {
        int niedrigste = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            niedrigste = array[i];
            index = i;

            for (int y = i + 1; y < array.length; y++) {
                if (array[y] < niedrigste) {
                    niedrigste = array[y];
                    index = y;
                }
            }

            if (index != i) {
                array[index] = array[i];
                array[i] = niedrigste;
            }
        }
    }
}