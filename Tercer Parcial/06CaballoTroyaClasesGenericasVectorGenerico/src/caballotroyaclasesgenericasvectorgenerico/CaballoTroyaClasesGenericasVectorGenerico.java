package caballotroyaclasesgenericasvectorgenerico;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class CaballoTroyaClasesGenericasVectorGenerico {

    public static final int DIM = 30;
    public static Vector<Guerrero> batalla;
    
    public static void leeInfo() {
        String nom;
        int edad, fuerza, tipo;
        Guerrero g;
        batalla = new Vector<Guerrero>(DIM);
        File datos = new File("batallon.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while(lee.hasNextLine()) {
                nom = lee.nextLine();
                edad = lee.nextInt();
                fuerza = lee.nextInt();
                if (lee.nextInt() == 1) {
                    g = new Guerrero(nom, edad, fuerza, false);
                } else {
                    g = new Guerrero(nom, edad, fuerza, true);
                }
                if (g.equals(g)) {
                    batalla.alta(g);
                }
                if (lee.hasNextLine()) {
                    lee.nextLine();
                }
            }
            lee.close();
        }
    }
    public static void creaReporte() {
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("reporte.txt", false);
            esc = new PrintWriter(datos);
            esc.println("\n\t\t\t" + LocalDate.now());
            esc.println("\n\n\t\t\t\tGUERREROS\n");
            esc.printf(batalla.toString());
            esc.close();
        } catch(Exception e) {
            System.out.println("No se creo el reporte.");
        }
    }
    
    public static void main(String[] args) {
        // Lee informacion e imprime.
        leeInfo();
        System.out.println("\n\t\tGUERREROS DEL CABALLO DE TROYA\n");
        System.out.println(batalla);
        // Muestra el vector ordenado.
        batalla.ordenaAscendente();
        System.out.println("\n\t\tGUERREROS DEL CABALLO DE TROYA (Ordenado)\n");
        System.out.println(batalla);
        // Reporte.
        creaReporte();
    }
    
}
