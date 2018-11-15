package bucles;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		int choice, a, b;
		
		boolean exit=false;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		
		System.out.println("Seleccione su operación con el número correspondiente:\n"
				+ "1.Sumar\t2.Restar\t3.Multiplicar\t4.Dividir 5. Salir");
		
		choice = teclado.nextInt();
		
		teclado.nextLine();
		
		switch (choice) {
		
			case 1: System.out.println("Introduzca el primer número:");
		
			a = teclado.nextInt();
		
			teclado.nextLine();
			
			System.out.println("Introduce el segundo número:");
			
			b = teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.printf("Resultado: %d \n", a+b);
			
			break;
			
			case 2: System.out.println("Introduzca el primer número:");
			
			a = teclado.nextInt();
		
			teclado.nextLine();
			
			System.out.println("Introduce el segundo número:");
			
			b = teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.printf("Resultado: %d \n", a-b);
			
			break;
			
			case 3: System.out.println("Introduzca el primer número:");
			
			a = teclado.nextInt();
		
			teclado.nextLine();
			
			System.out.println("Introduce el segundo número:");
			
			b = teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.printf("Resultado: %d \n", a*b);
			
			break;
			
			case 4: System.out.println("Introduzca el primer número:");
			
			a = teclado.nextInt();
		
			teclado.nextLine();
			
			System.out.println("Introduce el segundo número:");
			
			b = teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.printf("Resultado: %d \n", a/b);
			
			break;
			
			case 5: System.out.println("Hasta luego");
			
			exit = true;
			
			break;
			
		}
		
		}  while (exit == false);
		
		teclado.close();
	}

}
