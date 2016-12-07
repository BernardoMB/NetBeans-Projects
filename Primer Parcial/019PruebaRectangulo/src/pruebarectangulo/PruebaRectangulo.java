package pruebarectangulo;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class PruebaRectangulo {
    
    /**
     * 30 black
     * 31 red
     * 32 green
     * 33 yellow
     * 34 blue
     * 35 magenta
     * 36 cyan
     * 37 white
     * 40 black background
     * 41 red background
     * 42 green background
     * 43 yellow background
     * 44 blue background
     * 45 magenta background
     * 46 cyan background
     * 47 white background
     * 1 make bright (usually just bold)
     * 21 stop bright (normalizes boldness)
     * 4 underline
     * 24 stop underline
     * 0 clear all formatting
     */
    public static String color1 = "\u001B[35m";
    public static String color2 = "\u001B[36m";
    
    public static void main(String[] args) {
        
        // Ejercicio 51.
        Scanner myScanner;
        Rectangulo rec1, rec2;
        double base, altura;
        myScanner = new Scanner(System.in);

        // Primer rectangulo.
        System.out.print("\n"+ color1 +"Base del rectangulo 1: ");
        base = myScanner.nextDouble();
        System.out.print(""+ color1 +"Altura del rectangulo 1: ");
        altura = myScanner.nextDouble();
        rec1 = new Rectangulo(base, altura);
        
        // Segundo rectangulo.
        System.out.print("\n"+ color2 +"Base del rectángulo 2: ");
        base = myScanner.nextDouble();
        System.out.print(""+ color2 +"Altura del rectángulo 2: ");
        altura = myScanner.nextDouble();
        rec2 = new Rectangulo(base,altura);
        
        System.out.printf("\n"+ color1 +"Perímetro del rectángulo 1: %,1.3f\n", rec1.perimetro());
        System.out.printf(""+ color1 +"Área del rectángulo 1: %,1.3f\n", rec1.area());
        System.out.printf("\n"+ color2 +"Perímetro del rectángulo 2: %,1.3f\n", rec2.perimetro());
        System.out.printf(""+ color2 +"Área del rectángulo 2: %,1.3f\n", rec2.area());
        
        // Comparando areas.
        if(rec1.area() > rec2.area())
            System.out.println("\n"+ color1 +"Rectángulo 1 más grande");
        else
            System.out.println("\n"+ color2 +"Rectángulo 2 más grande");
        
        // Comparando perimetros.
        if(rec1.perimetro() > rec2.perimetro())
            System.out.println("\n"+ color1 +"El rectángulo 1 tiene dimensiones más grandes.");
        else
            System.out.println("\n"+ color2 +"El rectángulo 2 tiene dimensiones más grandes.");
        
    }
    
}
