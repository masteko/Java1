package de.fhws.bonusblatt2;

/**
 * Aufgabe5
 */
public class Aufgabe5 {

    public static void main(String[] args) {
        Ticker n = new Ticker(45);
        n.setNachricht("Wettervorhersage: Schnee in Wuerzburg".toCharArray());
        System.out.println(n);
        n.rotateNachricht(6);
        System.out.println(n);

        Ticker[] tagesticker = new Ticker[24];

        for (int i = 0; i < tagesticker.length; i++) {
            tagesticker[i] = new Ticker(100);
            tagesticker[i].rotateNachricht(50);
        }
    }
}