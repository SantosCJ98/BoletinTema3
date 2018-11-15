package bucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		int x, fact=1;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.println("Enter a number:");
		
		x = keyboard.nextInt();
		
		keyboard.nextLine();
		
		} while (x<0);
		
		keyboard.close();
		
		while (x!=0) {
			
			fact=fact*x;
			
			x--;
			
		}
		
		System.out.printf("Factorial: %d", fact);

	}

}
