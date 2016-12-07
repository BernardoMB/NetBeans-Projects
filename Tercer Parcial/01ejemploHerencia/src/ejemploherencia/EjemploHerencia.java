package ejemploherencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        Base ba = new Base(1, 2);
        Derivada der = new Derivada(3, 4, 5);
        System.out.println("Base: " + ba);
        System.out.println("Derivada: " + der);
        System.out.println("Suma de ba: " + ba.sumaBase());
        System.out.println("Suma base de der: " + der.sumaBase());
        System.out.println("Suma derivada de der: " + der.sumaDerivada());
        System.out.println("Clase de ba: " + ba.getClass().getName());
        System.out.println("Clase de der: " + der.getClass().getName());
    }
    
}
