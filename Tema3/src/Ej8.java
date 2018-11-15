import static colores.Colores.*;

import java.util.Random;

public class Ej8 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int suit = random.nextInt(4)+1;
		
		int card = random.nextInt(13)+1;
		
		String card_string = String.valueOf(card);
		
		String suit_symbol = "";
		
		String suit_string = "";
		
		
		
		switch (suit) {
		
			case 1: suit_symbol = "\u2660";
		
					suit_string = "Picas";
				
					break;
				
			case 2: suit_symbol = ROJO + "\u2665" + RESET;
		
					suit_string = "Corazones";
		
					break;
				
			case 3: suit_symbol = ROJO + "\u2666" + RESET;
		
					suit_string = "Diamantes";

					break;
				
			case 4: suit_symbol = "\u2663";
		
					suit_string = "Tréboles";

					break;
				
				}
		
		
		switch (card) {
		
			case 1: card_string = "as";
			break;
		
			case 11:  card_string = "jota";
			break;
		
			case 12: card_string = "reina";
			break;
		
			case 13: card_string = "rey";
			break;
		
		}
		
		System.out.printf("Has sacado la siguiente carta: %s de %s (%s)", card_string, suit_string, suit_symbol); 
		
		

	}

}
