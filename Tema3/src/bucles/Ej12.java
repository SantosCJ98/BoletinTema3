package bucles;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		
		int num1 = 0;
		
		int num2 = 1;
		
		int sig;
		
		int sumaFib=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduzca un valor");
		
		int n = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		if (n == 0) {
			
			System.out.println(num1);
			
		}
		
		else if (n == 1) {
			
			System.out.println(num1);
			System.out.println(num2);
			
		}
		
		num1=1;
		
		num2=0;
						
		while (sumaFib <= n) {
			
			sig=num1+num2;
			
			sumaFib+=sig;
			
			if (sumaFib > n) {
				
				break;
				
			}
			
			else {
				
				num2 = num1;
				
				num1 = sig;
				
			}
		System.out.println(num1);
		}
			
		}
		

	}
