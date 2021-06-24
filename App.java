package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		Prisma prisma = new Prisma(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Cilindro cilindro = new Cilindro(0, 0, 0, 0, 0, 0, 0, 0);
		Piramide piramide = new Piramide(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Cono cono = new Cono(0, 0, 0, 0, 0, 0, 0, 0, 0);
		Esfera esfera = new Esfera(0, 0, 0, 0, 0);
		ZonaEsferica zonaEsferica = new ZonaEsferica(0, 0, 0, 0, 0, 0, 0);
		CasqueteEsferico casqueteEsferico = new CasqueteEsferico(0, 0, 0, 0, 0);
		TroncoDeCono troncoDeCono = new TroncoDeCono(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		TroncoDePiramide troncoDePiramide = new TroncoDePiramide(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		HusoYCunaEsferica husoYCunaEsferica = new HusoYCunaEsferica(0, 0, 0, 0, 0, 0, 0);
		Ortoedro ortoedro = new Ortoedro(0, 0, 0, 0, 0, 0, 0);
		Tetraedro tetraedro = new Tetraedro(0, 0, 0, 0, 0, 0);
		Hexaedro hexaedro = new Hexaedro(0, 0, 0, 0, 0, 0);
		Octaedro octaedro = new Octaedro(0, 0, 0, 0, 0, 0);
		Dodecaedro dodecaedro = new Dodecaedro(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Icosaedro icosaedro = new Icosaedro(0, 0, 0, 0, 0);
		
		int comprobacion = 2, app = 0;
		
		
		do {
			comprobacion = 2;
		try{
			System.out.println("\nBienvenido!. Seleccione una opcion\n"
				       + "1. Prisma\n"
					   + "2. Cilindro\n"
					   + "3. Piramide\n"
					   + "4. Cono\n"
					   + "5. Esfera\n"
					   + "6. Esfera Zona esferica\n"
					   + "7. Esfera Casquete esferico\n"
					   + "8. Tronco de cono\n"
					   + "9. Tronco de piramide\n"
					   + "10. Huso esferico y cuña esferica\n"
					   + "11. Ortoedro\n"
					   + "12. Tetraedro\n"
					   + "13. Hexaedro\n"
					   + "14. Octaedro\n"
					   + "15. Dodecaedro\n"
					   + "16. Icosaedro\n"
				       + "17. Salir");
			app = entrada.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir uno de los numeros indicados en la aplicacion\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
		
		do {
			 switch(app){
					
					case 1:
						System.out.println("\n----Prisma----\n");
						prisma.pedirPrisma(entrada);
						prisma.calcularPrisma();
						prisma.mostrarDatos();
						prisma.forma();
						prisma.color();
						break;
						
					case 2: 
						System.out.println("\n----Cilindro----\n");
						cilindro.pedirCilindro(entrada);
						cilindro.calcularCilindro(2);
						cilindro.mostrarDatos();
						cilindro.forma();
						cilindro.color();
						break;
						
					case 3: 
						System.out.println("\n----Piramide----\n");
						piramide.pedirPiramide(entrada);
						piramide.calcularPiramide(2, 4);
						piramide.mostrarDatos();
						piramide.forma();
						piramide.color();
						break;
						
					case 4:
						System.out.println("\n----Cono----\n");
						cono.pedirCono(entrada);
						cono.calcularCono(2);
						cono.mostrarDatos();
						cono.forma();
						cono.color();
						break;
						
					case 5: 
						System.out.println("\n----Esfera----\n");
						esfera.pedirEsfera(entrada);
						esfera.calcularEsfera(2, 3);
						esfera.mostrarDatos();
						esfera.forma();
						esfera.color();
						break;
						
					case 6: 
						System.out.println("\n----Esfera Zona esferica----\n");
						zonaEsferica.pedirZonaEsferica(entrada);
						zonaEsferica.calcularZonaEsferica(2);
						zonaEsferica.mostrarDatos();
						zonaEsferica.forma();
						zonaEsferica.color();
						break;
						
					case 7: 
						System.out.println("\n----Esfera Casquete Esferico----\n");
						casqueteEsferico.pedirCasqueteEsferico(entrada);
						casqueteEsferico.calcularCasqueteEsferico(2);
						casqueteEsferico.mostrarDatos();
						casqueteEsferico.forma();
						casqueteEsferico.color();
						break;
						
					case 8: 
						System.out.println("\n----Tronco de cono----\n");
						troncoDeCono.pedirTroncoDeCono(entrada);
						troncoDeCono.calcularTroncoDeCono(2);
						troncoDeCono.mostrarDatos();
						troncoDeCono.forma();
						troncoDeCono.color();
						break;
						
					case 9: 
						System.out.println("\n----Tronco de piramide----\n");
						troncoDePiramide.pedirTroncoDePiramide(entrada);
						troncoDePiramide.calcularTroncoDePiramide(2, 4);
						troncoDePiramide.mostrarDatos();
						troncoDePiramide.forma();
						troncoDePiramide.color();
						break;
						
					case 10: 
						System.out.println("\n----Huso esferico y cuña esferica----\n");
						husoYCunaEsferica.pedirHusoYCunaEsferica(entrada);
						husoYCunaEsferica.CalcularHusoYCunaEsferica(2, 3);
						husoYCunaEsferica.mostrarDatos();
						husoYCunaEsferica.forma();
						husoYCunaEsferica.color();
						break;
						
					case 11: 
						System.out.println("\n----Ortoedro----\n");
						ortoedro.pedirOrtoedro(entrada);
						ortoedro.calcularOrtoedro(2);
						ortoedro.mostrarDatos();
						ortoedro.forma();
						ortoedro.color();
						break;
						
					case 12: 
						System.out.println("\n----Tetraedro----\n");
						tetraedro.PedirTetraedro(entrada);
						tetraedro.CalcularTetraedro(2, 3);
						tetraedro.mostrarDatos();
						tetraedro.forma();
						tetraedro.color();
						break;
						
					case 13: 
						System.out.println("\n----Hexaedro----\n");
						hexaedro.PedirHexaedro(entrada);
						hexaedro.CalcularHexaedro(2, 3);
						hexaedro.mostrarDatos();
						hexaedro.forma();
						hexaedro.color();
						break;
						
					case 14: 
						System.out.println("\n----Octaedro----\n");
						octaedro.PedirOctaedro(entrada);
						octaedro.CalcularOctaedro(2, 3);
						octaedro.mostrarDatos();
						octaedro.forma();
						octaedro.color();
						break;
						
					case 15: 
						System.out.println("\n----Dodecaedro----\n");
						dodecaedro.PedirDodecaedro(entrada);
						dodecaedro.CalcularDodecaedro(5, 2, 3);
						dodecaedro.mostrarDatos();
						dodecaedro.forma();
						dodecaedro.color();
						break;
						
					case 16: 
						System.out.println("\n----Icosaedro----\n");
						icosaedro.PedirIcosaedro(entrada);
						icosaedro.CalcularIcosaedro(2, 3);
						icosaedro.mostrarDatos();
						icosaedro.forma();
						icosaedro.color();
						break;
					
					case 17: break;
					
					default: 
						System.out.println("La opcion que usted eligio no es valida.\n");
						do {
							comprobacion = 2;
						try{
							System.out.println("\nBienvenido!. Seleccione una opcion\n"
								       + "1. Prisma\n"
									   + "2. Cilindro\n"
									   + "3. Piramide\n"
									   + "4. Cono\n"
									   + "5. Esfera\n"
									   + "6. Esfera Zona esferica\n"
									   + "7. Esfera Casquete esferico\n"
									   + "8. Tronco de cono\n"
									   + "9. Tronco de piramide\n"
									   + "10. Huso esferico y cuña esferica\n"
									   + "11. Ortoedro\n"
									   + "12. Tetraedro\n"
									   + "13. Hexaedro\n"
									   + "14. Octaedro\n"
									   + "15. Dodecaedro\n"
									   + "16. Icosaedro\n"
								       + "17. Salir");
							app = entrada.nextInt();
						}catch(InputMismatchException ex) {
							System.out.println("Debe de introducir uno de los numeros indicados en la aplicacion\n");
							entrada.nextLine();
							comprobacion = 1;
						}
						}while(comprobacion != 2);
				 }
			 
			 do {
					comprobacion = 2;
				try{
					System.out.println("\nQue desea hacer?\n"
						       + "1. Prisma\n"
							   + "2. Cilindro\n"
							   + "3. Piramide\n"
							   + "4. Cono\n"
							   + "5. Esfera\n"
							   + "6. Esfera Zona esferica\n"
							   + "7. Esfera Casquete esferico\n"
							   + "8. Tronco de cono\n"
							   + "9. Tronco de piramide\n"
							   + "10. Huso esferico y cuña esferica\n"
							   + "11. Ortoedro\n"
							   + "12. Tetraedro\n"
							   + "13. Hexaedro\n"
							   + "14. Octaedro\n"
							   + "15. Dodecaedro\n"
							   + "16. Icosaedro\n"
						       + "17. Salir");
					app = entrada.nextInt();
				}catch(InputMismatchException ex) {
					System.out.println("Debe de introducir uno de los numeros indicados en la aplicacion\n");
					entrada.nextLine();
					comprobacion = 1;
				}
				}while(comprobacion != 2);
			 
		}while(app != 17);
		
		System.out.println("Muchas gracias por utilizar el programa!");
	    System.out.println("Vuelva pronto!");
		
	}
}
