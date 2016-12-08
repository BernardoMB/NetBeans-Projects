package universidad;

public class Vector <T> {
    private T vec[];
    private int DIM;
    private int n;

    public Vector(int DIM) {
        this.DIM = DIM;
        this.n = 0;
        this.vec = (T[]) new Object[DIM];
    }

    public String toString() {
        String cad = "";
        for (int i = 0; i < n; i++) {
            cad = cad + "\n" + vec[i];
        }
        return cad;
    }
    
    public boolean alta(T t) {
        boolean resp;
        if (n < DIM) {
            vec[n] = t;
            n++;
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    public int minimo(int indice) {
        int min = indice;
        T aux;
        for (int i = indice + 1; i < n - 1; i++) {
            if (((Comparable)vec[min]).compareTo(vec[i]) > 0) {
              min = i;
            }
        }
        return min;
    }
    public void ordenaAscendente() {
        T aux;
        int min;
        for (int i = 0; i < n; i++) {
            min = minimo(i);
            if (i != min) {
                aux = vec[min];
                vec[min] = vec[i];
                vec[i] = aux;
            }
        }
    }
    
    public int busquedaSecuencial(T alumno) {
        int i = 0;
        while (((Comparable)vec[i]).compareTo(alumno) != 0) {
            i++;
        }
        if (((Comparable)vec[i]).compareTo(alumno) != 0) {
            i = -1;
        }
        return i;
    }
    
    public T getElemento(int i) {
        if (i < n) {
            return vec[i];
        } else {
            return null;
        }
    }
    
    // No estoy seguro si esto esta bien.
    public int getN() {
        return n;
    } 
}
