package escuelavazquezsingui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class EscuelaVazquezSinGUI {

    public static int claves[];
    public static final int DIM = 200;
    public static int n;
    public static int nA;
    
    public static double califs[][];
    public static final int ncols = 5;
    
    // Numero de alumnos que se van a dar de alta
    public static final int num = 3;
    
    public static void leeInfo() {
        claves = new int[DIM];
        califs = new double[DIM][ncols];
        n = 0;
        File datos = new File("alumnos.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextInt() && n < DIM) {
                claves[n] = lee.nextInt();
                for (int j = 0; j < 4; j++) {
                    califs[n][j] = lee.nextDouble();
                }
                n++;
            }
            lee.close();
            nA = n;
        }
    }
    public static void imprimeTodo() {
        // Comprobando informacion.
        System.out.println("\nClaves:");
        for (int i = 0; i < n; i++) {
            System.out.println(claves[i]);
        }
        System.out.println("\nCalificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.println(califs[i][0] + ", " + califs[i][1] + ", " + califs[i][2] + ", " + califs[i][3] + ", " + califs[i][4]);
        }
    }
    public static void altaAlumnos() {
        int clave;
        double parcial1, parcial2, tareas, examenFinal;
        Scanner lee = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.print("\nClave: ");
            clave = lee.nextInt();
            System.out.print("Parcial 1: ");
            parcial1 = lee.nextDouble();
            System.out.print("Parcial 2: ");
            parcial2 = lee.nextDouble();
            System.out.print("Tareas: ");
            tareas = lee.nextDouble();
            System.out.print("Examen final: ");
            examenFinal = lee.nextDouble();
            claves[n] = clave;
            califs[n][0] = parcial1;
            califs[n][1] = parcial2;
            califs[n][2] = tareas;
            califs[n][3] = examenFinal;
            n++;
        }
    }
    public static void calculaPromedios() {
        for (int i = 0; i < DIM; i++) {
            double u = (califs[i][0] + califs[i][1] + califs[i][3]) / 3 * 0.9 + califs[i][2] * 0.1;
            califs[i][4] = (int)(u*100)/100.0;
        }
    }
    public static int promedioMaximo() {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (califs[i][4] > califs[max][4]) {
                max = i;
            }
        }
        return max;
    }
    public static int promedioMinimo() {
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (califs[i][4] < califs[min][4]) {
                min = i;
            }
        }
        return min;
    }
    public static double porcentajeConMaximoPromedio() {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (califs[promedioMaximo()][4] == califs[i][4]) {
                c++;
            }
        }
        double u = (double)c/n;
        return (int)(u*100)/100.0;
    }
    public static double porcentajeConMinimoPromedio() {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (califs[promedioMinimo()][4] == califs[i][4]) {
                c++;
            }
        }
        double u = (double)c/n;
        return (int)(u*100)/100.0;
    }
    public void actualizaArchivo() {
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("alumnos.txt", true);
            esc = new PrintWriter(datos);
            if (n != nA) {
                // Se agregaron alumnos, entonces
                esc.println();
            }
            for (int i = nA; i < n; i++) {
                esc.print(claves[i]+ "\t");
                for(int j = 0; j < 3; j++) {
                    esc.print(califs[i][j] + "\t");
                }
                if (i == n - 1) {
                    // Ya es el último entonces ya no te saltes linea.
                    esc.print(califs[i][3]);
                } else {
                    // Recordar que el println se salta una linea despues de imprimir.
                    esc.println(califs[i][3]);
                }
            }
            esc.close();
        } catch(Exception e) {
            System.out.println("No se actualizó el archivo.");
        }
    }
    public void creaReporte() {
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("reporte.txt", false);
            esc = new PrintWriter(datos);
            esc.println("\n\t\t\t" + LocalDate.now());
            esc.println("\n\n\t\t\t\tALUMNOS DEL GRUPO MIO\n");
            // Escribe promedios.
            for(int i = 0; i < n; i++) {
                esc.println(claves[i]+ "\t"+ (int)(califs[i][4])*100/100.0);
            }
            esc.close();
        } catch(Exception e) {
            System.out.println("no se creo Reporte");
        }
    }        
    
    public static void main(String[] args) {
        leeInfo();
        imprimeTodo();
        System.out.println("\n\t\tALTA ALUMNOS");
        //altaAlumnos();
        //imprimeTodo();
        calculaPromedios();
        imprimeTodo();
        System.out.println("\n\t\tRESULTADOS\n");
        System.out.println("Cantidad de alumnos: " + n);
        System.out.println("Promedio máximo: " + califs[promedioMaximo()][4]);
        System.out.println("Promedio mínimo: " + califs[promedioMinimo()][4]);
        System.out.println("Porcentaje de alumnos con máximo promedio: " + porcentajeConMaximoPromedio());
        System.out.println("Porcentaje de alumnos con minimo promedio: " + porcentajeConMinimoPromedio());
    }
    
}
