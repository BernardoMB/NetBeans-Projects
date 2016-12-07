package universidadvectorgenericopoliformico;

public class Finanzas extends Alumno {
    private double monto;
    private double pagado;
    public Finanzas(int clave, String nombre, double monto, double pagado) {
        super(clave, nombre);
        this.monto = monto;
        this.pagado = pagado;
    }
    public void setPagado(double pagado) {
        this.pagado = pagado;
    }
    public String toString() {
        return super.toString() + "Finanzas{" + "monto=" + monto + ", pagado=" + pagado + '}';
    }
}
