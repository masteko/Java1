package de.fhws.vorbereitung;

import de.fhws.bonusblatt2.Knoten;

/**
 * ListeEins
 */
public class ListeEins {
    private static KnotenEins start;

    public static void main(String[] args) {
        print();
        insert(new KnotenEins("Hallo"));
        print();
        insert(new KnotenEins("Balu"));
        insert(new KnotenEins("Zepra"));
        print();
    }

    public static void insert(KnotenEins k) {
        if (start == null) {
            start = k;
        } else {
            KnotenEins tmp = start;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(k);
        }
    }

    public static void print() {
        KnotenEins tmp = start;

        while (tmp != null) {
            System.out.print(tmp + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}