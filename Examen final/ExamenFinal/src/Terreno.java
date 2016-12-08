/**
 * Clave: 143743
 * @author Bernardo Mondragon Brozon
 */
public class Terreno extends Propiedad {
    
    private boolean serviciosUrbanisticos;

    public Terreno(double precioBase, String usoSuelo, boolean serviciosUrbanisticos) {
        super(precioBase, usoSuelo);
        this.serviciosUrbanisticos = serviciosUrbanisticos;
    }

    public String toString() {
        return "Terreno - Precio base: $" + super.getPrecioBase() + ". Uso habitacional: " + super.getUsoSuelo() + ". Servicios básicos: " + this.serviciosUrbanisticos;
    }

    public double calcularPrecioSugerido() {
        if (this.serviciosUrbanisticos) 
            return super.getPrecioBase() * 1.1;
        else 
            return super.getPrecioBase();
    }
    
    public boolean getServiciosUrbanisticos() {
        return serviciosUrbanisticos;
    }

    public void setServiciosUrbanisticos(boolean serviciosUrbanisticos) {
        this.serviciosUrbanisticos = serviciosUrbanisticos;
    }

    
    
}
