package alumnosclasesgenericas;

import java.io.File;
import java.util.Scanner;

public class AlumnosClasesGenericas {

    // Cantidad de alumnos.
    public static final int ALUMNOS = 50;
    // Cantidad de tareas.
    public static final int TAREAS = 20;
    
    // Vector generico.
    public static Vector<Alumno> grupo;
    
    public static void leeInfo() {
        File datos;
        Scanner lee;
        int cl, ct, i;
        String nom;
        double t[];
        grupo = new Vector<Alumno>(ALUMNOS);
        datos = new File("alumnos.txt");
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            // El While no necesita controlar que no se nos pase de DIM porque el metodo de la clase vector ya se fija en eso.
            while (lee.hasNextInt()) {
                cl = lee.nextInt();
                lee.nextLine();
                nom= lee.nextLine();
                t = new double[TAREAS];
                ct = lee.nextInt();
                for (i = 0; i < ct; i++) {
                    if (i < TAREAS) {
                        t[i] = lee.nextDouble();
                    } else {
                        lee.nextDouble();
                    }
                }
                grupo.alta(new Alumno(cl, nom, ct, t));
            }
            lee.close();
        }
    }
    
    // Metodo para mostrat el alumno que el usuario proporcione;
    public static void muestraUno() {
        Scanner lee;
        int cl, loc;
        lee = new Scanner(System.in);
        System.out.print("\nClave para buscar: ");
        cl = lee.nextInt();
        loc = grupo.buscaSecuencial(new Alumno(cl));
        if (loc == -1) {
            System.out.println(" Se fue a la Ibero");
        } else {
            System.out.println("\n\t" + grupo.getElemento(loc));
        }
    }
    
    public static void main(String[] args) {
        leeInfo();
        System.out.println("\n\t\tGRUPO DE SINFOROSA\n" + grupo);
        muestraUno();
        System.out.println("\nBaja de 4321:" + grupo.bajaSinOrden(new Alumno(4321)));
        System.out.println("\n\t\tGRUPO DE SINFOROSA\n" + grupo);
    }
    
}
