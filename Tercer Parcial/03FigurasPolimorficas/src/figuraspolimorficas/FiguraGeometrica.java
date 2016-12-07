package figuraspolimorficas;

public class FiguraGeometrica {
    
    // Atributos.
    protected double dimension;

    // Constructor.
    public FiguraGeometrica(double dimension) {
        this.dimension = dimension;
    }
    
    // ToString.
    public String toString() {
        return "" + dimension;
    }
    
    // Para mostrar.
    public boolean equals(Object obj) {
        FiguraGeometrica aux = (FiguraGeometrica)obj;
        if (this.dimension == aux.dimension) {
            return true;
        } else {
            return false;
        }
    }
    
    // Para ordenar.
    public int compareTo(FiguraGeometrica figura) {
        if (this.dimension == figura.dimension) {
            return 0;
        } else {
            if (this.dimension > figura.dimension) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
}
