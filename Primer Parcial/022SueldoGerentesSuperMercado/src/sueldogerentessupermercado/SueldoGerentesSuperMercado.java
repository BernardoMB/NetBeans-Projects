package sueldogerentessupermercado;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class SueldoGerentesSuperMercado {
    
    public static Gerente crearGerente(Scanner lee) {
        int clave;
        double sueldoMensual;
        System.out.print("Clave: ");
        clave = lee.nextInt();
        System.out.print("Sueldo: ");
        sueldoMensual = lee.nextDouble();
        return new Gerente(clave, sueldoMensual);
    }
    
    public static double calcularPromedioMasDeUnMillonAnual(Gerente g1, Gerente g2, Gerente g3) {
        double promedio;
        int num;
        num = ganaMasDeCantidad(g1, 1000000) + ganaMasDeCantidad(g2, 1000000) + ganaMasDeCantidad(g3, 1000000); 
        promedio = (ganaMasDe(g1, 1000000) +ganaMasDe(g2, 1000000) +ganaMasDe(g3, 1000000) )/ num;
        return promedio;
    }
    
    public static double ganaMasDe(Gerente g, double cantidad) {
        if (g.getSueldo()*12 > cantidad)
            return g.getSueldo();
        else 
            return 0;
    }
    
    public static int ganaMasDeCantidad(Gerente g, double cantidad) {
        if (g.getSueldo()*12 > cantidad)
            return 1;
        else 
            return 0;
    }
    
    public static double calcularPromedioGeneral(Gerente g1, Gerente g2, Gerente g3) {
        double promedio;
        promedio = (g1.getSueldo() + g2.getSueldo() + g3.getSueldo()) / 3;
        return promedio;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 56.
        Scanner lee;
        lee = new Scanner(System.in);
        Gerente g1, g2, g3; // Gerentes
        double promedioMasDeUnMillon; // Promedio de los sueldos que son mayores a un millón.
        double cantidad; // Cantidad que será especificada por el usuario.
        double promedioGeneral; // Promedio de los sueldos de los gerentes.
        int numeroDeGerentesCantidad; // Numero de gerentes que ganan una mayor cantidad que la especificada por el usuario.
        
        System.out.println("\nGerente 1 ");
        g1 = crearGerente(lee);
        System.out.println("\nGerente 2 ");
        g2 = crearGerente(lee);
        System.out.println("\nGerente 3 ");
        g3 = crearGerente(lee);
        
        System.out.println("\nGERENTES\n");
        System.out.println("Gerente 1: \n" +g1.toString());
        System.out.println("Gerente 2: \n" +g2.toString());
        System.out.println("Gerente 3: \n" +g3.toString());
        
        promedioMasDeUnMillon = calcularPromedioMasDeUnMillonAnual(g1, g2, g3);
        System.out.printf("\nPromedio de los sueldos mayores a un millón: $%,.2f", promedioMasDeUnMillon);
        
        System.out.print("\nCantidad: ");
        cantidad = lee.nextDouble();
        numeroDeGerentesCantidad = ganaMasDeCantidad(g1, cantidad) + ganaMasDeCantidad(g2, cantidad)
                + ganaMasDeCantidad(g2, cantidad);
        System.out.println("\nCantidad de empleados que ganas más de: " + cantidad + "es " + numeroDeGerentesCantidad);
        
        promedioGeneral = calcularPromedioGeneral(g1, g2, g3);
        System.out.printf("\nPromedio de los sueldos: $%,.2f", promedioGeneral);
    }
    
}
