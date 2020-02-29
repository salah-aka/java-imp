package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    int[] array1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
    int[] som = new int [17];
    if (array.length == array1.length) {
		for (int i = 0; i <= som.length-1 ;i++) { 
			som [i]=array[i]+array1[i]; 
    	        System.out.print(som[i] + " ");
		}
	
     } else  {
    	 System.out.print(" la taille des deux tableaux sont pas identiques");
     }
  }
}
