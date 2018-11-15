package bucles;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		
		int m, n=1, suma=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.println("Enter a number:");
		
		m = keyboard.nextInt();
		
		keyboard.nextLine();
		
		} while (m<0);
		
		while (m > suma) {
			
			suma=suma+n;
			
			n++;
			
		}
		
		System.out.printf("%d", n);
		
		
		keyboard.close();

	}

}
