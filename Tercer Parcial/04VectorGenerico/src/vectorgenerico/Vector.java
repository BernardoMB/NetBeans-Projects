package vectorgenerico;

// Poner el "menor que y mayor que (diamante) para indicar que es generica"
public class Vector <T> {
    
    // El vector (albergará objetos clase T).
    private T vec[];
    // Hara el papel de una constante.
    private int dim;
    // Variable para indicar cuantos elementos tiene realmente el vector.
    private int n;
    
    // Constructor.
    public Vector(int dim) {
        this.dim = dim;
        n = 0;
        vec = (T[]) new Object[dim]; // La clase de objetos que guardará el vector vec los está casteando a T.
    }
    
    // Me imprime todos los elementos del vector.
    public String toString() {
        String cad = "";
        for (int i = 0; i < n; i++) {
            cad = cad + "\n" + vec[i].toString();
        }
        return cad;
    }
    
    // Mete un objeto de clase T al vector y regresa true o false si la alta fue exitosa.
    public boolean alta(T d) {
        boolean resp;
        if (n < dim) {
            // Todavía hay espacio en el vector.
            resp = true;
            vec[n] = d;
            n++; // Importante incrementar la n.            
        } else {
            // Ya no hay espacio en el vector.
            resp = false;
        }
        return resp;
    }
    
    // Regresa el indice en donde se encuentr el objeto d de clase T en el vector.
    public int buscaSecuancial(T d) {
        int i = 0;
        // Aquí se usa el equals para tener un criterio de comparacion.
        // No se puede usar el == porque no conocemos que carajos es T.
        // vec[i] es un objeto de clase T, entonces la clase T tiene que tener el metodo equals.
        while (!vec[i].equals(d) && i < n - 1) {
            i++;
        }
        if (!vec[i].equals(d)) {
            i = -1;
        }
        return i;
    }
    
    // Da de baja al objeto d y regresalo.
    // Si el objeto d no está, entonces no hagas nada y regresa null. 
    public T bajaSinOrden(T d) {
        T aux;
        int i = 0;
        // Encuentra el indice del objeto a dar de baja.
        while (!vec[i].equals(d) && i < n - 1) {
            i++;
        }
        if (!vec[i].equals(d)) {
            // No esta el objeto que se quiere dar de baja.
            aux = null;
        } else {
            // Si esta el objeto que se quiere dar de baja.
            // Entonces regresa el obejto y en ese lugar mete el ultimo objeto que hay en el vector.
            // "sacar y rellenar el hueco con el ultimo elemento."
            aux = vec[i];
            vec[i] = vec[n - 1];
            n--; // Importante disminuir la n.
        }
        return aux;
    }
    
    // Obten el elemento en el indice i.
    public T getElemento(int i) {
        if (i < n) {
            return vec[i];
        } else {
            return null;
        }
    }
    
    // Para ordenar.
    // Devuelve el indice donde se encuentre el minimio a partir del int indice.
    public int minimoIndice(int indice) {
        int min = indice;
        for (int i = indice + 1; i < n; i++) {
            if (((Comparable)vec[i]).compareTo(vec[min]) < 0) {
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