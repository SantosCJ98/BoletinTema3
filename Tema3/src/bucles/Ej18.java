package bucles;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		
		//Creación de un triángulo
		
		int i, j;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Qué altura y anchura tendrá el rombo?");
		
		int n = teclado.nextInt();
		
		System.out.println("¿Qué carácter vas a usar?");
		
		String c=teclado.next();
		
		teclado.nextLine();
		
		
		teclado.close();
		
		for (j = 0; j < n ; ++j) {
	        for (i = 0; i < n-j-1; ++i) {
	            System.out.print(' ');
	        }
	        for (i = 0; i < 2*j+1; ++i) {
	        	
	        	if (i%2==1) {
	        		
	        		System.out.print(' ');
	        		
	        	}
	        	
	        	else if (i%2==0) {
	        		
	        		System.out.print(c);
	        		
	        	}
	        	
	            
	        }
	        System.out.print('\n');
	    }

	    for (j=n-2; j>=0; --j) {
	        for (i=0; i<n-j-1; ++i) {
	        	
	            System.out.print(' ');
	            
	        }
	        for (i=0; i<2*j+1; ++i) {
	        	
	        	if (i%2==1) {
	        
	            System.out.print(' ');
	            
	        	}
	        	
	        	else if (i%2==0) {
	        		
	        		System.out.print(c);
	        		
	        	}
	            
	        }
	        System.out.print('\n');
	    }
		
		
		

	}

}