package figuraspolimorficas;

public class Circulo extends FiguraGeometrica {

    public Circulo(double dimension) {
        super(dimension);
    }
    
    public String toString() {
        return "Radio: " + super.toString();
    }
    
    public double calculaArea() {
        double radio = Double.parseDouble(super.toString());
        return Math.PI * radio * radio;
        // return this.dimension*this.dimension * Math.PI;
    }
    
    public double calculaPerimetro() {
        double radio = Double.parseDouble(super.toString());
        return Math.PI * 2 * radio;
        //return Math.PI * 2 * this.dimension;
    }
    
}
