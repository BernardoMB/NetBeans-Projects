/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosteofilo;
import java.util.*;

/**
 * Clave: 143743
 * @author Bernardo
 */
public class ContactosTeofilo {
    
    public static Amigo creaAmigo(Scanner lee) {
        String nombre, telefono, actividad;
        int edad;
        System.out.print("\nNombre: ");
        nombre = lee.nextLine().toUpperCase();
        System.out.print("Telefono: ");
        telefono = lee.nextLine();
        System.out.print("Actividad: ");
        actividad = lee.nextLine().toUpperCase();
        System.out.print("Edad: ");
        edad = lee.nextInt();
        lee.nextLine();
        return new Amigo(nombre, telefono, actividad, edad);
    }
    
    public static void cuentaActividades (Amigo a1, Amigo a2, Amigo a3, Amigo a4)
    {
        int escuela, alpinismo, gimnasio;
        escuela = alpinismo = gimnasio = 0;
        if (a1.compareTo("ALPINISMO") == 0)
            alpinismo = alpinismo + 1;
        else 
            if (a1.compareTo("ESCUELA") == 0)
                escuela = escuela + 1;
            else 
                gimnasio = gimnasio + 1;
        if (a2.compareTo("ALPINISMO") == 0)
            alpinismo = alpinismo + 1;
        else 
            if (a2.compareTo("ESCUELA") == 0)
                escuela = escuela + 1;
            else 
                gimnasio = gimnasio + 1;
        if (a3.compareTo("ALPINISMO") == 0)
            alpinismo = alpinismo + 1;
        else 
            if (a3.compareTo("ESCUELA") == 0)
                escuela = escuela + 1;
            else 
                gimnasio = gimnasio + 1;
        if (a4.compareTo("ALPINISMO") == 0)
            alpinismo = alpinismo + 1;
        else 
            if (a4.compareTo("ESCUELA") == 0)
                escuela = escuela + 1;
            else 
                gimnasio = gimnasio + 1;
        System.out.println("\n\t\tAMIGOS POR ACTIVIDAD\n\tAlpinismo: " + alpinismo + "\n\tEscuela: " + escuela + "\n\tGimnasio: " + gimnasio);
    }
    
    public static int cuentaMayores (Amigo a1, Amigo a2, Amigo a3, Amigo a4) {
        int mayores;
        mayores = 0;
        if (a1.compareTo(18) >= 0)
            mayores = mayores + 1;
        if (a2.compareTo(18) >= 0)
            mayores = mayores + 1;
        if (a3.compareTo(18) >= 0)
            mayores = mayores + 1;
        if (a4.compareTo(18) >= 0)
            mayores = mayores + 1;
        return mayores;
    }
    
    public static void imprimeMayores(Amigo a1, Amigo a2, Amigo a3, Amigo a4) {
        if (a1.compareTo(18) >= 0)
            System.out.println(a1);
        if (a2.compareTo(18) >= 0)
            System.out.println(a2);
        if (a3.compareTo(18) >= 0)
            System.out.println(a3);
        if (a4.compareTo(18) >= 0)
            System.out.println(a4);
    }
    
    public static void cambiaTelefono(Scanner lee, Amigo a1, Amigo a2, Amigo a3, Amigo a4) {
        String nombre, telefono;
        System.out.print("\nNombre: ");
        nombre = lee.nextLine().toUpperCase();
        if (a1.getNombre().compareTo(nombre) == 0) {
            System.out.print("Telefono: \n");
            telefono = lee.nextLine();
            a1.setTelefono(telefono);
        } else {
            if (a2.getNombre().compareTo(nombre) == 0) {
                System.out.print("Telefono: \n");
                telefono = lee.nextLine();
                a2.setTelefono(telefono);
            } else {
                if (a3.getNombre().compareTo(nombre) == 0) {
                    System.out.print("Telefono: \n");
                    telefono = lee.nextLine();
                    a3.setTelefono(telefono);
                } else {
                    if (a4.getNombre().compareTo(nombre) == 0) {
                        System.out.print("Telefono: \n");
                        telefono = lee.nextLine();
                        a4.setTelefono(telefono);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 60.
        Scanner lee;
        Amigo a1, a2, a3 , a4;
        lee = new Scanner(System.in);
        a1 = creaAmigo(lee);
        a2 = creaAmigo(lee);
        a3 = creaAmigo(lee);
        a4 = creaAmigo(lee);
        System.out.println("\n\t\tAMIGOS DE TEOFILO\n\n" + a1 + "\n" + a2 + "\n" + a3 + "\n" + a4);
        
        cuentaActividades(a1, a2, a3, a4);
        System.out.println("\nCantidades de amigos mayores de edad: " + cuentaMayores(a1, a2, a3, a4));
        imprimeMayores(a1, a2, a3, a4);
        cambiaTelefono(lee, a1, a2, a3, a4);
        
        System.out.println("\n\t\tAMIGOS DE TEOFILO\n\n" + a1 + "\n" + a2 + "\n" + a3 + "\n" + a4);
    }
    
}
