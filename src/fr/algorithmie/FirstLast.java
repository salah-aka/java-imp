package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
	int [] array = {4, 3, 6, 1, 4};
	boolean b;
	if ( b = (array.length > 1) && array[0] ==  array[array.length-1] ) {
				System.out.println(b + " : le premier et le dernier �l�ment du tableau ont la m�me valeur ");
							  
	} else {
		System.out.println(b + ": Autre cas");
	       }
	  }
}
	
