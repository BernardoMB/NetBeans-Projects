package pkg025calificacionesvector;

public class SegundoParcial {
    
    // Obtener el promedio de los elementos del vector.
    public static double promedio(int vec[]) {
        double prom;
        prom = 0;
        for (int i = 0; i < vec.length; i++) {
            prom = prom + vec[i];
        }
        return prom / vec.length;
    }
    
     // Obtener el numero de enteros del vector que sean mayores o iguales al numero especificado.
    public static int cuentaMayorIgualNum(int vec[], int num) {
        int i, cuenta;
        cuenta = 0;
        for (i = 0; i < 10; i++) {
            if (vec[i] >= num)
                cuenta++;
        }
        return cuenta;
    }
    
    // Obtener el numero de enteros del vector que sean menores o iguales al numero especificado.
    public static int cuentaMenosIgualNum(int vec[], int num) {
        int cuenta;
        cuenta = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] <= num)
                cuenta++;
        }
        return cuenta;
    }
    
    // Regresa el inidice donde se eucentra el entero mayor.
    public static int maximo(int vec[]) {
        int max;
        int i;
        max = 0;
        for (i = 0; i < 10; i++) {
            if (vec[i] > vec[max])
                max = i;
        }
        return max;
    }
    
    // Imrpime todo el contenido del vector.
    public static void imprimeTodos(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println("\t" + (i + 1) + ": " + vec[i]);
        }
    }
    
    
    
    
    // Busqueda secuencial.
    // Obtiene secuancialmente el indice en donde se encuentra 'entero' en el vector.
    // Si el entero no está en el vector, entonces regresa -1.
    public static int buscaSecuencial(int vec[], int entero) {
        int i = 0; 
        while(vec[i] != entero && i < vec.length - 1) {
            i++;
        }
        if(vec[i] != entero) {
            i = -1;
        }
        return i;
    }
    
    
    
    
    
    
    // Regresa el inidice en donde se encuentre el minimo a partir de p.
    public static int minimo(int vec[], int p) {
        int i, min;
        min = p;
        for(i = p + 1; i < vec.length; i++) {
            if(vec[i] < vec[min]) {
                min = i;
            }
        }
        return min;
    }
    
    // Seleccion directa. 
    public static void seleccionDirecta(int vec[]) {
        int i, min, aux;
        for(i = 0; i < vec.length - 1; i++) {
            min = minimo(vec, i);
            if(i != min) {
                // La posicion i no fue el minimo a partir de la posicion i.
                
                // Cambialos de lugar.
                aux = vec[min];
                vec[min] = vec[i];
                vec[i] = aux;
            }
        }
    }
}
