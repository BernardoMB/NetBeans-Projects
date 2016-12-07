package salariossegunautosvendidos;
import java.util.Scanner;

public class SalariosSegunAutosVendidos {
    
    public static void imprime(String s) {
        System.out.println(s);
    }
    
    // Ejercicio 20.
    // El salario base es constante.
    public static final double BASE = 2850;
    // Comision.
    public static final double COMISION = 1265;
    public static final double PORCENTAJE = 5;
    
    public static void main(String[] args) {
        
        // Ejercicio 20.
        Scanner myScanner = new Scanner(System.in);
        int autos;
        double monto, sueldo;
        do {
            imprime("Cantidad de autos vendidos:");
            autos = myScanner.nextInt();
            if (autos <= 0) {
                imprime("Error: la cantidad de autos debe ser positiva.");
            }
        } while (autos <= 0);
        while (autos > 0) {
            if (autos == 0) {
                sueldo = BASE;
            } else {
                imprime("Monto: $");
                monto = myScanner.nextDouble();
                sueldo = BASE + COMISION*autos + monto*(PORCENTAJE/100);
            }
            System.out.printf("\n\tSueldo: $%,1.2f\n\n", sueldo);
            imprime("Cantidad de autos vendidos:");
            autos = myScanner.nextInt();
        }
        
    }
    
}
