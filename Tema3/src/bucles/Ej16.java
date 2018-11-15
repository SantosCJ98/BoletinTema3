package bucles;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		
		int num; 
		
		int resto;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		
		num=keyboard.nextInt();
		
		keyboard.nextLine();
		
		int longitud = String.valueOf(num).length();
		
		int [] inverso = new int [longitud];
		
			for (int i = 0; i < longitud; i++) {
			
			resto = num % 10;
			
			inverso[i] = resto;
			
			num = num / 10;
			
			}
		
		for (int i = 0; i < longitud; i++) {
			
			System.out.print(inverso[i]);
			
		}

		keyboard.close();
	}

}
