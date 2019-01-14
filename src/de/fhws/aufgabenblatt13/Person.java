package de.fhws.aufgabenblatt13;

public class Person {
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Person getPrev() {
		return prev;
	}

	public void setPrev(Person prev) {
		this.prev = prev;
    }
    
	public Person getNext() {
		return next;
    }
    
    public void setNext(Person next) {
        this.next = next;
	}

	public void setPrevAndNext(Person prev, Person next) {
        this.next = next;
        this.prev = prev;
	}

	private int alter;
	private String nachname;
	private Person prev;
	private Person next;
	
	public Person(int alter, String nn) {
		this.alter = alter;
		this.nachname = nn;
		this.prev = null;
		this.next = null;
	}
	
}
