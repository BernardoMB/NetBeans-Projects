/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FELIPE JUNCAL MENDOZA
 */
public class Amigo
{
    private String nombre, telefono, lugar;
    private int dia, mes, anio;
    public Amigo(String nombre, String telefono, String lugar, int dia, int mes, int anio)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.lugar = lugar;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public String toString()
    {
        return nombre + "\nTelefono: " + telefono + "\n" + lugar + "\n" 
                + dia + "/" + mes + "/" + anio;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getTelefono()
    {
        return telefono; 
    }
    public String getLugar()
    {
        return lugar; 
    }
    public void setTelefono(String tele)
    {
        telefono = tele;
    }
}
