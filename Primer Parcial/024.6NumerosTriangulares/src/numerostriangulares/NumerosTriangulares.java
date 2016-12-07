/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerostriangulares;

/**
 *
 * @author Bernardo
 */
public class NumerosTriangulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 8;
        int i = 0;
        int y = 1;
        int h;
        do {
            if (((y*(y+1))/2) == numero) {
              h = ((y*(y+1))/2);
              i = 1;
              System.out.println("El numero es triangular");
            }
            if (((y*(y+1))/2) > numero) {
                i = 1;
                System.out.println("El numero no es triangular");
            }
            y++;
        } while (i == 0);
                
        
    }
    
}
