package caballotroyaclasesgenericasvectorgenerico;

public class Vector <T> {
    private T vec[];
    private int dim;
    private int n;
    // Constructor
    public Vector(int dim) {
        this.dim = dim;
        this.n = 0;
        vec = (T[]) new Object[dim];
    }
    // Me imprime todos los elementos del vector.
    public String toString() {
        String cad = "";
        for (int i = 0; i < n; i++) 
            cad = cad + "\n" + vec[i].toString();
        return cad;
    }
    // Dar de alta un objeto.
    public boolean alta(T d) {
        if (n < dim) {
            vec[n] = d;
            n++;
            return true;
        } else 
            return false;
    }
    // Busqueda secuencial 
    public int buscaSecuencial(T d) {
        int i = 0;
        while (!vec[i].equals(d) && i < n - 1) 
            i++;
        if (!vec[i].equals(d)) 
            i = -1;
        return i;
    }
    
    // Da de baja al objeto d y regresalo.
    public T bajaSinOrden(T d) {
        T aux;
        int i = 0;
        while (!vec[i].equals(d) && i < n - 1) 
            i++;
        if (!vec[i].equals(d)) 
            aux = null;
        else {
            aux = vec[i];
            vec[i] = vec[n - 1];
            n--; // Importante disminuir la n.
        }
        return aux;
    }    
    // Obten el elemento en el indice i.
    public T getElemento(int i) {
        if (i < n) 
            return vec[i];
        else 
            return null;
    }
    // Para ordenar.
    public int minimoIndice(int indice) {
        int min = indice;
        for (int i = indice + 1; i < n; i++) {
            if (((Comparable)vec[i])
                    .compareTo(vec[min]) < 0) {
                min = i;
            }
        }
        return min;
    }
    // Ordena el vector de menor a mayor.
    public void ordenaAscendente() {
        int min;
        T aux;
        for (int i = 0; i < n; i++) {
            min = minimoIndice(i);
            if (min != i) {
                aux = vec[i];
                vec[i] = vec[min];
                vec[min] = aux;
            }
        }
    }
    
}
