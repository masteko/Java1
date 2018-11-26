package de.fhws.aufgabenblatt2;

public class Aufgabe2 {

	public static void main(String[] args) {
		int r = 5;
		
		double area = Math.PI * r * r;
		double circumference = 2 * Math.PI * r;

		System.out.println("Ein Kreis mit einem Radius von " + r + "m besitzt eine Fläche von " + area +"m² sowie einen Umfang von " + circumference + "m");
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
		System.out.println("Das Volumen eines Kreises mit dem Radius " + r + "m wäre " + volume + "m³");
	}
}