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
public class ClubJubilado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jubilado j1, j2, j3;
        int c;
        c = 0;
        j1 = new Jubilado(21, 98);
        j2 = new Jubilado(54, 112);
        j3 = new Jubilado(67, 101);
        System.out.println("Jubilado mayor: " + (j1.mayor(j2)).mayor(j3));
        System.out.println("Está vivo j2? " + j2.vivo());
        System.out.println("Está vivo j3? " + j3.vivo());
        if (j2.compareTo(100) > 0)
            c = c + 1;
        if (j3.compareTo(100) > 0)
            c = c + 1;
        System.out.println("\nCantidad de Jubilados con más de 100 años: " + c);
    }
    
}
