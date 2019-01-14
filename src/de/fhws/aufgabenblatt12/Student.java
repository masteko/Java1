package de.fhws.aufgabenblatt12;

/**
 * Student
 */
public class Student {

    private String name;

    public Student(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}