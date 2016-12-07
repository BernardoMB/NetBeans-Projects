package pruebacircuo;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class PruebaCircuo {
    
    public static void main(String[] args) {

        // Ejercicio 52.
        
        Scanner lee;
        Circulo c1,c2;
        double r;
        lee = new Scanner(System.in);
        c1 = new Circulo(2.12);
        c2 = new Circulo(2.12);
        
        System.out.print("Radio de c2: ");
        r = lee.nextDouble();
        System.out.println("Perimetro de de c1: " + c1.perimetro());
        System.out.println("Perimetro de de c2: " + c2.perimetro());
        if(c1.area() > c2.area())
            System.out.println("c1 más grande");
        else
            System.out.println("c2 más grande");
        
    }
    
}
