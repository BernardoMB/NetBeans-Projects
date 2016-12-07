/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30matrizsupermercado;
import java.util.*;

/**
 *
 * @author Bernardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // Globales.
    public static final int SUCMAX = 20;
    public static double ventas[][];
    public static String deptos[] = {"Abarrotes", "Perecederos", "Farmacia", "Comida preparada"};
    public static int n;
    
    // Metodos.
    public static void leeInfo(Scanner lee) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.println("Sucursal " + (i +1) + ": ");
            for (j = 0; j < 4; j++) {
                System.out.println(deptos[j] + ": ");
                ventas[i][j] = lee.nextDouble();
            }
        }
    }
    
    public static void leeN(Scanner lee) {
        do {
            System.out.println("Cantidad de sucursales: ");
            n = lee.nextInt();
            if (n < 1 || n > SUCMAX) {
                System.out.println("Error. Debe ser mayor a 0 y maximo " + SUCMAX + ".");
            }
        } while (n < 1 || n > SUCMAX);
    }
    
    public static void imprimeTodas() {
        System.out.println("\n\tVENTAS:\n");
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("\nSucursal " + i + ": ");
            for (j = 0; j < 4; j++) {
                System.out.printf("\t $%-13.2f", ventas[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void sumaSucursales() {
        int i, j;
        for (i = 0; i < n; i++) {
            ventas[i][4] = 0;
            for (j = 0; j < 4; j++) {
                ventas[i][4] = ventas[i][4] + ventas[i][j];
            }
        }
    }
    
    public static void ventasSucursales() {
        int i;
        System.out.println("\n\tVENTAS POR SUCURSALES\n");
        for (i = 0; i < n; i++) {
            System.out.printf("%2d: $%1.2f\n", (i+1), ventas[i][4]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        ventas = new double[SUCMAX + 1][5];
        leeN(lee);
        leeInfo(lee);
        imprimeTodas();
        sumaSucursales();
        ventasSucursales();
        
        
    }
    
}
