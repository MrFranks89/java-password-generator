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
		
		Scanner scanDate = new Scanner (System.in);
		
		System.out.println("Inserisci la tua data di nascita");
		
		String yourDate = scanColor.next();
		
		
		
		System.out.println("La tua password è: " + name + lastName + yourColor + yourDate);
	}
}
