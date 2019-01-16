package de.fhws.bonusblatt2;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        char[][] text = {
            {'H', 'a', 'l', 'l','o', 0, 'w', 'i', 'e', 0},
            {'g', 'e', 'h', 't', 's', 0},
            {'w', 'i', 'e', 0},
            {'s', 't', 'e', 'h', 't', 's','?'}
        };

        char[][] neu = {
            {'M', 'i', 'r', 0},
            {'g', 'e', 'h', 't', 0},
            {'e', 's', 0},
            {'g', 'u', 't', 0}
        };

        print(text);
        System.out.println(zaehleZeichen(text));
        System.out.println(vertauscheZeilen(text, 6, 1));
        // vertauscheZeilen(text, 2, 1);
        // print(text);
        print(einfuegeTextdokument(text, neu, 2));
    }

    public static void print(char[][] text){
        for (int i = 0; i < text.length; i++) {
            System.out.print(String.valueOf(text[i]));
        }
        System.out.println();
    }

    public static int zaehleZeichen(char[][] text){
        int result = 0;

        for(int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                if (text[i][j] != 0) {
                    result++;
                }
            }
        }

        return result;
    }

    public static boolean vertauscheZeilen(char[][] text, int a, int b) {
        if (a - 1 > text.length || b - 1 > text.length) return false;
        char[] tmp;
        tmp = text[a - 1];
        text[a - 1] = text[b - 1];
        text[b - 1] = tmp;
        return true;
    }

    public static char[][] einfuegeTextdokument(char[][] text, char[][] neu, int a) {
        if (a - 1 >= text.length) return null;
        char[][] result = new char[text.length + neu.length][];
        
        for (int i = 0; i < result.length; i++) {
            if(i<a) {
                result[i] = text[i];
            } else if (i - a < neu.length) {
                result[i] = neu[i-a];
            } else {
                result[i] = text[i-neu.length];
            }
        }

        return result;
    }
}