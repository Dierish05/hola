package paqueteDeApps;

import java.io.*;

public class AccesoAleatorio {

    private static RandomAccessFile flujo;
    private static int numeroRegistros;
    private static int tamanoRegistro = 80;

    public static void crearFileAlumno(File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil((double) flujo.length() / (double) tamanoRegistro);
      //math.ceil es un aproximacion hacia el entero superior: 2.3 a 3 como ejem
    }

    public static void cerrar() throws IOException {
        flujo.close();
    }

    public static boolean setInventario(int i, Inventario inventario) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(inventario.getTamano() > tamanoRegistro) {
                System.out.println("\nTamano de registro excedido.");
            } else {
                flujo.seek(i*tamanoRegistro);
                flujo.writeUTF(inventario.getCuenta());
                flujo.writeInt(inventario.getValor());
                flujo.writeBoolean(inventario.isActivo());
                return true;
            }
        } else {
            System.out.println("\nNumero de registro fuera de limites.");
        }
        return false;
    }

    private static int buscarRegistroInactivo() throws IOException {
        String cuenta;
        for(int i=0; i<getNumeroRegistros(); i++)  {
            flujo.seek(i * tamanoRegistro);
            if(!getInventario(i).isActivo()) 
                return i;
        }
        return -1;        
    }
    
    public static boolean eliminarInventario(String aEliminar) throws IOException {//eliminacion de manera logica
        int pos = buscarRegistro(aEliminar);
        if(pos == -1) return false;
        Inventario inventarioEliminado = getInventario(pos);
        inventarioEliminado.setActivo(false);
        setInventario(pos, inventarioEliminado);
        return true;
    }
    
    public static void compactarArchivo(File archivo) throws IOException {//eliminacion de manera fisica
        crearFileAlumno(archivo); // Abrimos el flujo.
        Inventario[] listado = new Inventario[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = getInventario(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.

        File tempo = new File("temporal.dat");
        crearFileAlumno(tempo); // Como no existe se crea.
        for(Inventario in : listado)
            if(in.isActivo())
                agregarInventario(in);
        cerrar();
        
        tempo.renameTo(archivo); // Renombramos.
    }
    
    public static void agregarInventario(Inventario inventario) throws IOException {
        int inactivo = buscarRegistroInactivo();
        if(inactivo == -1) {
        	if(setInventario(numeroRegistros, inventario)) 
                numeroRegistros++; 
        }else {
        	if(setInventario(inactivo, inventario)) 
                numeroRegistros++; 
        }  
        
    }

    public static int getNumeroRegistros() {
        return numeroRegistros;
    }

    public static Inventario getInventario(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamanoRegistro);
            return new Inventario(flujo.readUTF(), flujo.readInt(), flujo.readBoolean());
        } else {
            System.out.println("\nNumero de registro fuera de limites.");
            return null;
        }
    }

    public static int buscarRegistro(String buscado) throws IOException {
        Inventario in;
        if (buscado == null) {
            return -1;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            flujo.seek(i * tamanoRegistro);
            in = getInventario(i);
            if(in.getCuenta().equals(buscado) && in.isActivo()) {
                return i;
            }
        }
        return -1;
    }
    
}