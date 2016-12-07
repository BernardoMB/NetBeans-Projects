/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

/**
 * Clave: 143743
 * @author Bernardo
 */
public class Robot {
    
    // Ejercicio 63.
    
    public int identificacion;
    public double porcentaje;
    public Robot(int identificacion)
    {
        this.identificacion = identificacion;
        porcentaje = Math.random() * 100 + 1;//Mult. # de num y suma el menor
    }
    public String toString()
    {
        return "\n\tNúmero de identificación: " + identificacion + 
                "\n\tPorcentaje de vida: " + porcentaje;
    }
    /*
    Dado c, no es necesario el get, porque Robot ya regrea ambos datos 
    solicitados. 
    public  int getIdentificacion()
    {
        return this.identificacion;//puede ser sólo identificacion
    }
    */
    public int compareTo(double p)//Método de comparacion de double
    {
        int resp;
        if (porcentaje == p)
            resp = 0;
        else
            if (porcentaje < p)
                resp = -1;
            else
                resp = 1;
        return resp;
    }
    public int compareTo(Robot r)
    {
        int resp;
        if (porcentaje == r.porcentaje)
            resp = 0;
        else
            if (porcentaje < r.porcentaje)
                resp = -1;
            else
                resp = 1;
        return resp;
    }
    
    
}
