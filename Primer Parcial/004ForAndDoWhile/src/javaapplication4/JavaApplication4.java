/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.*;

/**
 *
 * @author BMONDRAGB
 */
public class JavaApplication4 {
    
    // Colores.
    public static final String NEGRO = "\033[30m";
    public static final String AZUL = "\033[34m";
    public static final String ROJO = "\033[31m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Problema de los carros.
        
        /**
         * Uso de Do-While statement.
         * Uso del For statament.
         * Uso de colores.
         */
        
        Scanner myScanner = new Scanner(System.in);
        int cantidadAutos;
        
        do {
            System.out.println("Especificar el numero de autos. ");
            cantidadAutos = myScanner.nextInt();
            if (cantidadAutos <= 0) {
               System.out.println("\n" + AZUL + "Error: el número de autos no puede ser negativo. \n" + AZUL);
            }
        }
        while (cantidadAutos < 0);
        
        
        for (int i =1; i<= cantidadAutos; i=i+1) {
            int km;
            int modelo;
            System.out.println("\n Especificar kilometraje: ");
            km = myScanner.nextInt();
            System.out.println("Especificar modelo: ");
            modelo = myScanner.nextInt();
            if (km < 5050 && modelo >= 2013 && modelo <= 2015) {
                System.out.println("Viejo. \n");
            } else if (km < 35231 && km >= 5050 && modelo >= 2008 && modelo <= 2012) {
                System.out.println("Maravilla. \n");
            } else if (km < 78934 && km >= 35231 && modelo >= 1998 && modelo <= 2008) {
                System.out.println("Viejo. \n");
            } else {
                System.out.println("Auto desechable. \n");
            }
        }
    }
    
}
