package universidad;

public class Alumno implements Comparable<Alumno> {
    private int clave;
    private String nombre;

    public Alumno(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public String toString() {
        return "Alumno{" + "clave=" + clave + ", nombre=" + nombre + '}';
    }
    
    public int compareTo(Alumno alumno) {
        if (alumno.clave < this.clave) {
            return 1;
        } else {
            if (alumno.clave == this.clave) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
