import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduzca la distancia (km): ");
		
		int km = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduzca los días de estancia: ");
		
		int days = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		double price = (km*0.35)*2;
		
		System.out.println("El billete costará " + price + "€");
		
		if (km>1000 && days > 7) {
			
			price = price*0.30;
			
			System.out.println("Descuento del 30%: " + price + "€");
		}
		
		
		
		

	}

}
