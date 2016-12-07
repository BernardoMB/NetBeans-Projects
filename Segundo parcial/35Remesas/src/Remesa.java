public class Remesa {
    // Atributos.
    private int mes;
    private int anio;
    private int operacion;
    private double monto;
    
    // Metodos.
    
    // Constructor.
    public Remesa(int mes, int anio, int operacion, double monto) {
        this.mes = mes;
        this.anio = anio;
        this.operacion = operacion;
        this.monto = monto;
    }
    
    // toString.
    public String toString() {
        return "Remesa{" + "mes=" + mes + ", anio=" + anio + ", operacion=" + operacion + ", monto=" + monto + '}';
    }

    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    public int getOperacion() {
        return operacion;
    }
    public double getMonto() {
        return monto;
    }
}
