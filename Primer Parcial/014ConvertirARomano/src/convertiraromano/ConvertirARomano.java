package convertiraromano;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class ConvertirARomano {
    
    public static int mostrarMenu(Scanner lee) {
        int op;
        do {
            System.out.println("\n\t Menú:\n");
            System.out.println("1. Transformar entero a romano.");
            System.out.println("2. Terminar.\n");
            op = lee.nextInt();
            if (op > 2 || op < 1) {
                System.out.println("\n\tError: El no existe esa opción en el menú.");
            }
        } while (op > 2 || op < 1) ;
        return op;
    }
    
    public static int newInt(Scanner lee) {
        int num;
        do {
            num = lee.nextInt();
            if (num < 1 || num > 3999) {
                System.out.println("\nError: el número debe estar entre 1 y 3999.");
            }
        } while (num < 1 || num > 3999); 
        return num;
    }
    
    public static String enteroARomano(int num) {
        String romano = "";
        if (num <= 3999 && num >= 1000) {
            int cuarto;
            int tercero;
            int segundo;
            int primero;            
            cuarto = num / 1000;
            num = num - cuarto * 1000;
            tercero = num / 100;
            num = num - tercero * 100;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            
            switch (cuarto) {
                case 0: break;
                case 1: romano = "M"; break;
                case 2: romano = "MM"; break;
                case 3: romano = "MMM"; break;
            }
            
            switch (tercero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "C";
                    break;
                case 2:
                    romano = romano + "CC";
                    break;
                case 3:
                    romano = romano + "CCC";
                    break;
                case 4:
                    romano = romano + "CD";
                    break;
                case 5:
                    romano = romano + "D";
                    break;
                case 6:
                    romano = romano + "DC";
                    break;
                case 7:
                    romano = romano + "DCC";
                    break;
                case 8:
                    romano = romano + "DCCC";
                    break;
                case 9:
                    romano = romano + "CM";
                    break;
            }
            
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 1000 && num >= 100) {
            int tercero;
            int segundo;
            int primero;
            tercero = num / 100;
            num = num - tercero * 100;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            switch (tercero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "C";
                    break;
                case 2:
                    romano = romano + "CC";
                    break;
                case 3:
                    romano = romano + "CCC";
                    break;
                case 4:
                    romano = romano + "CD";
                    break;
                case 5:
                    romano = romano + "D";
                    break;
                case 6:
                    romano = romano + "DC";
                    break;
                case 7:
                    romano = romano + "DCC";
                    break;
                case 8:
                    romano = romano + "DCCC";
                    break;
                case 9:
                    romano = romano + "CM";
                    break;
            }
            
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 100 && num >= 10) {
            int segundo;
            int primero;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 10 && num >= 1) {
            int primero;
            primero = num;
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        }
        return romano;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 44.
        Scanner lee = new Scanner(System.in);
        int op;
        int num;
        String romano;
        do {
            op = mostrarMenu(lee);
            switch (op) {
                case 1:
                    System.out.println("\nEspecificar un número entre 1 y 3999.");
                    num = newInt(lee);
                    romano = enteroARomano(num);
                    System.out.println("\nEn romano: " + romano);
                    break;
            }
        } while (op != 2);
        
    }
    
}
