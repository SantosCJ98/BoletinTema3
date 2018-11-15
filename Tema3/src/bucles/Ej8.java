package bucles;

import java.util.Scanner;

public class Ej8 {
	
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner keyboard = new Scanner (System.in);
		
		do {

			System.out.println("Enter a number:");
		
			a = keyboard.nextInt();
		
			keyboard.nextLine();
		
			System.out.println("Enter another number:");
		
			b = keyboard.nextInt();
		
			keyboard.nextLine();
			
		} while (a>=b);
		
		for (a=a, b=b; a<b; a=a*2, b=b/2) {
			
			System.out.printf("A = %d\t B = %d \n", a, b);
			
		}
		
		
		keyboard.close();
		
	}

}
