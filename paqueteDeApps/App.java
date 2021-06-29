package paqueteDeApps;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
	static Scanner entrada = new Scanner(System.in);
	static Scanner entradaA = new Scanner(System.in);
	
	//private static String leer(String msj) {
	//	System.out.println(msj);
	//	return entrada.nextLine();
	//}

	public static void main(String[] args) {
		AccesoAleatorio inv = new AccesoAleatorio();
		
		int app;
		
		System.out.println("Que desea hacer?"
				+ "\n1. Guardar cuenta"
				+ "\n2. Buscar cuenta"
				+ "\n3. eliminar cuenta"
				+ "\n4. salir");
		app = entrada.nextInt();
		
		do {
		switch(app) {
		
		//guargar datos en archivos
		case 1:
		try {
			inv.crearFileAlumno(new File("cuentas.dat"));
			for(int i = 0; i < 1; i++) {
				System.out.println("Datos de Inventario ");
				System.out.print("Ingrese cuenta: ");
				String cuenta = entradaA.nextLine();
				System.out.print("Ingrese Valor: ");
				int valor = entrada.nextInt();
				inv.agregarInventario(new Inventario(cuenta, valor, true));
			}
			inv.cerrar();
		}catch(IOException e) {}
		break;

		//leer datos del archivo al programa
		case 2:
		try {
			inv.crearFileAlumno(new File("cuentas.dat"));
			for(int i = 0; i < inv.getNumeroRegistros(); i++) {
				System.out.println(inv.getInventario(i));
			}
			inv.cerrar();
		}catch(IOException ex) {}
		break;
		
		case  3: 
			try {
				AccesoAleatorio.crearFileAlumno(new File("cuentas.dat"));
				System.out.print("Cuenta a eliminar: ");
				String eCuenta = entradaA.nextLine();
				if(AccesoAleatorio.eliminarInventario(eCuenta)) {
					System.out.println("El registro correspondiente fue eliminado correctamente\n");
				}else {
					System.out.println("Error en la eliminacion del registro inexistente\n");
				}
			} catch (IOException eo) {
				System.out.println("Error en la eliminacion de registros\n");
			}
			break;
		
		case 4: break;
		
		default: 
			System.out.println("La opcion que usted eligio no es valida.");
			System.out.println("Que desea hacer?"
					+ "\n1. Guardar cuenta"
					+ "\n2. Buscar cuenta"
					+ "\n3. eliminar cuenta"
					+ "\n4. salir");
			app = entrada.nextInt();
		}
		
		//temporal ya que se repite cuando das salir por primera vez
		System.out.println("\nQue desea hacer?"
				+ "\n1. Guardar cuenta"
				+ "\n2. Buscar cuenta"
				+ "\n3. eliminar cuenta"
				+ "\n4. salir");
		app = entrada.nextInt();
		
		}while(app != 4);
		
		System.out.println("Muchas gracias por visitarnos!");
	    System.out.println("Vuelva pronto!");
	    
		
	}
	
	
	
	private void initComponents() {
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
   // setTitle("Archivos :: Acceso Aleatorio");
    //setMinimumSize(new java.awt.Dimension(244, 355));
	//addWindowListener(new java.awt.event.WindowAdapter() {
        public void ventanaCerrada(java.awt.event.WindowEvent evt) {
        	alCerrarVentana(evt);
        }
   // });
	}
	
	//public void ventanaCerrada(java.awt.event.WindowEvent evt) {
    //    alCerrarVentana(evt);
    //}
	
	private void alCerrarVentana(java.awt.event.WindowEvent evt) {
        try {
            AccesoAleatorio.compactarArchivo(new File("personas.dat"));
        } catch (IOException ex) {
            System.out.println("Error al tratar de compactar el archivo");
        }
	}
}
