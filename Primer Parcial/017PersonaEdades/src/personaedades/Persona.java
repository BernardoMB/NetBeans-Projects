package personaedades;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Persona {
    
    // Atributos.
    private String nombre;
    private int edad;
    
    // Metodos.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    } 
    
    public String toString() {
        String cad;
        cad = "\n\tNombre: " + nombre + "\n\tEdad: " + edad;
        return cad;
    }
    
    public int compareTo(int e) {
        return edad - e;
    } 
}
