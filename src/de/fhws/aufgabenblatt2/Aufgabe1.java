package de.fhws.aufgabenblatt2;

public class Aufgabe1 {
	public static void main(String[] args) {
		 int x = 5;
		 int y = 7;
		 int tmp;
		 
		 //Vor dem Tausch     
		 System.out.println(x);     
		 System.out.println(y); 
		 
		 //Tausch 
		 tmp = y;
		 y = x;
		 x = tmp;
		 
		 //Nach dem Tausch     
		 System.out.println(x);     
		 System.out.println(y); 
	}
}
