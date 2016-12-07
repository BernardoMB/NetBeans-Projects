/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6_oficinadecorreos;
import java.util.*;

/**
 *
 * @author BMONDRAGB
 */
public class JavaApplication6_OficinaDeCorreos {
    
    public void log (String str) {
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Precios:
         * letras: 10
         * caracteres especiales: 30
         * digitos: 20
         * espacio: 0
         */
        
        Scanner myScanner = new Scanner(System.in);
        String mensaje;
        System.out.println("Especificar mensaje.");
        mensaje = myScanner.nextLine();
        double precio = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z' || mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
                precio = precio + 10;
            } else if (mensaje.charAt(i) >= '0' && mensaje.charAt(i) <= '9') {
                precio = precio + 20;
            } else if (mensaje.charAt(i) != ' ') {
                precio = precio + 30;
            }
        }
        System.out.printf("Por pagar: $%,1.2f\n", precio);
        
    }
    
}
