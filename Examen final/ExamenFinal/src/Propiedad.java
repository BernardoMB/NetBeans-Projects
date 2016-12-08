/**
 * Clave: 143743
 * @author Bernardo Mondragon Brozon
 */
public class Propiedad {
    
    // Atributos.
    private double precioBase;
    private String usoSuelo;
    
    // Construcotr.
    public Propiedad(double precioBase, String usoSuelo) {
        this.precioBase = precioBase;
        this.usoSuelo = usoSuelo;
    }

    public String toString() {
        return "Propiedad: " + "precioBase: " + precioBase + ", usoSuelo: " + usoSuelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getUsoSuelo() {
        return usoSuelo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setUsoSuelo(String usoSuelo) {
        this.usoSuelo = usoSuelo;
    }
    
}
