package paqueteDeApps;

public class Inventario {
    private String cuenta; // cada caracter ocupa 2 bytes
    private int valor; // ocupa 4 bytes
    private boolean activo;

    public Inventario() {
        cuenta = "NC";
        valor = 0;
        activo = true;
    }

    public Inventario(String cuenta, int valor, boolean activo) {
        this.cuenta = cuenta;
        this.valor = valor;
        this.activo = activo;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "\nCuenta: " + cuenta + 
                "\t\tValor: " + valor + " " + activo;
    }   
    
    public int getTamano() {
        return getCuenta().length()*2 + 2 + 4 + 1;
    }
}