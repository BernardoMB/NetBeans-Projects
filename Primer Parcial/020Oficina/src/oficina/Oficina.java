package oficina;
import java.util.*;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class Oficina {

    public static double leeDimension(String dato, Scanner lee) {
        double dimension;
        do {
            System.out.print(dato);
            dimension = lee.nextDouble();
            if (dimension <= 0)
                System.out.println("Error: la dimensiondebe ser mayor a 0.");
        } while (dimension <= 0);
        return dimension;
    }
    
    public static Rectangulo creaOficina (Scanner lee) {
        double largo, ancho;
        System.out.println("Medidas de la oficina:");
        largo = leeDimension("Largo: ", lee);
        ancho = leeDimension("Ancho: ", lee);
        return new Rectangulo(largo, ancho);
    }
    
    public static Circulo creaTapete (int num, Scanner lee) {
        double r;
        System.out.println("\n\tMedida del tapete " + num + ".\n");
        r = leeDimension("Radio ", lee);
        return new Circulo(r);
    }
    
    public static void main(String[] args) {
        
        Scanner lee;
        Rectangulo oficina;
        Circulo tapete1, tapete2, tapete3;
        double areaSobrante;
        
        lee = new Scanner(System.in);
        oficina = creaOficina(lee);
        tapete1 = creaTapete(1, lee);
        tapete2 = creaTapete(2, lee);
        tapete3 = creaTapete(3, lee);
        areaSobrante = oficina.area() - (tapete1.area()+tapete2.area()+tapete3.area());
        if (areaSobrante > 0)
            System.out.printf("\n\n\tArea sobrante de la oficina: %.2fm\n", areaSobrante);
        else
            System.out.println("\n\n\tLos tapetes no caben en la oficina.\n");
        
        System.out.println(tapete1.toString());
    }
    
}
