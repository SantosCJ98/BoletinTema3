package bucles;

import java.util.Random;
import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int respuesta=0;
		
		System.out.println("Introduce el número inferior");
		
			int num1 = keyboard.nextInt();
			
			keyboard.nextLine();
		
		System.out.println("Introduce el número superior");
		
			int num2 = keyboard.nextInt();
			
			keyboard.nextLine();
			
		System.out.println("Introduce el número de intentos");
		
			int numintentos = keyboard.nextInt();
			
			keyboard.nextLine();
			
		int res=random.nextInt(num2-num1+1)+num1;
		
		while (numintentos > 0) {
			
			respuesta=keyboard.nextInt();
			
			keyboard.nextLine();
			
			if (respuesta > res) {
				
				System.out.println("Es menor que " + respuesta);
				
				numintentos--;
				
			}
			
			else if (respuesta < res) {
				
				System.out.println("Es mayor que " + respuesta);
				
				numintentos--;
				
			}
			
			else if (respuesta == res) {
				
				System.out.println("Has ganado");
				
				break;
				
			}
			keyboard.close();
		}
		
		if (respuesta != res) {
		
		System.out.println("Has perdido");
		
		}
			

	}

}
