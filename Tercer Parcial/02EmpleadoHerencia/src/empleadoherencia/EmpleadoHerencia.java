package empleadoherencia;

import java.util.*;
import java.io.*;

public class EmpleadoHerencia {

    public static final int DIM = 50;
    
    // vector de vendedores.
    public static Vendedor ven[];
    public static int nv;
    
    // vector de administradores.
    public static Administrativo adm[];
    public static int na;
    
    // vector de puestos.
    public static int ndep[];
    public static int nd;
    
    public static String[] puestos;
    
    public static void leeInfo() {
        Scanner lee;
        File datos;
        int clave;
        String nombre, puesto;
        double sueldo, ventas;
        ven = new Vendedor[DIM];
        adm = new Administrativo[DIM];
        nv = 0;
        na = 0;
        datos = new File("TeofiloYCia.txt");
        try
        {
            lee = new Scanner(datos);
        }
        catch(Exception e)
        {
            lee = null;
        }
        if (lee != null)
        {
            while (lee.hasNextInt())
            {
                clave = lee.nextInt();
                lee.nextLine();
                nombre = lee.nextLine();
                sueldo = lee.nextDouble();
                if (lee.nextInt() == 1)
                {
                    ventas = lee.nextDouble();
                    if (nv < DIM)
                    {
                        ven[nv] = new Vendedor(clave, nombre, sueldo, ventas);
                        nv = nv + 1;
                    }
                }
                else
                {
                    lee.nextLine();
                    puesto = lee.nextLine();
                    if (na < DIM)
                    {
                        adm[na] = new Administrativo(clave, nombre, sueldo, puesto);
                        na = na + 1;
                    }
                }
            }
            lee.close();
        }
        
    }
    public static void imprimeTodos() {
        for (int i = 0; i < nv; i++) {
            System.out.println(ven[i]);
        }
        for (int i = 0; i < na; i++) {
            System.out.println(adm[i]);
        }    
    }
    public static void cuentaDepartamentos() {
        int loc;
        String puesto;
        nd = 0;
        puestos = new String[DIM];
        ndep = new int [DIM];
        for (int i = 0; i < na; i++) {
            puesto = adm[i].getPuesto();
            if (nd != 0) {
                loc = buscaDepartamento(puesto);
                if (loc != -1) {
                    ndep[loc] = ndep[loc] + 1;
                } else {
                    puestos[nd] = puesto;
                    ndep[nd] = 1;
                    nd = nd + 1;
                }  
            } else {
                puestos[nd] = puesto;
                ndep[nd] = 1;
                nd = nd + 1;
            }
                
        }
    }
    public static int buscaDepartamento(String puesto) {
        int loc = 0;
        while (loc < nd - 1 && puesto.compareTo(puestos[loc]) != 0) {
            loc++;
        }
        if (puesto.compareTo(puestos[loc]) != 0) {
            loc = -1;
        }
        return loc;
    }
    public static void imprimePuestos() {
        System.out.println("\n\tPUESTOS:\n");
        for (int i = 0; i < nd; i++) {
            System.out.println(puestos[i] + ": " + ndep[i]);
        }
    }
    
    public static void main(String[] args) {
        leeInfo();
        imprimeTodos();
        cuentaDepartamentos();
        imprimePuestos();
    }
    
}
