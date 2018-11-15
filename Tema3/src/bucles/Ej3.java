package bucles;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		int count;
		
		int note;
		
		Scanner keyboard = new Scanner(System.in);
		
		for (count = 1; count<=10; count++) {
			
			do {
				
			
			System.out.println("Introduzca la nota del alumno nº " + count);
			
			note = keyboard.nextInt();
			
			keyboard.nextLine();
			
			} while (note < 0 || note > 10);
			
			switch (note) {
			
				case 0: case 1: case 2: System.out.println("Muy deficiente");
			
				break;
			
				case 3: case 4: System.out.println("Insuficiente");
			
				break;
			
				case 5: System.out.println("Aprobado");
			
				break;
			
				case 6: System.out.println("Bien");
			
				break;
			
				case 7: case 8: System.out.println("Notable");
			
				break;
			
				case 9: case 10: System.out.println("Sobresaliente");
			
				break;
				
				default: System.out.println("Error");
				
				break;
			}
			
			
			
		}
		
		keyboard.close();
		
		

	}

}
