package bucles;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		int count;
		
		Random random = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		
			int num1=keyboard.nextInt();
		
			keyboard.nextLine();
		
		System.out.println("Introduce otro número:");
		
			int num2=keyboard.nextInt();
		
			keyboard.nextLine();
		
		keyboard.close();
		
	
		
		for (count=1; count<=15; count++) {
			
			if (num1 > num2) {
			
			System.out.printf("%d \n", random.nextInt(num1-num2+1)+num2);
			
			}
			
			else if (num1 < num2) {
				
				System.out.printf("%d \n", random.nextInt(num2-num1+1)+num1);
				
			}
			
			else {
				
				System.out.printf("%d \n", num1);
				
				break;
				
			}
			
		}

	}

}
