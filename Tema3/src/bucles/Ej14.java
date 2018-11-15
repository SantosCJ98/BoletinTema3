package bucles;

import java.util.Random;
import java.util.Scanner;

public class Ej14 {

			public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);
				Random random = new Random();
				
				System.out.println("Introduce el número inferior");
				
					int num1 = keyboard.nextInt();
					
					keyboard.nextLine();
				
				System.out.println("Introduce el número superior");
				
					int num2 = keyboard.nextInt();
					
					keyboard.nextLine();
					
				System.out.println("Introduce el número de intentos");
				
					int numintentos = keyboard.nextInt();
					
					keyboard.nextLine();
					
					keyboard.close();
					
				int res=random.nextInt(num2-num1+1)+num1;
				
				int respuestamaq=random.nextInt(num2-num1+1)+num1;
				
				while (numintentos > 0) {
					
					if (respuestamaq > res) {
						
					 System.out.println("Es menor que " + respuestamaq);
					 
					 respuestamaq--;
					 
					 numintentos--;
						
					}
					
					else if (respuestamaq < res) {
						
						 System.out.println("Es mayor que " + respuestamaq);
						 
						 respuestamaq++;
						 
						 numintentos--;
							
						}
					
					else if (respuestamaq == res) {
						
						System.out.println("Ha ganado la máquina");
						
						break;
						
					}
					
					
						
					}
				
				if (respuestamaq != res) {
					
					System.out.println("Has ganado");
					
				}
				
				
				
					

			}





}
