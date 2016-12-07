package pruebarectangulo;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Rectangulo {
    
    // Ejercicio 51.
    // Clase Rectangulo.
    
    //Atributos
    private double base;
    private double altura;
    
//Métodos
    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double perimetro()
    {
        return 2 *altura +  2 * base;
    }

    public double area()
    {
        return base * altura;
    }
    
}
