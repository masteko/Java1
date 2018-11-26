package de.fhws.aufgabenblatt2;

import java.time.LocalDateTime;

public class Aufgabe4 {

	public static void main(String[] args) {
		int hours = LocalDateTime.now().getHour();
		int minutes = LocalDateTime.now().getMinute();
		int seconds = LocalDateTime.now().getSecond();
		int secondsOfOneDay = 24 * 3600;
		
		int secondsSinceMidnight = hours * 3600 + minutes * 60 + seconds;
		int secondsTillMidnight = secondsOfOneDay - secondsSinceMidnight;
		double percentOfTheDay = ((double) secondsSinceMidnight / secondsOfOneDay) * 100;
		
		System.out.println("Sekunden seit Mitternacht: " + secondsSinceMidnight);
		System.out.println("Sekunden bis Mitternacht: " + secondsTillMidnight);
		System.out.println("Tag ist zu  " + percentOfTheDay + "% vorbei");
	}
}