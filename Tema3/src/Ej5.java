import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double jornal = 0.0;
		
		int turno;
		
		int festivo;
		
		System.out.println("Introducir horas trabajadas:");
		
		int hours = keyboard.nextInt();
		
		keyboard.nextLine();
		
		do {
		
			System.out.println("¿Trabajador diurno o nocturno?\n1.Diurno\n2.Nocturno");
		
			turno = keyboard.nextInt();
		
			keyboard.nextLine();
		
		} while (turno != 1 && turno != 2);
		
		do {
		
			System.out.println("¿Día festivo?\n1.Sí\n2.No.");
		
			festivo = keyboard.nextInt();
		
			keyboard.nextLine();
		
		} while (festivo != 1 && festivo != 2);
		
		
		
		keyboard.close();
		
		if (turno == 1 && festivo == 1) {
			
			jornal = 3*1.20*hours;
			
		}
		
		else if (turno == 1 && festivo == 2 ) {
				
				jornal = 3*hours;
		}
		
		else if (turno == 2 && festivo == 1) {
			
			jornal = 4.80*1.80*hours;
				
		}
		
		else if (turno == 2 && festivo == 2) {
			
			jornal = 4.80*hours;
			
		}
		
		
		System.out.printf("Tarifa: %.2f", jornal);
		
	}
	
}
		

		
		
