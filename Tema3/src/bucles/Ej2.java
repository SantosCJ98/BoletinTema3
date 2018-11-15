package bucles;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		int a, b;
		
		int producto=0;
		
		int count=1;
		
		
		
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
		
		
		while (count<=b) {
			
			producto+=a;
					
			count++;
			
		}
		
		
	
		
		
		System.out.printf("%d", producto);

	}
	
	public static boolean suma (int a, int b) {
		
		if (a >= 0 && b >= 0) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}

}
