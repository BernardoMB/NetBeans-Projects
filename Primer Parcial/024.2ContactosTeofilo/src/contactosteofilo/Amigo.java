package contactosteofilo;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Amigo {
    
    // Ejercicio 60.
    
    // Atributos.
    @SuppressWarnings("FieldMayBeFinal")
    private String nombre, telefono, actividad;
    private int edad;
    
    // Metodos.
    public Amigo(String nombre, String telefono, String actividad, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.actividad = actividad;
        this.edad = edad;
    }
    public String toString(){
        return "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nActividad: " + actividad + "\nEdad: " + edad;         
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int compareTo(String actividad) {
        return this.actividad.compareTo(actividad);
    }
    public int compareTo(int e) {
        return edad - e;
    }
}
