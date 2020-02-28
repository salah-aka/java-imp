package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] arrayCopy = new int [17];
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		for ( int b=0 ; b<= array.length-1 ; b++){
			System.out.print(array[b]+ ";");
		}
		
		System.out.println(" ");
		
		int i=array.length-1 ;
		while (i >= 0) {
			System.out.print(array[i]+ ";");
		i--;
		} 
		 System.out.println(" ");
		for ( int z=array.length-1 ; z>= 0 ; z--){
			System.out.print(array[z]+ ";");
		
		}
		System.out.println(" ");
		
		for ( int c=0 ; c<= array.length-1 ; c++){
			arrayCopy[c] = array[c];
			System.out.print(arrayCopy[c]+ ";");
		}
		
	    
	}
	
}
