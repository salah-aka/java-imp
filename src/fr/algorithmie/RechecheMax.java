package fr.algorithmie;

public class RechecheMax {

	public static void main(String[] args) {
    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    int minValeur = Integer.MIN_VALUE;
    for(int i = 0; i <= array.length-1; i++){
        if(array[i] > minValeur) 
          minValeur = array[i];
      }
      System.out.print("\nValeur maximale = "+ minValeur);
      
	}
}

    

	


