package pruebacircuo;
/**
 * clave: 143743
 * @author Bernardo
 */
public class Circulo {
    
    // Atributos.
    private double radio;

    // Métodos.
    public Circulo(double radio)
    {
        this.radio = radio;
    }
    
    public double perimetro()
    {
        return Math.PI * 2 * radio;
    }
    
    public double area()
    {
        return Math.PI * radio * radio;
    }
    
    // toString();
    // Sobre cargamos la función toString porque ahora el programa tiene dos definiciones para toString().
    // Para efectos de nuestra clase, siempre cada objeto debe de tener su metodo toString();
    public String toString() {
        String cad = "Object";
        return cad;
    }
}


