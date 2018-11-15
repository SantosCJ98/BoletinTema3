package bucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		int a, b, sumapares=0, sumaimpares=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
			System.out.println("Introduce un número:");
		
			a = keyboard.nextInt();
		
			keyboard.nextLine();
		
			System.out.println("Introduce otro número:");
		
			b = keyboard.nextInt();
		
			keyboard.nextLine();
			
		} while (a >= b);
		
		keyboard.close();
		
		
		while (a <= b) {
			
			if (a%2==0) {
				
				sumapares+=a;
				
			}
			
			else if (a%2==1 ) {
				
				sumaimpares+=a;
				
			}
			
			a++;
			
		}
		
		System.out.printf("La suma de los pares es %d, y la de los impares %d", sumapares, sumaimpares);
		
		
		
		
		
	

	}

}
