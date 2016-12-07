package ejemploherencia;

public class Derivada extends Base {
    
    private int d1;
    
    public Derivada(int b1, int b2, int d1) {
        // La llamada al super debe de ser lo primero que ejecuta el constructor.
        super(b1, b2); // Se ejecuta el constructor de la clase base.
        this.d1 = d1;
    }

    public String toString() {
        return super.toString() + " Derivada{" + "d1=" + d1 + '}';
    }
    
    public int sumaDerivada() {
        return this.sumaBase() + d1;
    }
    
}
