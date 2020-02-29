package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 

//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 
    for ( int b=0 ; b<= array.length-1 ; b++){
    	if (array [b] > 3) {
      	  System.out.print(array [b] + ";");
        }
     }
    System.out.println(" ");
    
//Combiner une boucle et un test de manière à n’afficher que les entiers pairs  
    for ( int b=0 ; b<= array.length-1 ; b++){
    		if (array [b] % 2 == 0){
    			 System.out.print(array [b] + ";");
    		}
    	  }
     System.out.println(" ");
    
 //Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs 
      for ( int b=0 ; b<= array.length-1 ; b++){
    		if (b % 2 == 0) {
    			 System.out.print(array[b] + ";");
    		}
        }
      System.out.println(" ");
      
//Combiner une boucle et un test de manière à n’afficher que les entiers impairs 
    for ( int b = 0 ; b<= array.length-1 ; b++){
		if (array[b] % 2 != 0) {
			 System.out.print(array[b] + ";");
		}
    }
  }	
}
