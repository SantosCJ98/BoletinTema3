import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		
		int x = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce otro número: ");
		
		int y = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		int modulo=x%y;
		
		if (modulo == 0) {
			
			System.out.println(x + " es múltiplo de " + y);
			
		}
		
		else {
			
			System.out.println(x + " no es múltiplo de " + y);
			
		}
		

	}

}
