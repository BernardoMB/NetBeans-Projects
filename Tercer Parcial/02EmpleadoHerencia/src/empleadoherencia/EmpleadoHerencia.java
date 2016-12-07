package empleadoherencia;

import java.util.*;
import java.io.*;

public class EmpleadoHerencia {

    public static final int DIM = 50;
    
    // vector de vendedores.
    public static Vendedor[] vendedores;
    public static int nvend;
    
    // vector de administradores.
    public static Administrativo[] administradores;
    public static int nadmon;
    
    // vector de puestos.
    public static int[] numPuestos;
    public static String[] puestos;
    public static int np; // numPuestos y puestos tendran siempre el mismo tamaño.
    
    public static void leeInfo() {
        Scanner lee;
        File datos;
        int clave;
        String nombre, puesto;
        double sueldo, ventas;
        vendedores = new Vendedor[DIM];
        administradores = new Administrativo[DIM];
        nvend = 0;
        nadmon = 0;
        datos = new File("TeofiloYCia.txt");
        try {
            lee = new Scanner(datos);
        }
        catch(Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextInt()) {
                clave = lee.nextInt();
                lee.nextLine();
                nombre = lee.nextLine();
                sueldo = lee.nextDouble();
                if (lee.nextInt() == 1) {
                    ventas = lee.nextDouble();
                    if (nvend < DIM) {
                        vendedores[nvend] = new Vendedor(clave, nombre, sueldo, ventas);
                        nvend = nvend + 1; 
                    }
                } else {
                    lee.nextLine();
                    puesto = lee.nextLine();
                    if (nadmon < DIM) {
                        administradores[nadmon] = new Administrativo(clave, nombre, sueldo, puesto);
                        nadmon = nadmon + 1;
                    }
                }
            }
            lee.close();
        }
        
    }
    public static void imprimeTodos() {
        for (int i = 0; i < nvend; i++) {
            System.out.println(vendedores[i]);
        }
        for (int i = 0; i < nadmon; i++) {
            System.out.println(administradores[i]);
        }    
    }
    public static int buscaDepartamento(String puesto) {
        int loc = 0;
        while (loc < np - 1 && puesto.compareTo(puestos[loc]) != 0) {
            loc++;
        }
        if (puesto.compareTo(puestos[loc]) != 0) {
            loc = -1;
        }
        return loc;
    }
    public static void cuentaDepartamentos() {
        int loc;
        String puesto;
        puestos = new String[DIM];
        numPuestos = new int [DIM];
        np = 0;
        for (int i = 0; i < nadmon; i++) {
            puesto = administradores[i].getPuesto();
            if (np == 0) {
                // numPuestos y puestos estan vacíos.
                puestos[np] = puesto;
                numPuestos[np] = 1;
                np++;
            } else {
                // numPuestos y puestos no estan vacios entonces checa si puesto ya esta en el vector.
                loc = buscaDepartamento(puesto);
                if (loc != -1) {
                    // Ya estaba.
                    numPuestos[loc]++;
                } else {
                    // No estaba.
                    puestos[np] = puesto;
                    numPuestos[np] = 1;
                    np++; // Muy importante.
                }
            }    
        }
    }
    public static void imprimePuestos() {
        System.out.println("\n\tPUESTOS:\n");
        for (int i = 0; i < np; i++) {
            System.out.println(puestos[i] + ": " + numPuestos[i]);
        }
    }
    
    
    // Mio
    // Para ordenar vendedores segun sus ventas.
    public static int minimoVend(int indice) {
        int min = indice;
        for (int i = indice + 1; i < nvend; i++) {
            if (vendedores[min].compareTo(vendedores[i]) == 1) {
                min = i;
            }
        }
        return min;
    }
    public static void ordenaVendedores() {
        int min;
        Vendedor aux;
        for (int i = 0; i < nvend - 1; i++) {
            min = minimoVend(i);
            if (i != min) {
                aux = vendedores[i];
                vendedores[i] = vendedores[min];
                vendedores[min] = aux;
            }
        }
    } 
    
    // Mio
    // Para ordenar administradores segun su sueldo.
    public static int minimoAdmon(int indice) {
        int min = indice;
        for (int i = indice + 1; i < nadmon; i++) {
            if (administradores[i].compareTo(administradores[min]) < 0) {
                min = i;
            }
        }
        return min;
    }
    public static void ordenaAdministradores() {
        int min;
        Administrativo aux;
        for (int i = 0; i < nadmon - 1; i++) {
            min = minimoAdmon(i);
            if (i != min) {
                aux = administradores[i];
                administradores[i] = administradores[min];
                administradores[min] = aux;
            }
        }
    }
    
    public static void main(String[] args) {
        leeInfo();
        imprimeTodos();
        cuentaDepartamentos();
        imprimePuestos();
        // Mio
        ordenaVendedores();
        ordenaAdministradores();
        imprimeTodos();
    }
    
}
