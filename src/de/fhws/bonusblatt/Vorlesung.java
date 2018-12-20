package de.fhws.bonusblatt;

/**
 * Vorlesung
 */
public class Vorlesung {

    private String name;
    private String dozent;
    private String studiengang;

    public Vorlesung(String name, String dozent, String studiengang) {
        this.name = name;
        this.dozent = dozent;
        this.studiengang = studiengang;
    }

    public String getName() {
        return this.name;
    }
}