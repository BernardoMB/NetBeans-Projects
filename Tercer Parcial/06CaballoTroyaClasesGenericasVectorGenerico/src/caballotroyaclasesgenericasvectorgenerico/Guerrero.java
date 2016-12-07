package caballotroyaclasesgenericasvectorgenerico;

public class Guerrero implements Comparable<Guerrero> {
    private String nombre;
    private int edad, fuerza;
    private boolean herido;

    public Guerrero(String nombre, int edad, int fuerza, boolean herido) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        this.herido = herido;
    }

    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", edad=" + edad + ", fuerza=" + fuerza + ", herido=" + herido + "}";
    }
    
    public int compareTo(Guerrero g) {
        // Se utiliza el compareTo default de strings de Java.
        return nombre.compareTo(g.nombre);
    }
    
    public boolean equals(Object obj) {
        // Este es el criterio para saber si lo tomamos en cuenta o no.
        boolean condicion = edad >= 20 && edad <= 55 && fuerza >= 3 && fuerza <= 10;
        return condicion;
    }
}
