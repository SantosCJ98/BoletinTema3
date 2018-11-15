package bucles;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Random random = new Random();
		
		int tipo=random.nextInt(3)+1;
		
		String vocales="aeiou";
		
		String consonantes="bcdfghjklmnpqrstvwxyz";
		
		int tipores=0;
	
		boolean tipoadivinado=false;
		
		int dosintentos=0;
		
		int intentosjuego=0;
		
		boolean adivinado=false;
		
		int cosres;
		
		boolean trampas=false;
		
		char charnum=' ';
		
		int numale2=0;
		
		int index_cos=random.nextInt(21);
		
		do {
		
		if (tipo == 1) {
			
			System.out.println("¿Es un número?\n1.Sí\n2.No");
			
			tipores=keyboard.nextInt();
			
			keyboard.nextLine();
			
			if (tipores == 1) {
				
				tipoadivinado=true;
			
				
			}
			
			else if(tipores==2) {
			
				
				tipo++;
				
				dosintentos++;
				
			}
			
			
			
		}
		
		else if (tipo == 2) {
			
			System.out.println("¿Es una vocal?\n1.Sí\n2.No");
			
			tipores=keyboard.nextInt();
			
			keyboard.nextLine();
			
			if (tipores == 1) {
				
				tipoadivinado=true;
				
				
			}
			
			else if(tipores==2) {
				
				
				tipo++;
				
				dosintentos++;
				
			}
			
			
			
		}
		
		else if (tipo == 3) {
			
			System.out.println("¿Es una consonante?\n1.Sí\n2.No");
			
			tipores=keyboard.nextInt();
			
			keyboard.nextLine();
			
			if (tipores == 1) {
				
				tipoadivinado=true;
				
				
			}
			
			else if (tipores==2) {
				
				tipo-=2;
				dosintentos++;
			}
			
			
			
		}
		
		} while (tipoadivinado != true && dosintentos!=2);
		
		if (tipoadivinado == true) {
			
			if (tipo==1) {
				
				System.out.println("¿Qué número tengo que adivinar?");
				
				String numale=keyboard.nextLine();
				
				charnum = numale.charAt(0);
				
				
				int maqnum=random.nextInt(10);
				
				System.out.println("Hay que adivinar " + numale);
				
				while (intentosjuego != 3) {
					
					if (Character.isDigit(charnum) == true) {
						
						numale2 = Character.getNumericValue(charnum);
						
						if (maqnum > numale2) {
							
							System.out.println("Es menor que " + maqnum);
							
							maqnum--;
							
							intentosjuego++;
							
						}
							
						else if (maqnum < numale2) {
								
							System.out.println("Es mayor que " + maqnum);
								
							maqnum++;
								
							intentosjuego++;
							
						}
						
						else if (maqnum == numale2) {
							
							System.out.println("El número " + maqnum + " ha sido adivinado");
							
							adivinado=true;
							
							break;
						}
							
						}
						
					else if (Character.isDigit(charnum) != true) {
							
						System.out.println("Has intentado engañarme. ¡Tramposo!");
						
						trampas=true;
						
						break;
								
							}
					
					
					
					
				}
				
			}
			
			else if (tipo == 2) {
			
			System.out.println("¿Qué vocal tengo que adivinar?");
			
			String resv = keyboard.nextLine();
			
			Character resvocal = resv.charAt(0);
			
			System.out.println("Hay que adivinar " + resvocal);
			
			char maqvoc=vocales.charAt(random.nextInt(5));
			
			while (intentosjuego != 2) {
				
				if (Character.isLetter(resvocal) == true) {
					
					if (resvocal.equals('a') || resvocal.equals('e') || resvocal.equals('i') || resvocal.equals('o') || resvocal.equals('u')) {
						
						if (maqvoc != resvocal) {
							
							
							System.out.println("No es " + maqvoc);
							
							maqvoc=vocales.charAt(random.nextInt(5));
							
							intentosjuego++;
							
						}
						
						
						else if (maqvoc == resvocal) {
							
							System.out.println("La vocal " + maqvoc + " ha sido adivinada");
							
							adivinado=true;
							
							break;
							
						}
							
						
					}
					
					else {
						
						System.out.println("Has intentado engañarme. ¡Tramposo!");
							
							trampas=true;
							
							break;
						}
					}
				
				else {
					
					System.out.println("Has intentado engañarme. ¡Tramposo!");
					
					trampas=true;
					
					break;
				}
					
				}
			
			
				
			}
			
			else if (tipo == 3) {
				
				System.out.println("¿Qué consonante tengo que adivinar?");
				
				String resc = keyboard.nextLine();
				
				Character rescons = resc.charAt(0);
				
				System.out.println("Hay que adivinar " + rescons);
				
				char maqcons=consonantes.charAt(index_cos);
				
				while (intentosjuego != 5) {
					
					if (Character.isLetter(rescons) == true) {
						
						if (rescons.equals('b') || rescons.equals('c') || rescons.equals('d') || rescons.equals('f') || rescons.equals('g') || rescons.equals('h') || rescons.equals('j') || rescons.equals('k') || rescons.equals('l') || rescons.equals('m') || rescons.equals('n') || rescons.equals('p') || rescons.equals('q') || rescons.equals('r') || rescons.equals('s') || rescons.equals('t') || rescons.equals('v') || rescons.equals('w') || rescons.equals('x') || rescons.equals('y') || rescons.equals('z')) {
							
							if (maqcons != rescons) {
								
								do {
									
									System.out.println("¿Es mayor o menor que " + maqcons +"?\n1.Mayor\n2.Menor");
									
									cosres = keyboard.nextInt();
									
									keyboard.nextLine();
					
								} while (cosres != 1 && cosres != 2);
								
								if (cosres == 1) {
									
									if (index_cos != 20) {
										
										index_cos++;
										
										maqcons=consonantes.charAt(index_cos);
										
										intentosjuego++;
										
										
										
									}
									
									else {
										
										System.out.println("Has intentado engañarme. ¡Tramposo!");
										
										trampas=true;
										
										break;
										
									}
									
									
								}
								
								else if (cosres == 2) {
									
									if (index_cos != 0) {
										
										index_cos--;
										
										maqcons=consonantes.charAt(index_cos);
										
										intentosjuego++;
										
									}
									
									else {
										
										System.out.println("Has intentado engañarme. ¡Tramposo!");
										
										trampas=true;
										
										break;
										
									}
									
								}
								
							}
							
							
							else if (maqcons == rescons) {
								
								System.out.println("La consonante " + maqcons + " ha sido adivinada");
								
								adivinado=true;
								
								break;
								
							}
								
							
						}
						
						else {
							
							System.out.println("Has intentado engañarme. ¡Tramposo!");
								
								trampas=true;
								
								break;
							}
						}
					
					else {
						
						System.out.println("Has intentado engañarme. ¡Tramposo!");
						
						trampas=true;
						
						break;
					}
						
					}
				
				
					
				}
			
				
				
		
				
				
				
		}
					keyboard.close();
			
			if (adivinado == false && trampas == false) {
				
				System.out.println("Al ordenador se le han acabado los intentos");
				
			}
			
		
		
		else if (tipoadivinado != true) {
			
			System.out.println("El ordenador no ha adivinado el tipo");
		

		}
			
	
		
		
	}

}
