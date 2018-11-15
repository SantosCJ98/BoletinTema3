import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		
		int num1 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el segundo número:");
		
		int num2 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el tercer número:");
		
		int num3 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		
		
		
		if ((num1 < num2) && (num2 < num3) && (num1 < num3)) {
			
			System.out.println(num1 + "<" + num2 + "<" + num3);
		}
		
		else if ((num1 > num2) && (num2 > num3) && (num1 > num3)) {
			
			System.out.println(num3 + "<" + num2 + "<" + num1);
		
			
		}
		
		else if ((num1 < num2) && (num2 > num3) && (num1 < num3)) {
			
			System.out.println(num1 + "<" + num3 + "<" + num2);
		}
		
		else if ((num1 < num2) && (num2 > num3) && (num1 > num3)) {
			
			System.out.println(num3 + "<" + num1 + "<" + num2);
			
		}
		
		else if ((num1 > num2) && (num2 < num3) && (num1 > num3)) {
			
			System.out.println(num2 + "<" + num3 + "<" + num1);
			
		}
		
		
		else if ((num1 > num2) && (num2 < num3) && (num1 < num3)) {
			
			System.out.println(num2 + "<" + num1 + "<" + num3);
			
		}

	}

}