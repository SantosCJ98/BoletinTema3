package bucles;

import java.util.Random;

public class Ej4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int count;
		
		for (count=1; count<=20; count++) {
			
			System.out.printf("%d \n", random.nextInt(6)+1);
			
		}

	}

}
