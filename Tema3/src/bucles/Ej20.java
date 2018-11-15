package bucles;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		
		//Creación de un triángulo
		
		int j, i, num=1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Qué altura tendrá el triángulo?");
		
		int n = teclado.nextInt();
		
		teclado.nextLine();
		
		teclado.close();
		
		
		for (i = 0; i <= n ; i++) {
			
	        for (j = 0; j <= n-i; j++) {
	            System.out.print(' ');
	        }
	        for (j = 1; j <= i; j++) {
	        	
	        
	        System.out.print(num);
	        
	        num++;
	        
	        }
	     
	        for (j=num-2; j>=1; j--) {
		        System.out.print(j);

	        }
	        
	        num=1;
	        
	        System.out.println();
	        
	    }
		
		
		
		
		
		
		

	}

}