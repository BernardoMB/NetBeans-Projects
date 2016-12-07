package caballotroyaclasesgenericasvectorgenerico;

public class Vector <T> {//Para hacer una clase generica 
    private int dim, n;//dim es el tamaño que va a tener el vector y n es cuantos hay realmente
    private T vec[];

    public Vector(int dim) {
        this.dim = dim;
        n = 0;
        vec = (T[]) new Object[dim];
    }
    
    public String toString() {
        String cad;
        int i;
        cad = "";
        for ( i = 0; i < n ; i++)
            cad = cad + "\n" + vec[i].toString();
        return cad;
    }
    
    public boolean alta(T d) {
        boolean resp;
        if (n < dim)
        {
            vec[n] = d;
            n = n+1;
            resp =true;
        }
        else
            resp = false;
        return resp;
    }
    
    public int buscaSecuencial(T d) {
        int i;
        i = 0;
        while(!vec[i].equals(d) && i < n-1)
            i = i + 1;
        if (!vec[i].equals(d))
            i = -1;
        return i;
    }
    
    public T bajaSinOrden(T d) {
        T aux;
        int i;
        i = 0;
        while(!vec[i].equals(d) && i < n-1)
            i = i + 1;
        if (!vec[i].equals(d))
            aux = null;
        else
        {
            aux = vec[i];
            vec[i] = vec[n-1];
            n = n-1;
        }
        return aux;
    }
    
    public T getElemento(int i) {
        T aux;
        if (i < n) {
            aux = vec[i];
        } else {
            aux = null;
        }
        return aux;
    }
    
    public int minimoIndice(int indice) {
        int i, min;
        min = indice;
        for (i = indice + 1; i < n; i++) {
            if (((Comparable)vec[i]).compareTo(vec[min]) < 0) {
                min = i;
            }
        }
        return min;
    }
    
    public void ordenaAscendente() {
        int i, min;
        T aux;
        for (i = 0; i < n; i++) {
            min = minimoIndice(i);
            if (min != i) {
                aux = vec[i];
                vec[i] = vec[min];
                vec[min] = aux;
            }
        }
    }
    
}
