package negocio;
import java.util.*;
/**
 *
 * @author BMONDRAGB
 */
public class Negocio {
    
    public static char leeCaracter(String dato, char valida1, char valida2, Scanner lee) {
        String aux;
        do {
            // Imprimer dato
            System.out.print("\n" + dato);
            aux = lee.nextLine();
            if (aux.charAt(0) != valida1 && aux.charAt(0) != valida2) {
                System.out.print("\n\tError: Valor incorrecto.");
            }
        } while (aux.charAt(0) != valida1 && aux.charAt(0) != valida2);
        return aux.charAt(0);
    }
    
    public static void vende(Scanner lee) {
        double monto, desc, rec, totalDescuentos, totalRecargos, totalContado, totalPlazos;
        char cliente, pago;
        totalDescuentos = 0;
        totalRecargos = 0;
        totalContado = 0;
        totalPlazos = 0;
        System.out.print("\nMonto: $");
        monto = lee.nextDouble();
        while (monto > 0) {
            lee.nextLine();
            cliente = leeCaracter("Cliente: ", 'g', 'a', lee);
            pago = leeCaracter("Tipo de pago: ", 'c', 'p', lee);
            if (monto <= 1000) 
            {
                if (cliente == 'g' && pago == 'c') 
                {
                    // Descuento de 20%.
                    desc = monto * 20 / 100.0; // 100.0 para que no sea division entera.
                    monto = monto - desc;
                    System.out.println("\nDescuento: $" + desc + "\nMonto total: $" + monto);
                    totalDescuentos = totalDescuentos - desc;
                    totalContado = totalContado + monto;
                } 
                else 
                {
                    if (cliente == 'a' && pago == 'c') 
                    {
                        // Descuento de 20%.
                        desc = monto * 20 / 100.0; // 100.0 para que no sea division entera.
                        monto = monto - desc;
                        System.out.println("\nDescuento: $" + desc + "\nMonto total: $" + monto);
                        totalDescuentos = totalDescuentos - desc;
                        totalContado = totalContado + monto;
                    }
                    else 
                    {
                        if (cliente == 'g' && pago == 'p') {
                            // Recargo de 10%.
                            rec = monto * 10 / 100.0; // 100.0 para que no sea division entera.
                            monto = monto + rec;
                            System.out.println("\nRecargo: $" + rec + "\nMonto total: $" + monto);
                            totalRecargos = totalRecargos + rec;
                            totalContado = totalContado + monto;
                        } else 
                        {
                            if (cliente == 'a' && pago == 'p') 
                            {
                                // Recargo de 5%.
                                rec = monto * 5 / 100.0; // 100.0 para que no sea division entera.
                                monto = monto + rec;
                                System.out.println("\nRecargo: $" + rec + "\nMonto total: $" + monto);
                                totalRecargos = totalRecargos + rec;
                                totalContado = totalContado + monto;
                            }
                        }
                    }
                }
            }
            else // monto > 1000. 
            {
                if (cliente == 'g' && pago == 'c') 
                {
                    // Descuento de 17.5%.
                    desc = monto * 17.5 / 100.0; // 100.0 para que no sea division entera.
                    monto = monto - desc;
                    System.out.println("\nDescuento: $" + desc + "\nMonto total: $" + monto);
                    totalDescuentos = totalDescuentos - desc;
                    totalContado = totalContado + monto;
                } 
                else 
                {
                    if (cliente == 'a' && pago == 'c') 
                    {
                        // Descuento de 23.12%.
                        desc = monto * 23.12 / 100.0; // 100.0 para que no sea division entera.
                        monto = monto - desc;
                        System.out.println("\nDescuento: $" + desc + "\nMonto total: $" + monto);
                        totalDescuentos = totalDescuentos - desc;
                        totalContado = totalContado + monto;
                    }
                    else 
                    {
                        if (cliente == 'g' && pago == 'p') {
                            // Recargo de 8.75%.
                            rec = monto * 8.75 / 100.0; // 100.0 para que no sea division entera.
                            monto = monto + rec;
                            System.out.println("\nRecargo: $" + rec + "\nMonto total: $" + monto);
                            totalRecargos = totalRecargos + rec;
                            totalContado = totalContado + monto;
                        } else 
                        {
                            if (cliente == 'a' && pago == 'p') 
                            {
                                // Recargo de 3.49%.
                                rec = monto * 3.49 / 100.0; // 100.0 para que no sea division entera.
                                monto = monto + rec;
                                System.out.println("\nRecargo: $" + rec + "\nMonto total: $" + monto);
                                totalRecargos = totalRecargos + rec;
                                totalContado = totalContado + monto;
                            }
                        }
                    }
                }
            }
        } // while
        System.out.printf("Total descuentos: $" + totalDescuentos);
        System.out.printf("Total contado: $" + totalContado);
        System.out.printf("Total plazos: $%.2d" + totalPlazos);
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 49.
        Scanner lee;
        lee = new Scanner(System.in);
        vende(lee);
        
    }
    
}
