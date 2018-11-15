package bucles;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		int a, b;
		
		int potencia = 1;

		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
	
			System.out.println("Introduzca un número positivo:");
		
			a=keyboard.nextInt();
		
			keyboard.nextLine();
		
			System.out.println("Introduzca otro número positivo:");
		
			b=keyboard.nextInt();
		
			keyboard.nextLine();
			
		} while (a < 0 || b < 0);
		
		keyboard.close();
		
		for (int x=0; x<b; x++) {
			
			potencia *= a;
			
		}
		
		System.out.printf("%d", potencia);

	}

}