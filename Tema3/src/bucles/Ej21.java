package bucles;

import static colores.Colores.*;

public class Ej21 {

	public static void main(String[] args) {
		
		int filas;
		
		int columnas;
		
		//Creación de Casillas
		
		String casilla_blanca = FONDO_BLANCO + "  " + RESET;
		
		String casilla_negra = FONDO_NEGRO + "  " + RESET;
		
		for (filas=1; filas<=8; filas++) {
			
			for (columnas=1; columnas<=8; columnas++) {
			
				if (filas%2!=0 && columnas%2!=0) {
					
					System.out.print(casilla_negra);
					
				}
				
				else if (filas%2==0 && columnas%2==0) {
					
					System.out.print(casilla_negra);
					
				}
				
				else if (filas%2==0 && columnas%2!=0) {
					
					System.out.print(casilla_blanca);
					
				}
				
				else if (filas%2!=0 && columnas%2==0) {
					
					System.out.print(casilla_blanca);
				}
				
			
			}
		
			System.out.println();
			
		}
		

	}

}
