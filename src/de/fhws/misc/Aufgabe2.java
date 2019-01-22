package de.fhws.misc;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        int[] arr = {1, 3 , 6, 4, 2, 9, 10, 45, 23};
        print(arr);
        sortiereAbsteigend(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortiereAbsteigend(int[] arr) {
        int index = 0;
        int hoechste = 0;
        
        for (int i = 0; i < arr.length; i++) {
            hoechste = arr[i];
            index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > hoechste) {
                    hoechste = arr[j];
                    index = j;
                }
            }

            if (index != i) {
                arr[index] = arr[i];
                arr[i] = hoechste;
            }
        }
    }
}