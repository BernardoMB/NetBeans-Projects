/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32enteroarchivo;
import java.util.*;
import java.io.*;

/**
 *
 * @author Bernardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File datos;
        Scanner lee;
        int num;
        datos = new File("enteros.txt");
        try {
            lee = new Scanner(datos);
        }
        catch (Exception e) {
            lee =null;
        }
        if (lee != null) {
            while (lee.hasNextInt()) {
                num = lee.nextInt();
                System.out.println(num);
            }
            lee.close();
        }
    }
    
}
