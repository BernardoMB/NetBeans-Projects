package sueldogerentessupermercado;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Gerente {
    
    // Atributos.
    private int clave;
    private double sueldo;
    
    // Metodos. 
    public Gerente() {}
    public Gerente(int clave, double sueldo) {
        this.clave = clave;
        this.sueldo = sueldo;
    }
    public String toString() {
        String cad;
        cad = "Clave: " + this.clave + " Sueldo: " + this.sueldo;
        return cad;
    }
    public double getSueldo() {
        double sueldo;
        sueldo = this.sueldo;
        return sueldo;
    }
    
    
    
    
}
