package fobinacci;
import java.util.*;
/**
 * @author Bernardo Mondragón Brozon
 * Clave: 143743
 */
public class Fobinacci {
    
    public static void getFibonacci(int n) {
        /**
         * La serie de Fibonacci se obtiene con la siguiente relación
         * de recurrencia:
         * a_n = a_{n-1} + a_{n-2}.
         */
        int a = 1; // a_{n-2}
        int b = 1; // a_{n-1}
        int c; // a_n
        System.out.printf(""+a+", ");
        System.out.printf("\033[31m"+b+"\033[0m, ");
        int i; // Contador.
        for (i=0; i<=n-3; i++) {
            c = a+b;
            a=b;
            b=c;
            if (i != n-3) {
                System.out.printf("\033[3"+(i+2)+"m"+c+"\033[0m, ");
            } else {
                System.out.printf("\033[3"+(i+2)+"m"+c+"\033[0m.\n");
            }   
        }
    }
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int n;
        // Validación para n.
        do {
            System.out.println("Especificar cuántos números de la serie \nde "
                    + "Fibonacci se quieren mostrar.");
            n = myScanner.nextInt();
            if (n<=1) {
                System.out.println("\n\t\033[31m Error: especificar un número "
                        + "mayor que 1.\n");
            }
        } while (n<=1);
        // Descripción de lo que hará el programa.
        System.out.println("\nLos primeros " + n + " números de la serie de\n"
                + "Fibonacci son los siguientes:");
        getFibonacci(n);
    }
    
}
