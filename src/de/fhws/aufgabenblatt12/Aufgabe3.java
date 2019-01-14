package de.fhws.aufgabenblatt12;

/**
 * Aufgabe3
 */
public class Aufgabe3 {
    public static void main(String[] args) {
        double [][] zweiDim = new double[((int) (Math.random() * 6) + 2)][];
        
        for (int i = 0; i < zweiDim.length; i++) {
            zweiDim[i] = new double[((int) (Math.random() * 6) + 2)];
            for (int j = 0; j < zweiDim[i].length; j++) {
                zweiDim[i][j] = Math.random() * 100;
            }
        }

        System.err.println("Array: ");
        printArray(zweiDim);
        System.out.println("\nHoechste Werte Array: ");
        printArray(zeilenMaxima(zweiDim));
    }

    public static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.println("");
    }

    public static double[] zeilenMaxima(double[][] array) {
        double[] result = new double[array.length];
        double max;

        for (int i = 0; i < array.length; i++) {
            max = 0.0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            result[i] = max;
        }

        return result;
    }
}