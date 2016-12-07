package pkg025calificacionesvector;
import java.util.*;

/**
 *
 * @author Bernardo
 */
public class Main {

    public static final int DIM = 30;
    public static double califs[];
    public static int n;
    
    // Metodo para especificar la cantidad de alumanos.
    public static void leeN(Scanner lee) {
        do {
        System.out.print("Cantidad de alumnos: ");
        n = lee.nextInt();
        if (n < 1 || n > DIM) {
            System.out.println("\n\tError: Debe estar entre 1" + " y " + DIM + "\n");
        }
        } while (n < 1 || n > DIM);
    }
    
    // Guardar las calificaciones en el vector de calificaciones.
    // ¿Cuantas? R= n (que ya se especificó).
    public static void leeInfo(Scanner lee) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Calificación: " + (i + 1) + ": ");
            califs[i] = lee.nextDouble();
        }
    }
    
    // Imprime el contenido de del vector de calificaciones.
    public static void imprimeTodos() {
        int i;
        System.out.println("\n\tCALIFICACIONES DE LOS ALUMNOS\n");
        for (i = 0; i < n; i++) {
            System.out.println("" + (i+1) + ": " + califs[i]);
        }
    }
    
    // Obtener el promedio.
    public static double promedio() {
        double prom;
        prom = 0;
        for (int i = 0; i < n; i++) {
            prom = prom + califs[i];
        }
        return prom / n;
    }
    
    // Obtener el numero de calificaciones que son mayor al promedio.
    public static int cuentaMayorIgualProm() {
        int i, cuenta;
        double prom;
        cuenta = 0;
        // Obtener el promedio.
        prom = promedio();
        for (i = 0; i < 10; i++) {
            if (califs[i] >= prom)
                cuenta++;
        }
        return cuenta;
    }
    
    // Regresa el inidice donde se eucentra la calificacion mayor.
    public static int maximo() {
        int max;
        int i;
        max = 0;
        for (i = 0; i < 10; i++) {
            if (califs[i] > califs[max])
                max = i;
        }
        return max;
    }
    
    public static void imprimeAlumnosMaximos() {
        int i;
        int max;
        max = maximo();
        System.out.println("\n\tALUMNOS CON MAXIMA CALIFICACION\n");
        for (i = max; i < n; i++) {
            if (califs[i] == califs[max])
                System.out.println("" + (i + 1));
        }
    }
    
    public static int cuentaReprobados() {
        int cuenta;
        cuenta = 0;
        for (int i = 0; i < califs.length; i++) {
            if (califs[i] <= 5)
                cuenta++;
        }
        return cuenta;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lee;
        lee = new Scanner(System.in);
        califs = new double[DIM]; // Vector con valores tipo double.
        leeN(lee);
        leeInfo(lee);
        imprimeTodos();
        System.out.println("\nMayores o iguales al promedio: " + cuentaMayorIgualProm());
        imprimeAlumnosMaximos();
        System.out.println("\nReprobados: " + cuentaReprobados());
    }
    
}
