/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubjubilado;

/**
 *
 * @author Bernardo
 */
public class Jubilado 
{
    private int clave, edad;
    public Jubilado(int clave, int edad)
    {
        this.clave = clave;
        this.edad = edad;
    }
    public String toString()
    {
        return "\n\tClave: " + clave + "\n\tEdad: " + edad;
    }
    public Jubilado mayor(Jubilado j)
    {
        Jubilado resp;
        if (edad < j.edad)
            resp = j;
        else
            resp = this;//Referencia al objeto dueño
        return resp;
    }
    public boolean vivo()
    {
        boolean resp;
        if (edad < 110)
            resp = true;
        else
            resp = false;
        return resp;
    }
    public int compareTo(int e)
    {
        return edad - e;
    }
}
