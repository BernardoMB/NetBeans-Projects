package alumnosclasesgenericas;

public class Alumno {
    
    private int clave, ct;
    private String nombre;
    private double tareas[];
    
    // Constructor.
    public Alumno(int clave, String nombre, int ct, double tareas[]) {
        this.clave = clave;
        this.nombre = nombre;
        this.ct = ct;
        this.tareas = tareas;
    }
    
    // Otro constructor
    public Alumno(int clave) {
        this.clave = clave;
    } 
    
    public String toString() {
        String cad;
        cad = "\n\tClave: " + clave + "\n\tNombre: " + nombre + "\n\tTareas";
        for (int j = 0; j < ct; j++) {
            cad = cad + "\n\t\t" + tareas[j];
        }
        return cad;
    }
    
    // Sin este metodo propio de Equals la busqueda secuancial siempre regresa menos uno si buscamos con un objeto alumno que solo tiene clave.
    public boolean equals(Object obj) {
        Alumno aux;
        aux = (Alumno)obj;
        return this.clave == aux.clave;
    }
    
}
