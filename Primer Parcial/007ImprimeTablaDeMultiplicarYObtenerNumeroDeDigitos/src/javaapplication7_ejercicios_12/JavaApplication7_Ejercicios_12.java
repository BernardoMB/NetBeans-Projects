package javaapplication7_ejercicios_12;
import java.util.*;

public class JavaApplication7_Ejercicios_12 {

    public static void log(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        
        // Tabla de multiplicar.
        /*System.out.println("Especificar número.");
        int entero;
        do {
            Scanner myScanner = new Scanner(System.in);
            entero = myScanner.nextInt();
            if (entero <= 0) {
                System.out.println("\n\t\033[31m\" Error: debe ser mayor a cero.");
            }
        } while (entero < 0);
        
        int limite = 10;
        System.out.printf("Entero: " + entero + "\n");
        for (int i = 0; i<=limite ; i++) {
            System.out.printf("%12d%12d\n", i, entero*i);
        }*/
        
        // Ejercicio 17.
        // Obtener numero de digitos de un numero.
        /*System.out.printf("Especificar numero.");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        int aux;
        double pot10;
        int digitos = 0;
        aux = num;
        while (aux > 0) {
            digitos = digitos + 1;
            aux = aux/10;
        }
        
        System.out.printf("Numero de digitos del numero especificado: " + digitos + "\n");
        
        pot10 = (int)Math.pow(10, digitos -1);
        for (int i = 1; i <= digitos; i++) {
            
            if (aux < 10) {
                log("" + aux);
            } else {
                log("" +  (aux/pot10) + "-" );
            }
            aux = (int) (aux % pot10);
            pot10 = pot10/10;
        }
        log("\n\n");*/
        
        // Ejercicio 15.
        
        int digito;
        Scanner myScanner = new Scanner(System.in);
        
        do {
            log("Especificar un digito.");
            digito = myScanner.nextInt();
            if (digito >= 10 || digito < 0) {
                log("Error: especificar solo un digito.");
            }
        } while (digito >= 10 || digito < 0);
        
        int aux;
        int contador = 0;
        do {
            int x = myScanner.nextInt();
            aux = x;
            if (x%10 == digito) {
                contador++;
            }
        } while (aux > 0);
        log("Total de numeros: " + contador);
        
        
    }
    
}
