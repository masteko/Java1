package de.fhws.aufgabenblatt13;

/**
 * Aufgabe3
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        MotorradListe ml = new MotorradListe();
        ml.einfuegen(new Motorrad(120));
        ml.einfuegen(new Motorrad(200));
        ml.einfuegen(new Motorrad(300));
        ml.einfuegen(new Motorrad(400));
        ml.einfuegen(new Motorrad(350));
        ml.einfuegen(new Motorrad(50));
        ml.einfuegen(new Motorrad(0));

        System.out.println(ml);
        System.out.println(ml.getMotorrad(370));
        System.out.println(ml.getMotorrad(200));
        System.out.println(ml.getMotorrad(20));
        
        ml.loescheMotorrad(300);
        System.out.println(ml.getMotorrad(300));
        ml.loescheMotorrad(50);
        ml.loescheMotorrad(60);
        ml.loescheMotorrad(0);
        ml.loescheMotorrad(400);
        System.out.println(ml);
    }
}