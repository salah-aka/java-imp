package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	private static Scanner saisie;
	public static void main(String[] args) {
			int nombre = 0;
			int somme = 0;
			while ((nombre < 1) || (nombre > 10))  {
				 saisie = new Scanner(System.in);
			     System.out.println("Veuillez saisir un nombre ");
			               nombre =  saisie.nextInt();   
			
			}
			
		for (int i=0; i <= 10; i++) {

				System.out.println(nombre + "*"+ i+"=" + nombre * i);
		}
	}
	}
	

