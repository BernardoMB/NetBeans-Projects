package java2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Java2 {
    
    // Popular vector.
    public static void popularVector(int vec[], int n, Scanner lee) {
        for(int i = 0; i < n ; i++) {
            System.out.print("Entero " + (i + 1) + ": ");
            vec[i] = lee.nextInt();
        }
    }
    
    // Obtener el promedio de los elementos del vector.
    public static double promedio(int vec[]) {
        double prom;
        prom = 0;
        for (int i = 0; i < vec.length; i++) {
            prom = prom + vec[i];
        }
        return prom / vec.length;
    }
    
     // Obtener el numero de enteros del vector que sean mayores o iguales al numero especificado (num).
    public static int cuentaMayorIgualNum(int vec[], int num) {
        int i, cuenta;
        cuenta = 0;
        for (i = 0; i < 10; i++) {
            if (vec[i] >= num)
                cuenta++;
        }
        return cuenta;
    }
    
    // Obtener el numero de enteros del vector que sean menores o iguales al numero especificado (num).
    public static int cuentaMenosIgualNum(int vec[], int n, int num) {
        int cuenta;
        cuenta = 0;
        for (int i = 0; i < n; i++) {
            if (vec[i] <= num)
                cuenta++;
        }
        return cuenta;
    }
    
    // Regresa el inidice donde se eucentra el entero mayor.
    public static int maximo(int vec[]) {
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (vec[i] > vec[max])
                max = i;
        }
        return max;
    }
    
    // Imrpime todo el contenido del vector.
    public static void imprimeTodos(int vec[], int n) {
        System.out.println("Todos los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + (i + 1) + ": " + vec[i]);
        }
    }
    
    // Busqueda secuencial.
    // Obtiene secuancialmente el indice en donde se encuentra 'entero' en el vector.
    // Si el entero no está en el vector, entonces regresa -1.
    public static int buscaSecuencial(int vec[], int n, int entero) {
        int i = 0; 
        while(vec[i] != entero && i < n - 1) {
            i++;
        }
        if(vec[i] != entero) {
            i = -1;
        }
        return i;
    }
    
    // Busqueda binaria.
    // Obtiene binariamente el indice en donde se encuentra 'entero' en el vector.
    // Si el entero no está en el vector, entonces regresa -1.
    public static int busquedaBinaria(int vec[], int n, int entero) {
        int iz, der, ctro;
        
        iz = 0;
        der = n - 1;
        ctro = (iz + der) / 2;
        
        while(vec[ctro] != entero && iz <= der) {
            if(entero < vec[ctro]) {
                der = ctro - 1;
            } else {
                iz = ctro + 1; 
            }
            ctro = (iz + der) / 2;
        }
        
        if(vec[ctro] != entero) {
            // No se encontró
            ctro = - 1;
        }
        
        return ctro;         
    }
    
    // Regresa el inidice en donde se encuentre el minimo a partir de p.
    public static int minimo(int vec[], int n, int p) {
        int min = p;
        for(int i = p + 1; i < n; i++) {
            if(vec[i] < vec[min]) {
                min = i;
            }
        }
        return min;
    }
    
    // Seleccion directa.
    // Ordena el vector de menos a mayor.
    public static void seleccionDirecta(int vec[], int n) {
        int i, min, aux;
        for(i = 0; i < n - 1; i++) {
            min = minimo(vec, n, i);
            if(i != min) {
                // La posicion i no fue el minimo a partir de la posicion i.
                
                // Entonces cambialos de lugar.
                aux = vec[min];
                vec[min] = vec[i];
                vec[i] = aux;
            }
        }
    }
    
    // Meter un entero al vector.
    // Regresa false si no se pudo dar de alta y true si se dio de alta exitosamente.
    public static boolean alta(int vec[], int n, Scanner lee) {
        int entero, loc;
        boolean altaExitosa;
        
        if(n == vec.length) {
            // El vector está lleno, entonces no se dio de alta nada.
            System.out.println("El vector esta lleno.");
            altaExitosa = false;
        } else {
            System.out.println("Entero: ");
            entero = lee.nextInt();
            loc = buscaSecuencial(vec, n, entero);
            if (loc != -1) {
                // entero ya está dado de alta en el vector, entonces no se agrega nada.
                altaExitosa = false;
            } else {
                // entero no está en el vector entonces agregalo al vector.
                altaExitosa = true;
                vec[n] = entero;
            }
        }
        return altaExitosa;
    }
    
    // Scar un entero del vector.
    // Regresa 0 si no hay nada para dar de baja y el entero dado de baja si se dio la baja exitosamente.
    public static int baja(int vec[], int n, Scanner lee) {
        int entero, loc, resp;
        System.out.print("Entero: ");
        entero = lee.nextInt();
        loc = buscaSecuencial(vec, n, entero);
        if (loc == -1) {
            resp = 0;
        } else {
            resp = vec[loc];
            vec[loc] = vec[n-1];
        }
        return resp;
    }
    
    // Cambiar un entero del vector.
    // Regresa el enetero que se cambio.
    public static int cambio(int vec[], int n, Scanner lee) {
        int entero, loc;
        System.out.print("Entero: ");
        entero = lee.nextInt();
        loc = buscaSecuencial(vec, n, entero);
        if (loc  == -1) {
            System.out.println("El entero que se quiere cambiar no está en el vector.");
        } else {
            System.out.print("Entero nuevo: ");
            entero = lee.nextInt();
            vec[loc] = entero;
        }
        return entero;     
    }
    
    // Lectura de archivo.
    public void leeInfo() {
        // (como en Remesas)
        
        // Variable auxiliar.
        int i = 0;
        
        //mesAnio = new int[nrow][ncol1];
        //tipos = new double[nrow][ncol2];
        
        File datos = new File("TipoCambio.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            System.out.println("No se pudo inicializar el Scanner.");
            lee = null;
        }
        if (lee != null) {
            /*while (lee.hasNextInt() && i < nrow) {
                mesAnio[i][0] = lee.nextInt();
                mesAnio[i][1] = lee.nextInt();
                tipos[i][0] = lee.nextDouble();
                tipos[i][1] = lee.nextDouble();
                tipos[i][2] = lee.nextDouble();
                tipos[i][3] = lee.nextDouble();
                i++;
                n++;
            }*/
            lee.close();
        }
        
        // Imprimiendo informacion de la matri que inidica el tipo de cambio a aplicar.
        /*for (i = 0; i < n; i++) {
            System.out.println("Mes: " + mesAnio[i][0] + ", Anio: " + mesAnio[i][1] + ", MO: " + tipos[i][0] + ", CP: " + tipos[i][1] + ", T: " +  tipos[i][2] + ", E: " + tipos[i][3] + "\n");
        }*/
        
        // Lectura de las remesas.
        i = 0;
        //remesas = new Remesa[DIM];
        
        datos = new File("remesas.txt");
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextInt() && i < DIM) {
                /*remesas[i] = new Remesa(lee.nextInt(), lee.nextInt(), lee.nextInt(), lee.nextDouble());
                i++;
                nr++;*/
            }
            lee.close();
        }
        
        // Impriminedo el contenido del vector de remesas.
        /*for (i = 0; i < nr; i++) {
            System.out.println(remesas[i]);
        }*/
    }
    
    // Escritura de archivo.
    public void actualizaArchivo() {
        // (como en Escuela Vazquez)
        
        FileOutputStream datos;
        PrintWriter esc;
        try
        {
            datos = new FileOutputStream("alumnos.txt",true);
            esc = new PrintWriter(datos);
            /*if (frmAltas.n != frmAltas.nA) {
                esc.println();
            }*/
            /*for (int i = frmAltas.nA; i < frmAltas.n; i++) {
                esc.print(frmAltas.claves[i]+ "\t");
                for(int j = 0; j < 3; j++) {
                    esc.print(frmAltas.califs[i][j] + "\t");
                }
                if (i == frmAltas.n - 1) {
                    esc.print(frmAltas.califs[i][3]);
                } else {
                    esc.println(frmAltas.califs[i][3]);
                }
            }*/
            esc.close();
        }  catch(Exception e) {
            System.out.println("No se actualizó el archivo.");
        }
    }
    
    // Programando un radio btn y actualizando cmbModel.
    private void rdbtnConstruccionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // (como en Herramientas)
        
        javax.swing.DefaultComboBoxModel datos;
        datos = new javax.swing.DefaultComboBoxModel<>();
        /*for (int i = 0; i < n; i++)
         if(vec[i].tipo == 1) {
             datos.addElement(vec[i].nombre);
         }
        this.cmbArticulos.setModel(datos);*/
    }
    
    // Mostrar elementos en una JList.
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // (como en Herraminetas)
        
        javax.swing.DefaultListModel listaArt = new javax.swing.DefaultListModel();
        javax.swing.DefaultListModel listaPre = new javax.swing.DefaultListModel();
        
        //String cad = (String) this.cmbArticulos.getSelectedItem();
        
        int i;
        String texto;
        double precio = 0;
        try {
            // Para la lista de articulos.
            /*for(i = 0; i < this.txtArticulos.getModel().getSize(); i++) {
                texto = (String) this.txtArticulos.getModel().getElementAt(i);
                listaArt.add(i, texto);
            }
            listaArt.add(i,cad);
            this.txtArticulos.setModel(listaArt);*/
            
            // Para Obtener el precio correcto.
            i = 0;
            /*while (i < n && precio == 0) {
                if(vec[i].compareTo(cad) == 0) {
                    precio = vec[i].precio;
                }
                i++;
            }*/ 
            
            // Para la lista de precios. 
            /*for (i = 0; i < this.txtPrecios.getModel().getSize(); i++) {
                texto = (String) this.txtPrecios.getModel().getElementAt(i);
                listaPre.add(i, texto);
            }*/
            listaPre.add(i, precio + "");
            /*this.txtPrecios.setModel(listaPre);
            
            monto = monto + precio;
            cantidad++;*/
        } catch (Exception e) {
            
        }
    } 
    
    // Para generar Reporte.
    public void creaReporte() {
        // (como en Escuela Vazquez)
        
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("reporte.txt", false);
            esc = new PrintWriter(datos);
            esc.println("\n\t\t\t" + LocalDate.now());
            esc.println("\n\n\t\t\t\tALUMNOS DEL GRUPO MIO\n");
            /*for(int i = 0; i < frmAltas.n; i++) {
                esc.println(frmAltas.claves[i]+ "\t"+ (int)(frmAltas.califs[i][4])*100/100.0);
            }*/
            esc.close();
        } catch(Exception e) {
            System.out.println("no se creo Reporte");
        }
    }
    
    // Para colocar una imagen hay que poner un laber y modificar la propperty de icon.
    
    public static final int DIM = 100;
    
    public static void main(String[] args) {
        
    }
    
}
