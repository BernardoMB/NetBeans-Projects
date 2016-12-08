package universidad;

public class Escolar extends Alumno {
    private String carrera;
    private double promedio;

    public Escolar(int clave, String nombre, String carrera, double promedio) {
        super(clave, nombre);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Escolar(int clave, String nombre, String carrera) {
        super(clave, nombre);
        this.carrera = carrera;
    }
    
    public String toString() {
        return super.toString() + "Escolar{" + "carrera=" + carrera + ", promedio=" + promedio + '}';
    }
    
    public boolean equals(Object obj) {
        Escolar aux = (Escolar)obj;
        if (aux.carrera == this.carrera) {
            return true;
        } else {
            return false;
        }
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
