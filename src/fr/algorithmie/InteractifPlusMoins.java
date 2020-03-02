package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
	private static Scanner saisie;
	public static void main(String[] args) {
	int secretNb = new Random().nextInt(100)+1; 
	int nombre = 0;
	int n=0 ;
	while (nombre != secretNb)  {
			 saisie = new Scanner(System.in);
		     System.out.println("Veuillez saisir un nombre entre 1 et 100 ");
		               nombre =  saisie.nextInt();   
		   if (nombre > secretNb) {
			 System.out.println(" le nombre que vous avez saisie eSt au-dessus de nombre demander ");

		} else {
			System.out.println(" le nombre que vous avez saisie eSt au-dessous de nombre demander ");
		}
		n++ ;
	}
	System.out.println(" Bravo, vous avez trouvé en "+ n +"  coups");}


}

