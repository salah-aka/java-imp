package fr.algorithmie;
import  java.util.Scanner ; 
public class InteractifsChiffresSuivants {

	public static void main(String[] args) {
    
    try (Scanner saisie = new Scanner(System.in)){
     System.out.println("Veuillez saisir un nombre ");
              int nombre =  saisie.nextInt();
            int n = 0;  
              while (n<10) {
            	  n++ ;
            	  System.out.print(nombre+n+";");
            	   }
}
}
}
