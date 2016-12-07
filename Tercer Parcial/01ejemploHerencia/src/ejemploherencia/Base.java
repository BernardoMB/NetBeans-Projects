package ejemploherencia;

public class Base {
    
    private int b1, b2;

    public Base(int b1, int b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public String toString() {
        return "Base{" + "b1=" + b1 + ", b2=" + b2 + '}';
    }
    
    public int sumaBase() {
        return b1 + b2;
    }
    
}
