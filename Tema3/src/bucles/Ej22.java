package bucles;

import static colores.Colores.*;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int filas;
		
		int columnas;
		
		int colalfil;
		
		int filalfil;
		
		int res;
		
		//Creación de Casillas
		
		String casilla_blanca = FONDO_BLANCO + "  " + RESET;
		
		String casilla_negra = FONDO_NEGRO + "  " + RESET;
		
		String alfil = FONDO_ROJO + " X" + RESET;
		
		String casilla_disp = FONDO_ROJO + "  " + RESET;
		
		//
		
		do {
			
			do {
		
		// Pedir fila y columna
		
		System.out.println("¿Fila? (1-8)");
		
		filalfil = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("¿Columna? (1-8)");
		
		colalfil = keyboard.nextInt();
		
		keyboard.nextLine();
		
			} while ((filalfil < 1 || filalfil > 8) || (colalfil <= 0 || colalfil > 8));
		
		
				filalfil++;
		
		
		for (filas=1; filas<=9; filas++) {
		
			
			for (columnas=1; columnas<=9; columnas++) {
				
				int movfila=Math.abs(filalfil-filas);
				
				int movcol=Math.abs(colalfil-columnas);
				
				if (filas == 1) {
					
					if (columnas <= 8) {
					
					System.out.print(" " + columnas);
					
					}
					
				}
				
				else if (filas > 1 && filas <=9) {
			
					if (filas%2!=0 && columnas%2!=0) {
						
						
						
						if (columnas < 9) {
							
							if (filalfil == filas && colalfil == columnas) {
								
								System.out.print(alfil);
								
							}
							
							else if (movfila == movcol) {
								
								System.out.print(casilla_disp);
								
							}
						
							
							
							else {
					
							System.out.print(casilla_negra);
							
							}
							
						}
						
						else if (columnas == 9) {
							
							System.out.print(filas-1);
							
						}
					
					}
				
					else if (filas%2==0 && columnas%2==0) {
						
						if (filalfil == filas && colalfil == columnas) {
							
							System.out.print(alfil);
							
						}
						
						else if (movfila == movcol) {
							
							System.out.print(casilla_disp);
							
						}
						
						
						else {
					
							System.out.print(casilla_negra);
							
						}
					
					}
				
					else if (filas%2==0 && columnas%2!=0) {
						
						if (columnas < 9) {
							
							if (filalfil == filas && colalfil == columnas) {
								
								System.out.print(alfil);
								
							}
							
							else if (movfila == movcol) {
								
								System.out.print(casilla_disp);
								
							}
							
							
							else {
							
							System.out.print(casilla_blanca);
							
							}
							
						}
						
						else if (columnas == 9) {
							
							System.out.print(filas-1);
							
						}
					
					
					
					}
				
					else if (filas%2!=0 && columnas%2==0) {
						
						if (filalfil == filas && colalfil == columnas) {
							
							System.out.print(alfil);
							
						}
						
						else if (movfila == movcol) {
							
							System.out.print(casilla_disp);
							
						}
						
						
						
						else {
					
							System.out.print(casilla_blanca);
					
						}
					}
				
				}
				
			
				
			
			}
		
			System.out.println();
			
		}
		
		do {
		
		System.out.println("¿Quieres probar otra vez?\n1.Sí\n2.No");
		
		res = keyboard.nextInt();
		
		} while (res != 1 && res !=2);
		
		
		
		} while (res != 2);
		
		keyboard.close();
		

	}

}
