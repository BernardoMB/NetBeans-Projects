package bonochoferes;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class BonoChoferes {
    
    public static Chofer creaChofer(Scanner lee) {
        int cl, ant;        
        String nom, sexo;
        double s;
        System.out.print("\nClave: ");
        cl = lee.nextInt();
        lee.nextLine();
        System.out.print("Nombre: ");
        nom = lee.nextLine();
        System.out.print("Sexo: ");
        sexo = lee.nextLine().toUpperCase();
        System.out.print("Antiguedad: ");
        ant = lee.nextInt();
        System.out.print("Sueldo: $");
        s = lee.nextDouble();
        return new Chofer(cl, ant, nom, sexo.charAt(0),  s);
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 57.
        Scanner lee;
        Chofer c1, c2, c3;
        int continuar, h, m;
        lee = new Scanner(System.in);
        h = 0; // Cantidad de hombres.
        m = 0; // Cantidad de mujeres.
        c1 = creaChofer(lee);
        c2 = creaChofer(lee);
        c3 = creaChofer(lee);
        System.out.println("\n\n\tCHOFERES:\n");
        System.out.println("1.\n" + c1 + "\n2.\n" + c2 + "\n3.\n" + c3 + "\n");
        System.out.print("\nDesea calcular un bono (1. Si, 2. No)? ");
        continuar = lee.nextInt();
        if (continuar == 1) {
            System.out.print("\nBono de c1: $" + c1.calculaBono() + "\n");
            System.out.print("\nDesea calcular un bono (1. Si, 2. No)? ");
            continuar = lee.nextInt();
            if (continuar == 1) {
                System.out.print("\nBono de c2: $" + c2.calculaBono() + "\n");
                System.out.print("\nDesea calcular un bono (1. Si, 2. No)? ");
                continuar = lee.nextInt();
                if (continuar == 1) {
                    System.out.print("\nBono de c3: $" + c3.calculaBono() + "\n");
                }
            }
        }
        
        if (c1.compareTo('F') == 0)
            m = m + 1;
        else 
            h = h + 1;
        if (c2.compareTo('F') == 0)
            m = m + 1;
        else 
            h = h + 1;
        if (c3.compareTo('F') == 0)
            m = m + 1;
        else 
            h = h + 1;
        
        System.out.println("\n\nCantidad de mujeres: " + m + "\nCantidad de hombres: " + h + "\n\nTotal de choferes: " + (h + m));
        
    }
    
}
