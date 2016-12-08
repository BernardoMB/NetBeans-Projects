/**
 * Clave: 143743
 * @author Bernardo Mondragon Brozon
 */
public class Casa extends Propiedad {
    
    private double metrosCuadrados;

    public Casa(double precioBase, String usoSuelo, double metrosCuadrados) {
        super(precioBase, usoSuelo);
        this.metrosCuadrados = metrosCuadrados;
    }

    public String toString() {
        return "Terreno - Precio base: $" + super.getPrecioBase() + ". Uso habitacional: " + super.getUsoSuelo() + ". Metros cuadrados: " + this.metrosCuadrados;
    }

    public double calcularPrecioSugerido() {
        if (this.metrosCuadrados > 100) 
            return super.getPrecioBase() * 1.2;
        else 
            return super.getPrecioBase();
    }
    
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
 
}
