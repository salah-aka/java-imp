package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
	int [] arr = new int [] {2, 4, 6, 8};   
    int n = 3;  
        System.out.println("Direction initiale: ");  
    for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    for(int i = 0; i < n; i++){  
    int j, first;  
       first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                arr[j] = arr[j+1];  
                }  
       arr[j] = first;  
        }  
        System.out.println();  
     System.out.println("Tableau apr�s la rotation : ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  