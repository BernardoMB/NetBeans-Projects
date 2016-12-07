package universidadvectorgenericopoliformico;

import java.io.File;
import java.util.Scanner;

public class UniversidadVectorGenericoPoliformico {

    public static final int DIM = 50;
    public static Vector<Alumno> alumnos;
    
    public static void leeInfo() {
        int clave;
        String nombre;
        String carrera;
        double promedio;
        double monto;
        double pagado;
        alumnos = new Vector<Alumno>(DIM);
        File datos = new File("universidad.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while(lee.hasNextInt()) {
                clave = lee.nextInt();
                lee.nextLine();
                nombre = lee.nextLine();
                if (lee.nextInt() == 1) {
                    //int y = lee.nextInt();
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
    
    
    public static void main(String[] args) {
        leeInfo();
        System.out.println(alumnos);
    }
    
}
