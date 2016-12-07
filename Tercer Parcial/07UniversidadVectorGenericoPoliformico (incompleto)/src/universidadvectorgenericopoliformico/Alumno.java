package universidadvectorgenericopoliformico;

public class Alumno {
    private int clave;
    private String nombre;
    public Alumno(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }
    public Alumno() {
        
    }
    public int compareTo(Alumno g) {
        return nombre.compareTo(g.nombre);
    }
    public String toString() {
        return "Alumno{" + "clave=" + clave + ", nombre=" + nombre + '}';
    }
}
