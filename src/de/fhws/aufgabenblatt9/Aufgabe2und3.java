package de.fhws.aufgabenblatt9;

import java.util.Scanner;

/**
 * Aufgabe2
 */
public class Aufgabe2und3 {

    public static void sort(double[] array) {
        double niedrigste = 0;
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean fehler = false;
        System.out.println("Anazhl der einzulsenden Werte:");
        int amount = scanner.nextInt();
        double[] values = new double[amount];
        
        for (int i = 0; i < amount; i++) {
            System.out.println(i + 1 + ". Wert:");
            values[i] = scanner.nextDouble();

            if (values[i] <= 0) {
                fehler = true;
                break;
            }
        }

        if(fehler) {
            System.out.println("Ungueltige Eingabe");
        } else {
            sort(values);
    
            System.out.println("Kleinster Wert: " + values[0]);
            System.out.println("Groesster Wert: " + values[values.length - 1]);
            System.out.println("Aritmetischer Mittelwert: " + mittelwert(values));
            System.out.println("Standardabweichung: " + standardabweichung(values));
        }

        scanner.close();
    }

    public static double mittelwert(double[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }
    
    //Aufgabe 3
    public static double standardabweichung(double[] array) {
        double sum = 0.0;
        double mittel = mittelwert(array);

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i] - mittel, 2);
        }

        return Math.sqrt(sum / array.length);
    }
}