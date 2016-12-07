package adivina3;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Adivina3 {
    
    // Ejercicio 70.
    public static void main(String[] args) {    
        Scanner lee;
        int n, i, numD;
        NumeroBinario bin;
        lee = new Scanner(System.in);
        System.out.print("Cantidad de números: ");
        n = lee.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("\nDecimal " + i + ": ");
            numD = lee.nextInt();
            bin = new NumeroBinario(numD);
            System.out.println("Binario: " + bin);
        }
        bin = new NumeroBinario(23);
        for (i = 4; i >= 0; i--) {
            if (bin.compareTo(i) == 0)
                System.out.println("Si tiene 1 en " + i);
        }
    }
    
}
