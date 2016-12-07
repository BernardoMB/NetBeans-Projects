package calculadoracompleja;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class CalculadoraCompleja {

    public static Complejo c1, c2;
    public static void leeComplejos(Scanner lee) {
        double r, im;
        System.out.print("\nComplejo 1. \n\tReal: ");
        r = lee.nextDouble();
        System.out.print(" \tImaginaria: ");
        im = lee.nextDouble();
        c1 = new Complejo(r, im);
        System.out.print("\nComplejo 2. \n\tReal: ");
        r = lee.nextDouble();
        System.out.print(" \tImaginaria: ");
        im = lee.nextDouble();
        c2 = new Complejo(r, im);
    }
    public static void operaciones(Scanner lee, int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print("\nOperacion " + i);
            leeComplejos(lee);
            System.out.print("Suma: " + c1.suma(c2) + "\n");
            System.out.print("Resta: " + c1.resta(c2) + "\n");
            System.out.print("Resta: " + c2.resta(c1) + "\n");
            System.out.print("Resta: " + c1.multiplica(c2) + "\n");
        }
    }
    public static int leeN(Scanner lee) {
        int n;
        do {
            System.out.print("Cantidad de Operaciones: ");
            n = lee.nextInt();
            if (n < 1) 
                System.out.print("ERROR: Debe ser minimo 1.");
        } while (n < 1);
        return n;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 61.
        Scanner lee;
        int n;
        lee = new Scanner(System.in);
        n = leeN(lee);
        operaciones(lee, n);
        
    }
    
}
