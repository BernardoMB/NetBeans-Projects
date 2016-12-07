package tercerprograma;
import java.util.*;

public class TercerPrograma {
    
    public static void main(String[] args) {
    
        // Division.
        /*double x;
        double y;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entero 1: ");
        x = myScanner.nextDouble();
        System.out.println("" + x);
        System.out.println("Entero 2: ");
        y = myScanner.nextDouble();
        System.out.println("" + y);
        if (y != 0) {
            double cociente = x/y;
            System.out.println("Resultado de la división: " + cociente);
        } else {
            System.out.println("Error matemático: se está intentando dividir entre cero");
        }*/
        
        // Castenaod para ahorrar memoria.
        /*int x;
        int y;
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.println("Entero 1: ");
        x = myScanner.nextInt();
        System.out.println("" + x);
        System.out.println("Entero 2: ");
        y = myScanner.nextInt();
        System.out.println("" + y);
        
        if (y != 0) {
            double cociente = (double)x/y;
            System.out.println("Resultado de la división: " + cociente);
        } else {
            System.out.println("Error matemático: se está intentando dividir entre cero");
        }*/
        
        // Imprimiendo con formato.
        /*int x;
        int y;
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Entero 1: ");
        x = myScanner.nextInt();
        System.out.println("" + x);
        System.out.println("Entero 2: ");
        y = myScanner.nextInt();
        System.out.println("" + y);
        if (y != 0) {
            double cociente = (double)x/y;
            System.out.println("Resultado de la división: " + cociente);
            System.out.printf("Resultado de la división:= %,1.3f\n", cociente);
        } else {
            System.out.println("Error matemático: se está intentando dividir entre cero");
        }
        if (x > y) {
            double producto;
            producto = Math.abs(x-y);
            System.out.printf("Resultado del valor absoluto: %,1.3f\n", producto);
        } else {
            double producto;
            producto = Math.pow(y, x);
            System.out.printf("Resultado de elevar: %,1.3f\n", producto);
        }*/
        
        // Decir si una entreada es mayuscula, minuscula, o si se trata de un número.
        
        // Es mayucula?
        // Son iguales?
        // Es numero?
        /*Scanner myScanner = new Scanner(System.in);
        char a, b;
        System.out.println("Primer caracter: ");
        String aux = myScanner.nextLine();
        a = aux.charAt(0);
        System.out.println("Segundo caracter: ");
        aux = myScanner.nextLine();
        b = aux.charAt(0);
        // Decir si es mayuscula.
        if (a >= 'A' && a <='Z') {
            System.out.println(a + " es mayáscula.");
        } else {
            System.out.println(a + " no es mayáscula.");
        }
        // Decir si son iguales.
        if (a == b) {
            System.out.println(a + " y " + b + " son iguales");
        } else {
            System.out.println(a + " y " + b + " no son iguales");
        }
        // Decir si es un numero.
        if (b >= '0' && b <= '9') {
            System.out.println(b + " es un número.");
        } else {
            System.out.println(b + " no es un número.");
        }*/
        
        /*--------------------------------------------------------------------*/
        
        // Calcular el slario semanal de un obrero.
        /**
         * // Si trabaja menor o igual a 40 horas, enbtonces cada hora se la pagaremos a 16.99.
         * Si trabaja mas de 40 horas, entonces se le pagaran las primeras 40 horas a 16.99 y a 20 las restantes.
         * Se escribira formateado lo siguiente:
         * Clave (int)
         * nombre (String)
         * Horas (int)
         * Dinero con dos decimales.
         */
        
        /*Scanner myScanner = new Scanner(System.in);
        String nombreDelObrero;
        int claveDelObrero;
        int horasTrabajadasPorElObrero;
        double totalAPagar;
        System.out.println("Especificar nombre del obrero.");
        nombreDelObrero = myScanner.nextLine();
        System.out.println("Especificar clave del obrero.");
        claveDelObrero = myScanner.nextInt();
        System.out.println("Especificar horas trabajadas.");
        horasTrabajadasPorElObrero = myScanner.nextInt();
        if (horasTrabajadasPorElObrero >= 40) {
            int a = horasTrabajadasPorElObrero - 40;
            totalAPagar = 40*16.99 + a*20;
        } else {
            totalAPagar = horasTrabajadasPorElObrero*16.99;
        }
        // Imprimir el resultado.
        System.out.printf("Nombre: " + nombreDelObrero + " \n");
        System.out.printf("Clave: " + claveDelObrero + " \n");
        System.out.printf("Horas trabajadas: " + horasTrabajadasPorElObrero + " \n");
        System.out.printf("Sueldo: $%1.2f \n", totalAPagar);*/
        
    }
    
}
