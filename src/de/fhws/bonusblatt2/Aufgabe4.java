package de.fhws.bonusblatt2;

/**
 * Aufgabe4
 */
public class Aufgabe4 {
    public static void main(String[] args) {
        Baum b = new Baum();
        Knoten abba = new Knoten("abba", "bla bla blaa asdf");
        Knoten gello = new Knoten("gello", "bla bla blaa asdf");
        b.insert(new Knoten("hello", "bla bla blaa asdf"));
        b.insert(new Knoten("amiga", "bla bla blaa asdf"));
        b.insert(gello);
        b.insert(new Knoten("bebo", "bla bla blaa asdf"));
        b.insert(new Knoten("anton", "lolololo"));
        b.insert(new Knoten("bubu", "bla bla blaa asdf"));
        b.insert(new Knoten("zeppelin", "aabbbbaa"));
        b.insert(abba);
        b.insert(new Knoten("Peter", "bla bla blaa asdf"));
        b.print();  
        System.out.println("----------------------");
        System.out.println(b.search("anton"));
        System.out.println(b.search("zeppelin"));
        System.out.println(b.search("asdfsdf"));
        System.out.println("----------------------");
        b.loesche(abba);
        b.loesche(gello);
        b.print();  
    }
}