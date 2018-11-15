import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		
		int x = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		if (x>0) {
			
			System.out.println(x + " es positivo.");
	
		}
		
		else if (x<0) {
			
			System.out.println(x + " es negativo.");
			
		}
		
		else { System.out.println(x + " = 0");
		

	}

}
	
}
