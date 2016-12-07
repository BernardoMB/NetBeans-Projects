package diurnonocturno;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class DiurnoNocturno {
    
    public static Empleado creaEmpleado(Scanner lee) {
        String nombre, turno;
        int horasTrabajadas;
        System.out.print("Nombre: ");
        nombre = lee.nextLine();
        System.out.print("Horas trabajadas: ");
        horasTrabajadas = lee.nextInt();
        lee.nextLine(); // Para vaciar el scanner.
        System.out.print("Turno: ");
        turno = lee.nextLine().toUpperCase();        
        return new Empleado(nombre, horasTrabajadas, turno);
    }
    
    public static void imprimeSueldo(Empleado e) {
        System.out.printf("\n\tSr(a) %1s su sueldo total es $%.1,2f\n", e.getNombre(), e.calculaSueldo());
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 55.
        Scanner lee;
        Empleado e1, e2, e3;
        lee = new Scanner(System.in);
        System.out.println("\nEmpleado 1");
        e1 = creaEmpleado(lee);
        System.out.println("\nEmpleado 2");
        e2 = creaEmpleado(lee);
        System.out.println("\nEmpleado 3");
        e3 = creaEmpleado(lee);
        System.out.println("\nEMPLEADOS:\n" + e1 + e2 + e3);
        
        System.out.println("\n\n\t\tSUELDOS:\n");
        imprimeSueldo(e1);
        imprimeSueldo(e2);
        imprimeSueldo(e3);
    }
    
}