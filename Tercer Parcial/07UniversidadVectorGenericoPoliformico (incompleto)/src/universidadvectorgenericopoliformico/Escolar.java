package universidadvectorgenericopoliformico;

public class Escolar extends Alumno{
    private String carrera;
    private double promedio;
    public Escolar(int clave, String nombre, String carrera, double promedio) {
        super(clave, nombre);
        this.carrera = carrera;
        this.promedio = promedio;
    }
    public Escolar (String carrera) {
        super();
        this.carrera = carrera;
    }
    public boolean equals(Object obj) {
        Escolar aux;
        aux = (Escolar)obj;
        return aux.carrera.equals(carrera);
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public String toString() {
        return super.toString() + "Escolar{" + "carrera=" + carrera + ", promedio=" + promedio + '}';
    }
}
