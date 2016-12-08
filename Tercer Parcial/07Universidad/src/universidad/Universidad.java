package universidad;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class Universidad {

    public static Vector<Alumno> alumnos;
    public static final int DIM = 50;
    
    public static void leeInfo() {
        alumnos = new Vector<Alumno>(DIM);
        int clave;
        String nombre;
        String carrera;
        double promedio;
        double monto;
        double pagado;
        File datos = new File("universidad.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextInt()) {
                clave = lee.nextInt();
                lee.nextLine();
                nombre = lee.nextLine();
                if (lee.nextInt() == 1) {
                    lee.nextLine();
                    carrera = lee.nextLine();
                    promedio = lee.nextDouble();
                    alumnos.alta(new Escolar(clave, nombre, carrera, promedio));
                } else {
                    monto = lee.nextDouble();
                    pagado = lee.nextDouble();
                    alumnos.alta(new Finanzas(clave, nombre, monto, pagado));
                }
            }
            lee.close();
        }
    }
    public static void imprimeInformacion() {
        int x;
        System.out.println("\n\t\tSeleccione el tipo de información.\n");
        System.out.println("Informacion: Escolar --> 1; Financiera --> 2;");
        System.out.print("Tipo de informacion: ");
        Scanner lee = new Scanner(System.in);
        x = lee.nextInt();
        for (int i = 0; i < alumnos.getN(); i++) {
            if (x == 1 && alumnos.getElemento(i) instanceof Escolar) {
                System.out.println(alumnos.getElemento(i));
            } else if (x == 2 && alumnos.getElemento(i) instanceof Finanzas) {
                System.out.println(alumnos.getElemento(i));
            }
        }
        
    }
    public static void modificaPromedio() {
        int indice;
        int clave;
        double promedio;
        System.out.println("\n\t\tEspecificar la clave del alumnos al cual se le modificará el promedio.\n");
        Scanner lee = new Scanner(System.in);
        System.out.printf("Clave: ");
        clave = lee.nextInt();
        System.out.printf("Promedio: ");
        promedio = lee.nextDouble();
        indice = alumnos.busquedaSecuencial(new Alumno(clave, ""));
        if (alumnos.getElemento(indice) instanceof Escolar) {
            ((Escolar)alumnos.getElemento(indice)).setPromedio(promedio);
        }
    }
    public static void realizarPago() {
        int indice;
        int clave;
        double pago;
        System.out.println("\n\t\tEspecificar la clave del alumnos al cual se le quiere realizar un pago.\n");
        Scanner lee = new Scanner(System.in);
        System.out.printf("Clave: ");
        clave = lee.nextInt();
        System.out.printf("Pago: ");
        pago = lee.nextDouble();
        indice = alumnos.busquedaSecuencial(new Alumno(clave, ""));
        if (alumnos.getElemento(indice) instanceof Finanzas) {
            ((Finanzas)alumnos.getElemento(indice)).setPagado(pago);
        }
    }
    public static void actualizaArchivo() {
        try {
            //FileOutputStream datos = new FileOutputStream("Universidad.txt", false);
            //PrintWriter esc = new PrintWriter(datos);
        } catch (Exception e) {
            System.out.println("No se actualizo el archivo.");
        }
    }
    
    public static void main(String[] args) {
        leeInfo();
        System.out.println(alumnos);
        // Ordenando.
        alumnos.ordenaAscendente();
        System.out.println("\n\t\tALUMNOS (ordenado):\n");
        System.out.println(alumnos);
        // Imprimir informacion.
        imprimeInformacion();
        // Modifica el promedio.
        modificaPromedio();
        System.out.println(alumnos);
        // Realizar pago.
        realizarPago();
        System.out.println(alumnos);
        // Actualizar archivo.
        actualizaArchivo();
    }
    
}
