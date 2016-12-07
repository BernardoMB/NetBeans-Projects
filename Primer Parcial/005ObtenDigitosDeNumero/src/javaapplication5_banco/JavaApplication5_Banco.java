/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5_banco;
import java.util.*;

/**
 *
 * @author BMONDRAGB
 */
public class JavaApplication5_Banco {

    public static final String NEGRO = "\033[30m";
    public static final String AZUL = "\033[34m";
    public static final String ROJO = "\033[31m";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Acceder a cada uno de los numeros de un numero grande (uno dos tres cuatro).
         * Poner algo entre comillas dentro de un String.
         */
        
        // Problema del banco
        
        Scanner myScanner = new Scanner(System.in);
        
        // Especificar la clave.
        int clave;
        System.out.println("Especificar clave: ");
        clave = myScanner.nextInt();
        
        if (clave > 9999 || clave < 1000) {
            // Error.
        } else {
            int uno = clave % 10;
            clave = clave/10;
            int dos = clave % 10;
            clave = clave/10;
            int tres = clave % 10;
            clave = clave/10;
            int cuatro = clave % 10;
            
            
            System.out.println("Uno:" + uno);
            System.out.println("Dos:" + dos);
            System.out.println("Tres:" + tres);
            System.out.println("Cuatro:" + cuatro);
            
            
            if ((dos + tres) % 2 == 1) {
                System.out.println("ERROR 1");
            } else if (uno == dos || uno == tres || uno == cuatro) {
                System.out.println("ERROR 2");
            } else if (dos == tres || dos == cuatro) {
                System.out.println("ERROR 3");
            } else if (tres == cuatro) {
                System.out.println("ERROR 4");
            } else {
                System.out.println("La clave fue aceptada.");
            }
            
        }
        
        
    }
    
}
