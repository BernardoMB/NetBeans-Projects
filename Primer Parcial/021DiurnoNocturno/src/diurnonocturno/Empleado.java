package diurnonocturno;
/**
 * Clave: 143742
 * @author Bernardo
 */
public class Empleado {
    
    // Ejercicio 55.
    
    // Atributos:.
    private final double HORA = 10.50, PORC = 50.75;
    private String nombre, turno;
    private int horasTrabajadas;
    
    // Metodos.
    /*public String getNombre() { return this.nombre; }
    public int getHorasTrabajadas() { return this.horasTrabajadas; }
    public String getTurno() {return this.turno; }*/
    
    public Empleado() {}
    
    public Empleado(String nombre, int horasTrabajadas, String turno) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.turno = turno;
    }
    
    public double calculaSueldo() {
        double sueldo;
        // Recordar que los Strings se comparan con compareTo().
        if (turno.compareTo("diurno") == 0) 
            sueldo  = this.horasTrabajadas * this.HORA;
        else 
            sueldo = this.horasTrabajadas * this.HORA * (1 + this.PORC / 100);
        return sueldo;
    }
    
    public String getNombre() {
        int i, k;
        i = 0;
        while (nombre.charAt(i) != ' ')
            i = i + 1;
        k = i + 1; // Esta viendo la primera letra del apellido.
        i = i + 1;
        while (nombre.charAt(i) != ' ')
            i = i + 1;
        return nombre.substring(k, i);
    }
    
    public String toString() {
        String cad;
        cad = "\n\n\tNombre: " + nombre + "\n\tHoras: trabajadas: " + 
                horasTrabajadas + "\n\tTurno: " + turno;
        return cad;
    }
    
}