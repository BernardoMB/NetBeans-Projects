/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;
import java.util.*;
/**
 *
 * @author Bernardo
 */
public class Robots {

    
    public static final double P25 = 25;
    public static final double P75 = 75;
    public static Robot creaRobot(Scanner lee)
    {
        int id;
        System.out.print("Identificación: ");
        id = lee.nextInt();
        return new Robot(id);
    }
    public static int porcentaje25(Robot r1, Robot r2, Robot r3, 
            Robot r4, Robot r5)
    {
        int c;
        c = 0;
        //Legible para todo usuario < 0
        if (r1.compareTo(P25) < 0)
            c = c + 1;
        if (r2.compareTo(P25) < 0)
            c = c + 1;
        if (r3.compareTo(P25) < 0)
            c = c + 1;
        if (r4.compareTo(P25) < 0)
            c = c + 1;
        if (r5.compareTo(P25) < 0)
            c = c + 1;
        return c;
    }
    public static int porcentaje75(Robot r1, Robot r2, Robot r3, 
            Robot r4, Robot r5)
    {
        int c;
        c = 0;
        //Legible para todo usuario < 0
        if (r1.compareTo(P75) < 0)
            c = c + 1;
        if (r2.compareTo(P75) < 0)
            c = c + 1;
        if (r3.compareTo(P75) < 0)
            c = c + 1;
        if (r4.compareTo(P75) < 0)
            c = c + 1;
        if (r5.compareTo(P75) < 0)
            c = c + 1;
        return c;
    }
    public static Robot maximo(Robot r1, Robot r2, Robot r3, 
            Robot r4, Robot r5)
    {
        Robot max;
        max = r1;
        if (r2.compareTo(max) > 0)
            max = r2;
        if (r3.compareTo(max) > 0)
            max = r3;
        if (r4.compareTo(max) > 0)
            max = r4;
        if (r5.compareTo(max) > 0)
            max = r5;
        return max;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lee;
            Robot r1, r2, r3, r4, r5;
            lee = new Scanner(System.in);
            //Ahorrar tiempo copaste
            System.out.println("Robot1: ");
            r1 = creaRobot(lee);
            System.out.println("Robot2: ");
            r2 = creaRobot(lee);
            System.out.println("Robot3: ");
            r3 = creaRobot(lee);
            System.out.println("Robot4: ");
            r4 = creaRobot(lee);
            System.out.println("Robot5: ");
            r5 = creaRobot(lee);
            //Necesario imprimir datos para verificar resultados.
            System.out.println("\n\nRobots\n" + r1 + r2 + r3 + r4 + r5);
            System.out.println("\nRobots con menos del 25% de vida: " 
                    + porcentaje25(r1, r2, r3, r4, r5));
            System.out.println("\nRobots con menos del 75% de vida: " 
                    + porcentaje75(r1, r2, r3, r4, r5));
            System.out.println("\nRobot con mayor porcentaje de vida: " + 
                    maximo(r1, r2, r3, r4, r5) + "\n");   
        
    }
}
