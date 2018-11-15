package bucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int num;
		
		int factor;
		
		do {
		
			System.out.println("Introduca un número del 0 al 10");
		
			num=keyboard.nextInt();
		
			keyboard.nextLine();
			
		} while ((num<0) || (num>10));
		
		keyboard.close();
		
		for (factor=0; factor<=10; factor++) {
			
			System.out.printf("%d X %d = %d \n", num, factor, num*factor);
			
		}

	}
	
	public static boolean tabla (int n) {
		
		if (n >= 0 && n<=10) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}

}
