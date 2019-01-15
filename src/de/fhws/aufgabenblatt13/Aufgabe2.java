package de.fhws.aufgabenblatt13;

/**
 * Aufgabe2
 */
public class Aufgabe2 {

    public static void main(String[] args) {
		PersonenListe pl = new PersonenListe();
		pl.einfuegen(new Person(15, "haha"));
		pl.einfuegen(new Person(34, "bebe"));
		pl.einfuegen(new Person(35, "lala"));
		pl.einfuegen(new Person(36, "mala"));
		pl.einfuegen(new Person(29, "cece"));
		pl.einfuegen(new Person(11, "dede"));
		pl.einfuegen(new Person(14, "gege"));
		
		pl.gebeListeAus();
	}
}