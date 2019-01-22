package de.fhws.misc;

/**
 * Liste
 */
public class Liste {
    public static Liste start;

    public static void main(String[] args) {
        start = new Liste("Bart",
                new Liste("Homer", new Liste("Lisa", new Liste("Maggie", new Liste("Marge", null)))));

        printListe(start);
        System.out.println("---- Was tue ich? ---");
        wasTuIch(3);
        System.out.println("---- Was tue ich? ---");
        printListe(start);
    }

    public static void printListe(Liste l) {
        while (l.getNext() != null) {
            System.out.println(l.getName());
            l = l.getNext();
        }
        System.out.println(l.getName());
    }

    public static void wasTuIch(int a) {
        Liste b = start;
        Liste c = start;
        int d = 1;
        while (d < a - 1) {
            b = b.getNext();
            d++;
        }
        System.out.println(b.getName());
        while (c.getNext() != null) {
            c = c.getNext();
        }
        System.out.println(c.getName());
        c.setNext(b.getNext());
        b.setNext(b.getNext().getNext());
        c.getNext().setNext(null);
    }

    private String name;
    private Liste next;

    public Liste(String name, Liste next) {
        this.name = name;
        this.next = next;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the next
     */
    public Liste getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Liste next) {
        this.next = next;
    }
}