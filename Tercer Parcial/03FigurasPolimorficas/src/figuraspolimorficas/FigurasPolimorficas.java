package figuraspolimorficas;

import java.io.File;
import java.util.Scanner;

public class FigurasPolimorficas {

    // Aqui el pedo es polimorfico porque en un vector vamos a meter elementos de distintas clases.
    
    // Vector de figuras geometricas.
    public static final int DIM = 25;
    public static FiguraGeometrica fig[];
    public static int n;
    
    public static void leeInfo() {
        int tipo;
        double dimension;
        n = 0;
        fig = new FiguraGeometrica[DIM];
        File datos = new File("figuras.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (n < DIM && lee.hasNextInt()) {
                tipo = lee.nextInt();
                dimension = lee.nextDouble();
                if (tipo == 1) {
                    fig[n] = new Cuadrado(dimension);
                } else {
                    fig[n] = new Circulo(dimension);
                }
                n++;
            }
            lee.close();
        }
        // Comprobacion de lectura.
        /*for (int i = 0; i < n; i++) {
            System.out.println(fig[i]);
        }*/
    }
    public static void imprimeTodos() {
        for (int i = 0; i < n; i++) {
            if (fig[i] instanceof Cuadrado) {
                System.out.println(i + "\tCuadrado: " + fig[i]);
            } else if (fig[i] instanceof Circulo) { // No es necesario el else if, con el else basta.
                System.out.println(i + "\tCirculo: " + fig[i]);
            }
        }
    }
    
    // Para ordenar el vector.
    public static int minimo(int indice) {
        int min = indice;
        for(int i = indice + 1; i < n; i++) {
            if (fig[i].compareTo(fig[min]) < 0) {
                min = i;
            }
        }
        return min;
    }
    public static void ordenaVector() {
        int min;
        FiguraGeometrica aux;
        for(int i = 0; i < n - 1; i++) {
            min = minimo(i);
            if(i != min) {
                aux = fig[min];
                fig[min] = fig[i];
                fig[i] = aux;
            }
        }
    }
    
    // Usando equals.
    public static void imprimeTipoDimension() {
        Scanner lee = new Scanner(System.in);
        
        System.out.print("Indica tipo: ");
        int tipo = lee.nextInt();
        System.out.print("Indica Dimension: ");
        double dim = lee.nextDouble();
        
        for (int i = 0; i < n; i++) {
            if (tipo == 1 && fig[i] instanceof Cuadrado && fig[i].equals(new FiguraGeometrica(dim))) {
                System.out.println(fig[i]);
            } else if (tipo == 2 && fig[i] instanceof Circulo && fig[i].equals(new FiguraGeometrica(dim))) {
                System.out.println(fig[i]);
            }
        }
    }
    // Usando compareTo.
    public static void imprimeTipoDimension2() {
        Scanner lee = new Scanner(System.in);
        
        System.out.print("Indica tipo: ");
        int tipo = lee.nextInt();
        System.out.print("Indica Dimension: ");
        double dim = lee.nextDouble();
        
        for (int i = 0; i < n; i++) {
            if (tipo == 1 && fig[i] instanceof Cuadrado && fig[i].compareTo(new FiguraGeometrica(dim)) == 0) {
                System.out.println(fig[i]);
            } else if (tipo == 2 && fig[i] instanceof Circulo && fig[i].compareTo(new FiguraGeometrica(dim)) == 0) {
                System.out.println(fig[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        leeInfo();
        imprimeTodos();
        ordenaVector();
        System.out.println("\n\tFIGURAS ORDENADAS\n");
        imprimeTodos();
        System.out.println("\n\tFILTRA POR TIPO Y DIMENSION\n");
        imprimeTipoDimension2();
    }
    
}
