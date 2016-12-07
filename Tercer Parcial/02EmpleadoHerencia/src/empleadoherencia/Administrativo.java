package empleadoherencia;

public class Administrativo extends Empleado {
    
    private String puesto;
    
    public Administrativo (int clave, String nombre, double sueldo, String puesto) {
        super(clave, nombre, sueldo);
        this.puesto = puesto;
    }
    
    public String toString() {
        return super.toString() + "\n\tPuesto: " + puesto;
    }
    
    public String getPuesto() {
        return puesto;
    }
                
}
