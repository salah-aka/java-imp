package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
	try (Scanner saisie = new Scanner(System.in)){
			     System.out.println("Veuillez saisir un nombre ");
	int nombre =  saisie.nextInt(); 
    int n=0, somme=0;
    while (n <= nombre) {
	   somme = somme + (nombre-n);
	  n++ ;
    }
	System.out.print(somme + " ");
	}
}}
