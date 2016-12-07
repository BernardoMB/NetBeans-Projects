package empleadoherencia;

public class Vendedor extends Empleado {
    private double ventas;

    public Vendedor(int clave, String nombre, double sueldo, double ventas) {
        super(clave, nombre, sueldo);
        this.ventas = ventas;
    }
    
    public String toString() {
        return super.toString() + "\n\tVentas: $ " + (int)(ventas * 100) / 100.0;
    }
    
    // Mame
    public int compareTo(Vendedor vend) {
        if (vend.ventas > this.ventas) {
            return -1;
        } else {
            if (vend.ventas == this.ventas) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
