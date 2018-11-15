import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		
		int num1 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el segundo número: ");
		
		int num2 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el tercer número: ");
		
		int num3 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			
			System.out.println("Los tres números son iguales: " + num1 + " " + num2 + " "+ num3);
			
		}
		
		else if ((num1 == num2) && (num1 != num3) && (num2 != num3)) {
			
			System.out.println("El primer número es igual al segundo: " + num1 + " " + num2 + " "+ num3);
			
		}
		
		else if ((num1 != num2) && (num1 == num3) && (num2 != num3)) {
			
			System.out.println("El primer número es igual al tercero: " + num1 + " " + num2 + " "+ num3);
			
		}
		
		else if ((num1 != num2) && (num1 != num3) && (num2 == num3)) {
			
			System.out.println("El segundo número es igual al tercero: " + num1 + " " + num2 + " "+ num3);
			
		}
		
		else {
			
			System.out.println("Los tres números son distintos: " + num1 + " " + num2 + " "+ num3);
			
		}
	}

}
