package de.fhws.misc;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String s = "TestStrinG";
        char[] arr = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}