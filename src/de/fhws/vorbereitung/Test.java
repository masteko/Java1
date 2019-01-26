package de.fhws.vorbereitung;

import java.awt.SystemColor;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        int[] scores = new int[1000];
        // int[] arr = { 9, 12, 34, 45, 23, 12, 45, 56, 76, 53, 23, 1, 34, 6, 155, 324, 43, 86, 52, 91, 19, 25, 652, 26, 72, 11, 2};
        int[] arr = { 9, 12, 3, 11, 2};

        for (int i = 0; i < scores.length; i++) {
            scores[i] = randomSort(arr);
            while(isSorted(arr)) {
                shuffle(arr);
            }
        }

        sort(scores);
        System.out.println("negativ: " + scores[scores.length -1] + " positiv: " + scores[0]);
        System.out.println(durchschnitt(scores));
    }

    public static double durchschnitt(int[] scores) {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return (double) sum / (double) scores.length;
    }

    public static void sort(int[] arr) {
        int record;
        int index;

        for (int i = 0; i < arr.length; i++) {
            record = arr[i];
            index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < record) {
                    record = arr[j];
                    index = j;
                }
            }

            if (index != i) {
                arr[index] = arr[i];
                arr[i] = record;
            }
        }
    }

    public static int randomSort(int[] arr) {
        int counter = 0;

        while(!isSorted(arr)) {
            shuffle(arr);
            counter++;
        }

        return counter;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * arr.length);
            int b = (int) (Math.random() * arr.length);
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}