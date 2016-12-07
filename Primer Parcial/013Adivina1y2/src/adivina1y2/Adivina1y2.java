package adivina1y2;
import java.util.*;
/**
 * Clave: 143743
 * @author BMONDRAGB
 */
public class Adivina1y2 {
    
    public static int menu(Scanner lee) {
        int op;
        do {
            System.out.println("\nMenu:");
            System.out.println("\t1. Transformar de decimal a binario.");
            System.out.println("\t2. Transformar de binario a decimal.");
            System.out.println("\t3. Terminar.");
            System.out.print("\n\t\tSu opción es: ");
            op = lee.nextInt();
            if (op < 1 || op > 3) {
                System.out.println("\n\t\tError: opción no existente.");
            }
        } while (op < 1 || op > 3);
        return op;
    }
    
    public static int leeDecimal() {
        Scanner lee;
        int num;
        lee = new Scanner(System.in);
        do {
            System.out.println("\nNúmero decimal.");
            num = lee.nextInt();
            if (num < 1) {
                System.out.println("\n\t\tError: tiene que ser un número positivo.");
            }
        }
        while (num < 1);
        return num;        
    }
    
    public static String leeBinario() {
        Scanner lee;
        String binario;
        lee = new Scanner(System.in);
        System.out.println("\nNúmero en binario: ");
        binario = lee.nextLine();
        return binario;
    }
    
    public static int leerEntero(Scanner scanner) {
        int entero;
        do {
            System.out.println("Especificar número positivo.");
            entero = scanner.nextInt();
            if (entero <= 0) {
                System.out.println("Error: el número debe ser positivo.");
            }
        } while (entero <= 0);
        return entero;
    }
    
    public static String decimalBinario(int num) {
        String binario;
        binario = "";
        while (num > 0) {
            binario = (num % 2) + binario;
            num = num / 2;
        }
        return binario;
    }
    
    public static int binarioDecimal(String binario) {
        int pot2, i, num, n;
        pot2 = 1; // 2 a la 0.
        num = 0;
        n = binario.length() - 1;
        // for statement decreciente.
        for (i = n; i >= 0; i--) { 
            num = num + pot2 * (binario.charAt(i) - '0');
            pot2 = pot2 * 2;
        }
        return num;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 41.
        Scanner myScanner = new Scanner(System.in);
        int num;
        num = leerEntero(myScanner);
        String binario;
        binario = decimalBinario(num);
        System.out.println("\n\t" + num + " en binario es " + binario + ".");
        
        // Ejercicio 42.
        num = binarioDecimal(binario);
        System.out.println("\n\t" + binario + " en decimal es " + num + ".");
        
        // Otro ejercicio.
        int op;
        do {
            op = menu(myScanner);
            switch (op) {
                case 1:
                    num = leeDecimal();
                    binario = decimalBinario(num);
                    System.out.println("\n\t" + num + " en binario es " + binario + ".\n");
                    break;
                case 2:
                    binario = leeBinario();
                    num = binarioDecimal(binario);
                    System.out.println("\n\t" + binario + " en decimal es " + num + ".\n");
                    break;
            }
        } while (op != 3);
    }
    
}
