package de.fhws.aufgabenblatt13;

/**
 * MotorradListe
 */
public class MotorradListe {

    private Motorrad start;

    public void einfuegen(Motorrad m) {
        if (start == null) {
            start = m;
        } else {
            einfuegen(m, start);
        }
    }

    public Motorrad getMotorrad(int hubraum) {
        return getMotorrad(hubraum, start);
    }

    public void loescheMotorrad(int hubraum) {
        if (start.getHubraum() == hubraum) {
            start = start.getNext();
            start.setPrev(null);
        } else {
            loescheMotorrad(hubraum, start.getNext());
        }
    }

    private void loescheMotorrad(int hubraum, Motorrad m) {
        if (m == null) return;
        if(m.getHubraum() == hubraum) {
            if (m.getNext() == null) {
                m.getPrev().setNext(null);
            } else {
                m.getPrev().setNext(m.getNext());
                m.getNext().setPrev(m.getPrev());
            }
        } else {
            loescheMotorrad(hubraum, m.getNext());
        }
    }

    private Motorrad getMotorrad(int hubraum, Motorrad m) {
        if (m.getHubraum() == hubraum) {
            return m;
        } else if (m.getHubraum() > hubraum) {
            return m.getPrev();
        } else {
            return getMotorrad(hubraum, m.getNext());
        }
    }

    private void einfuegen(Motorrad a, Motorrad b) {
        if (a.getHubraum() > b.getHubraum()) {
            if (b.getNext() == null) {
                b.setNext(a);
                a.setPrev(b);
            } else if (a.getHubraum() < b.getNext().getHubraum()) {
                a.setNext(b.getNext());
                b.getNext().setPrev(a);
                b.setNext(a);
                a.setPrev(b);
            } else {
                einfuegen(a, b.getNext());
            }
        } else {
                b.setPrev(a);
                a.setNext(b);
                start = a;
        }
    }

    @Override
    public String toString() {
        String result = "";
        Motorrad tmp = start;

        while (tmp != null) {
            result += tmp + " ";
            tmp = tmp.getNext();
        }

        return result;
    }
}