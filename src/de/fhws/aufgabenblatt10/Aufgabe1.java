package de.fhws.aufgabenblatt10;

/**
 * Aufgabe1
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(spielen("spiEl mit mir"));
    }
    
    public static String spielen2(String s) {
        final String regex = "((?i)[aeiou])";
        return s.replaceAll(regex, "$1b$1");
    }

    public static String spielen(String s) {
        char[] arr = s.toCharArray();
        int neueZeichen = 0;
        int offset = 0;

        for (int i = 0; i < arr.length; i++) {
            if (istSelbstlaut(arr[i])) {
                neueZeichen += 2;
            }
        }

        char[] result = new char[s.length() + neueZeichen];

        for (int i = 0; i < arr.length; i++) {
            result[i + offset] = arr[i];

            if(istSelbstlaut(arr[i])) {
                result[i + offset + 1] = 'b';
                result[i + offset + 2] = arr[i];
                offset+=2;
            }
        }
        return String.valueOf(result);
    }

    private static boolean istSelbstlaut(char c) {
        return c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u';
    }
}