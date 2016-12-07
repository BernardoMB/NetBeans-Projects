package numerosperfectosentre1y1000;

public class NumerosPerfectosEntre1y1000 {
    
    public static void imprime(String string) {
        System.out.println(string);
    }
    
    public static boolean esPerfecto(int num) {
        int i, limite, suma;
        limite = num/2;
        suma = 0;
        for (i = 1; i <= limite; i++) {
            if (num % i == 0) {
                suma = suma + i;
            } 
        }
        return suma == num;
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 36.
        int i;
        imprime("Números perfectos entre 1 y 1000:");
        for (i = 1; i <= 1000; i++) {
            if (esPerfecto(i)) {
                imprime( i + "");
            }
        }
        
    }
    
}
