package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		Scanner scanName = new Scanner (System.in);
		
		System.out.println("inserisci il tuo nome");
		
		String name = scanName.next();
		
		Scanner scanLastName = new Scanner (System.in);
		
		System.out.println("inserisci il tuo cognome");
		
		String lastName = scanLastName.next();
		
		Scanner scanColor = new Scanner (System.in);
		
		System.out.println("Inserisci il tuo colore preferito");
		
		String yourColor = scanColor.next();
		
		Scanner scanDateDay = new Scanner (System.in);
		
		System.out.println("Inserisci il giorno in cui sei nato");
		
		int yourDateDay = scanDateDay.nextInt();
		
		Scanner scanDateMonth = new Scanner (System.in);
		
		System.out.println("Inserisci il mese in cui sei nato");
		
		int yourDateMonth = scanDateMonth.nextInt();
		
		Scanner scanDateYear = new Scanner (System.in);
		
		System.out.println("Inserisci l'anno in cui sei nato");
		
		int yourDateYear = scanDateYear.nextInt();
		
		
		System.out.println("La tua password è: " + name + "-" + lastName + "-" + yourColor + "-" + (yourDateDay + yourDateMonth + yourDateYear));
	}
}
