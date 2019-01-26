package de.fhws.vorbereitung;

/**
 * Aufgabe1
 */
public class Aufgabe1 {

    public static void main(String[] args) {
        System.out.println(zaehleGrossbuchstaben("SS13-Programmieren1"));

        int[] array = {6, 9, 6, 4, 3, 1, 2};
        int[] feld = {6,4,3};
        System.out.println(feldEnthalten(array, feld));

        int[] array2 = {7, 9, 6, 1, 2, 4, 2};
        int[] feld2 = {1, 2, 3};

        System.out.println(feldEnthalten(array2, feld2));

        int[] arr = {7,4,3,5};
        wasTuIch(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean feldEnthalten(int[] a, int[] b) {
        int max = b.length;
        int current = 0;

        for (int i = 0; i < a.length && current < max; i++) {
            if (a[i] == b[current]) {
                current++;
            } else {
                current = 0;
            }
        }

        return current == max;
    }

    public static void wasTuIch(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i -1;

            while(j >= 0 && array[j] > tmp) {
                array[j+1] = array[j];
                j--;
            }
        }
    }

    public static int zaehleGrossbuchstaben(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                sum++;
            }
        }

        return sum;
    }
}