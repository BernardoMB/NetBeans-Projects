package empleadoherencia;

public class Empleado {
    
    private int clave;
    private String nombre;
    private double sueldo;
    
    public Empleado(int clave, String nombre, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String toString() {
        return "\n\tClave: " + clave + "\n\tNombre: " + nombre + "\n\tSueldo: $" + (int)(sueldo * 100) / 100.0;
    }
    
}
