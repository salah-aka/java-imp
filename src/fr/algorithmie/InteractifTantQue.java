package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	private static Scanner saisie;

	public static void main(String[] args) {
		int nombre = 0;
		while ((nombre < 1) || (nombre > 10))  {
			 saisie = new Scanner(System.in);
		     System.out.println("Veuillez saisir un nombre ");
		               nombre =  saisie.nextInt();   
		
		}
		
		System.out.print("bravo t'a saisie un nombre entre 1 et 10 : " + nombre);
	}
} 
			