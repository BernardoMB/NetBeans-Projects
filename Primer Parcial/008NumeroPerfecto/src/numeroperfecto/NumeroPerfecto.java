package numeroperfecto;
import java.util.*;

public class NumeroPerfecto {
    
    /// <summary>
    /// Imprime a la consola.
    /// </summary>
    /// <param name="string">Es el string que se va a imprimir.</param>
    /// <remarks>
    /// </remarks>
    public static void imprime(String string) {
        System.out.println(string);
    }
    
    /// <summary>
    /// Indica si un numero es perfecto o no es perfecto
    /// </summary>
    /// <param name="num">Es el numero sobre el cual se quiere saber si es perfecto</param>
    /// <remarks>
    /// Un numero es perfecto si la suma de sus divisores propios es igual al numero.
    /// </remarks>
    public static boolean esPerfecto(int num) {
        int i, limite, suma;
        limite = num/2;
        suma = 0;
        for (i = 1; i <= limite; i++) {
            if (num % i == 0) {
                suma = suma + i;
            } 
        }
        return suma == num;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 35.
        Scanner myScanner = new Scanner(System.in);
        int num;
        do {
            imprime("Especificar numero:\n");
            num = myScanner.nextInt();
            if (num < 0) {
                imprime("\n\tError: el numero no puede ser negativo.");
            }
        } while (num < 0);
        boolean bool = esPerfecto(num);
        if (bool) {
            imprime("\n" + num + " es un numero perfecto");
        } else {
            imprime("\nEl numero no es perfecto.");
        }
        
    }
    
}
