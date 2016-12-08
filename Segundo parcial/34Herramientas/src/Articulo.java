public class Articulo {
    // Atributos.
    public String nombre;
    public double precio;
    public int tipo;
    
    // Constructor.
    public Articulo(String nombre, double precio, int tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    // toString.
    public String toString() {
        return "\nTipo: " + tipo + "\nNombre: " + nombre + "\nPrecio: $" + precio;
    }
    
    // compareTo.
    public int compareTo(String nom) {
        return this.nombre.compareTo(nom);
    }
}