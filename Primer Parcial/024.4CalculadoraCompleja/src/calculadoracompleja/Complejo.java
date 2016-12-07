/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracompleja;

/**
 *
 * @author Bernardo
 */
public class Complejo {
    
    private double real, imag;
    
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public String toString() {
        String cad;
        cad = ((int)(real * 1000)) / 1000.0 + " ";
        if (imag > 0)
            cad = cad + "+ " + ((int)(imag * 1000)) / 1000.0 + "i";
        else 
            cad = cad + "- " + Math.abs(imag) + "i";
        return cad;
    }
    public Complejo suma(Complejo c){
        double r, im;
        r = real + c.real;
        im = imag + c.imag;
        return new Complejo(r, im);
    }
    public Complejo resta(Complejo c){
        double r, im;
        r = real - c.real;
        im = imag - c.imag;
        return new Complejo(r, im);
    }
    public Complejo multiplica(Complejo c) {
        double r, im;
        r = real * c.real - imag * c.imag;
        im = real * c.imag + imag * c.real;
        return new Complejo(r, im);
    }
}
