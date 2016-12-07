package numerosamigos;
import java.util.*;

public class NumerosAmigos {
    
    public static void imprime(String string) {
        System.out.println(string);
    }
    
    public static int obtenSumaDeDivisorPropio(int num) {
        int i, limite, suma;
        limite = num/2;
        suma = 0;
        for (i = 1; i <= limite; i++) {
            if (num % i == 0) {
                suma = suma + i;
            } 
        }
        return suma;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 37.
        Scanner myScanner = new Scanner(System.in);
        int a;
        int b;
        int sA;
        int sB;
        imprime("Especificar un numero.");
        a = myScanner.nextInt();
        imprime("Especificar otro numero.");
        b = myScanner.nextInt();
        sA = obtenSumaDeDivisorPropio(a);
        sB = obtenSumaDeDivisorPropio(b);
        if (sA == b && sB == a) {
            imprime("Son amigos.");
        } else {
            imprime("No son amigos.");
        }    
        
    }
    
}
