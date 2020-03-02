package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
	int[] nombre = new int [10];
	int minValeur = Integer.MIN_VALUE;
    try (Scanner saisie = new Scanner(System.in)){
    System.out.print("Veuillez saisir les 10 nombres ");
     for(int i=0; i<= nombre.length-1; i++) {
    	    nombre[i]= saisie.nextInt();
	}
  
     for(int i = 0; i <= nombre.length-1; i++){
         if(nombre[i] > minValeur) 
           minValeur = nombre[i];
       }
       System.out.print("\nValeur maximale = "+ minValeur);
       
 	}
 }
}