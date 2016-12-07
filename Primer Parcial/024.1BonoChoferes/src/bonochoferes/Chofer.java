package bonochoferes;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Chofer {
    
    // Ejercicio 53.
    
    // Atributos.
    private int clave, antiguedad;
    private String nombre;
    private char sexo;
    private double sueldo;
    
    // Metodos.
    public Chofer() {}
    public Chofer(int clave, int antiguedad, String nombre, char sexo, double sueldo) {
        this.clave = clave;
        this.antiguedad = antiguedad;
        this.nombre = nombre;
        this.sexo = sexo;
        this. sueldo = sueldo;
    }
    public String toString() {
        String cad;
        cad = "\n\tCHOFER: Clave: " + clave + " Antiguedad: " + antiguedad + " Nombre: " + nombre + " Sexo: " + sexo + " Sueldo: " + sueldo;
        return cad;
    }
    public double calculaBono() {
        double bono = 0;
        if (sexo == 'M') {
            if (antiguedad > 20) {
                // Se le considera algo exta.
                bono = 0.55 * this.sueldo + 500 * (antiguedad - 20);
            } else {
                bono = 0.55 * this.sueldo;
            }
        } else if (sexo == 'F') {
            if (antiguedad > 20) {
                // Se le considera algo exta.
                bono = 0.6 * this.sueldo + 500 * (antiguedad - 20);
            } else {
                bono = 0.6 * this.sueldo;
            }
        }
        return bono;
    }
    public int compareTo(char sexo) {
        return this.sexo - sexo;
    } 
}
