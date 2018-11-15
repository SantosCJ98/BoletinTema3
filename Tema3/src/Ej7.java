import java.util.Random;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Escriba una cadena: ");
		
		String s = keyboard.nextLine();
		
		keyboard.close();
		
		int getindex = random.nextInt(s.length());
		
		char randomchar = s.charAt(getindex);
		
		System.out.printf("Caracter aleatorio: %s\tÍndice: %d", randomchar, getindex);
		
	}

}
