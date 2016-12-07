package oficina;
/**
 * clave: 143743
 * @author Bernardo
 */
public class Circulo {

    //Atributos
    private double radio;
    //Métodos
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
    
}
