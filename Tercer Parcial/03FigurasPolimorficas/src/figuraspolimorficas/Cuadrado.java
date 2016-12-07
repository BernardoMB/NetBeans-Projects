package figuraspolimorficas;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(double dimension) {
        super(dimension);
    }

    public String toString() {
        return "Lado: " + super.toString();
    }
    
    public double calculaArea() {
        double lado = Double.parseDouble(super.toString());
        return lado * lado;
        //return this.dimension*this.dimension;
    }
    
    public double calculaPerimetro() {
        double lado = Double.parseDouble(super.toString());
        return 4 * lado;
        //return 4 * this.dimension;
    }
    
}
