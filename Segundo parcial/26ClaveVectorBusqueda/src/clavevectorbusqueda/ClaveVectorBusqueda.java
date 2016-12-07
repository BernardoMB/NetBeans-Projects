package clavevectorbusqueda;
import java.util.*;

public class ClaveVectorBusqueda {

    public static final int DIM = 30;
    
    // Especificar el numero de elementos que meteremos al vector. Especificar n.
    public static int leeN(Scanner lee) {
        int n; 
        do
        {
            System.out.print("Cantidad de Alumnos: ");
            n = lee.nextInt();
            if(n<1 || n>DIM)
                System.out.println("\nError.Debe estar entre 1" + "y" +
                        DIM + "\n");
        }
        while(n < 1 || n > DIM);
        return n;
    }
    
    // Rellenar el vector de claves.
    public static void leeInfo(int claves[],int n, Scanner lee) {
        int i;
        for(i=0; i<n ; i++) {
            System.out.print("Clave "+(i+1)+": ");
            claves[i] = lee.nextInt();
        }
    }
    
    // Imrpime todo el contenido del vector.
    public static void imprimeTodas(int claves[],int n)
    {
        int i;
        for(i=0;i<n;i++)
                System.out.println("\t"+(i+1)+": "+claves[i]);
    }
    
    // Busqueda secuencial.
    public static int buscaSecuencial(int claves[], int n , int cl) {
        /*Busca secuencialmente cl en claves
           regrea el indice en donde la encontro o -1 si no esta cl en claves.
        */
        int i;
        i=0; 
        while(claves[i] != cl && i < n-1)
            i = i+1;
        if(claves[i]!= cl)
            i= -1;
        return i;
    }
    
    public static void buscaClaveSecuencial(int claves[], int n, Scanner lee)
    {
        int cl, loc;
        System.out.print("Clave: ");
        cl = lee.nextInt();
        loc = buscaSecuencial(claves,n,cl);
        if(loc == -1)
            System.out.println("\n\tClave no registrada");
        else 
            System.out.println("Se encuentra en: "+ loc);
    }
    
    // Regresa el inidice en donde se encuentre el minimo a partir del indice p.
    public static int minimo(int claves[], int n, int p)
    {
        int i, min;
        min = p;
        for(i = p+1 ; i<n ; i++)
            if(claves[i]<claves[min])
                min = i;
        return min;
    }
    
    // Seleccion directa. 
    public static void seleccionDirecta(int claves[], int n)
    {
        int i, min, aux;
        for(i = 0; i < n-1; i++) {
            min = minimo(claves,n,i);
            if(i != min) {
                // La posicion i no fue el minimo a partir de la posicion i.
                
                // Cambialos de lugar.
                aux = claves[min];
                claves[min] = claves[i];
                claves[i] = aux;
            }
        }
    }
    public static int busquedaBinaria(int claves[], int n, int cl) {
        int iz, der, c;
        iz = 0;
        der = n-1;
        c = (iz + der) /2;
        while(claves[c] != cl && iz<= der)
        {
            if(cl< claves[c])
                der = c - 1;
            else
                iz = c + 1;
            c = (iz + der)/2;
        }
        if(claves[c] != cl)
            c = -1;
        return c;         
    }
    
    public static void copiaVector(int claves[], int n , int sucio[])
    {
        int i; 
        for( i=0 ; i<n ; i++)
        sucio[i] = claves[i];       
    }
    
    public static boolean altaSinOrden(int sucio[],int n , Scanner lee)
    {
        int cl, loc;
        boolean resp;
        if(n == DIM)
            resp = false;
        else
        {
            System.out.println("Clave: ");
            cl = lee.nextInt();
            loc = buscaSecuencial(sucio,n,cl);
            if (loc != -1)
                resp = false;
            else
            {
                resp = true;
                sucio[n] = cl;
            }
        }
        return resp;
    }
    
    public static void buscaClaveBinaria(int claves[], int n,Scanner lee)
    {
        int cl,loc;
        System.out.print("Clave: ");
        cl = lee.nextInt();
        loc = busquedaBinaria(claves,n,cl);
        if(loc == -1)
            System.out.println("\n\tClave no registrada");
        else 
            System.out.println("Se encuentra en: "+ loc);
    }
    
    public static int bajasSinOrden(int sucio[],int n, Scanner lee)
    {
        int cl, loc,resp;
        System.out.println("Clave: ");
        cl = lee.nextInt();
        loc = buscaSecuencial(sucio,n,cl);
        if (loc == -1)
            resp = 0;
        else
        {
            resp = sucio[loc];
            sucio[loc] = sucio[n-1];
        }
        return resp;
    }
    
    
    public static int cambioSinOrden(int sucio[],int n, Scanner lee)
    {
        int cl, loc;
        System.out.println("Clave: ");
        cl = lee.nextInt();
        loc = buscaSecuencial(sucio,n,cl);
        if (loc  == -1)
            System.out.println("");
        else
            {
                System.out.println("Clave Nueva:");
                cl = lee.nextInt();
                sucio[loc]= cl;
            }
                
         return cl;     
    }
    
    public static void main(String[] args) 
    {
        Scanner lee;
        lee= new Scanner(System.in);
        int claves[],n,sucio[],baja;
        claves = new int[DIM];
        sucio = new int[DIM];
        n = leeN(lee);
        leeInfo(claves,n,lee);
        imprimeTodas(claves,n);
        //System.out.println(claves.length);
        System.out.println("\n\tBusqueda Secuencial\n");
        buscaClaveSecuencial(claves,n,lee);
        copiaVector(claves,n,sucio);
        System.out.println("\n\tCLAVES ORDENADAS\n");
        seleccionDirecta(claves,n);
        imprimeTodas(claves,n);
        System.out.println("\n\tBusqueda Binaria\n");
        buscaClaveBinaria(claves,n,lee);
        buscaClaveBinaria(claves,n,lee);
        buscaClaveBinaria(claves,n,lee);
        buscaClaveBinaria(claves,n,lee);
        System.out.println("\n\tVector sin Ordenar\n");
        imprimeTodas(sucio,n);
        System.out.println("\n\tALTA SIN ORDEN\n");
        if(altaSinOrden(sucio,n,lee)) {
            n= n+1;
            System.out.println("Ya fue dada de alta");
            imprimeTodas(sucio,n);
        } else { 
            System.out.println("No se dio de Alta");
        }
        System.out.println("\nBaja de vector sin orden\n");
        baja = bajasSinOrden(sucio,n,lee);
        if(baja==0) {
            System.out.println("No se dio de baja");
        }
        else {
            System.out.println("Se dio de baja "+baja);
            n = n-1;
            imprimeTodas(sucio,n);
        }
    }
    
}
