/**
 * Clave: 143743
 * @author Bernardo Mondragon Brozon
 */
public class Departamento extends Propiedad {
    
    private int numRecamaras;

    public Departamento(double precioBase, String usoSuelo, int numRecamaras) {
        super(precioBase, usoSuelo);
        this.numRecamaras = numRecamaras;
    }

    public String toString() {
        return "Departamento - Precio base: $" + super.getPrecioBase() + ". Uso habitacional: " + super.getUsoSuelo() + ". Recámaras: " + this.numRecamaras;
    }

    public double calcularPrecioSugerido() {
        if (this.numRecamaras <= 2) 
            return super.getPrecioBase() * 0.7;
        else 
            return super.getPrecioBase();
    }
    
    public int getNumRecamaras() {
        return numRecamaras;
    }

    public void setNumRecamaras(int numRecamaras) {
        this.numRecamaras = numRecamaras;
    }
    
}
