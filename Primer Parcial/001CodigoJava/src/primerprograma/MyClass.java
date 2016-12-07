package primerprograma;
import java.util.*;

public class MyClass {
    
    // Atributos.
    private int numeroEntero;
    private double numeroDouble;
    private String cadenaDeTexto;
    // Atributo no no mandado como parametro al constructor.
    private double numeroAleatorio;
    
    // Metodos.
    // Constructor vacío
    public MyClass() {}
    // Constructor.
    public MyClass(int numeroEntero, double numeroDouble, String cadenaDeTexto) {
        this.numeroEntero = numeroEntero;
        this.numeroDouble = numeroDouble;
        this.cadenaDeTexto = cadenaDeTexto;
        this.numeroAleatorio = Math.random();
    }
    // toString reglamentario.
    public String toString() {
        return "MyClass{" + "numeroEntero=" + numeroEntero + ", numeroDouble=" + numeroDouble + ", cadenaDeTexto=" + cadenaDeTexto + '}';
    }
    public int getNumeroEntero() {
        return numeroEntero;
    }
    public double getNumeroDouble() {
        return numeroDouble;
    }
    public void setNumeroDouble(double numeroDouble) {
        this.numeroDouble = numeroDouble;
    }
    public int compareTo(int e) {
        return this.numeroEntero - e;
    }
    
    /**
     * OERADORES:
     * And: a && b
     * or: a || b
     * igual: a == b
     * desigual: a != b
     * Salto de linea: \n.
     * Tabulación: \t.
    */
    
    // Colores: 
    /**
     * 30 black
     * 31 red
     * 32 green
     * 33 yellow
     * 34 blue
     * 35 magenta
     * 36 cyan
     * 37 white
     * 40 black background
     * 41 red background
     * 42 green background
     * 43 yellow background
     * 44 blue background
     * 45 magenta background
     * 46 cyan background
     * 47 white background
     * 1 make bright (usually just bold)
     * 21 stop bright (normalizes boldness)
     * 4 underline
     * 24 stop underline
     * 0 clear all formatting
     */ 
   public static final String NEGRO = "\033[30m";
    public static final String AZUL = "\033[34m";
    public static final String ROJO = "\033[31m";
    
    // Imprimir a la consola.
    public static void log(String s) {
        System.out.println(s);
    }
    
    // (Parse) Convertir un char a un int.
    public static int charToInt(char n) {
        return (int)n;
    }
    
    // (Parse) Convertir un int a char.
    public static char intToChar(int n) {
        return (char)n;
    }
    
    // (Parse) Convertir un int a double.
    public static double intToDouble(int n) {
        return (double)n;
    }
    
    // (Parse) Convertir un double a int.
    public static int doubleToInt(double n) {
        return (int)n;
    }
    
    // Calcular modulos. // Mod.
    public static int mod(int a, int b){
        return a % b;
    }
    
    // Guardar en la variable declarada el siguiente int.
    public static int intInput() {
        int a;
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        a = myScanner.nextInt(); 
        return a;
    }
    // A veces, para crear objetos, creamos una función que cree el objeto y a
    // esa funcion le pasamos el objeto de clase Scanner ya instanseado.
    
    // Guardar en la variable declarada el siguiente double.
    public static double doubleInput() {
        Scanner myScanner = new Scanner(System.in);
        double a = myScanner.nextDouble();
        return a;
    }
    
    // Guardar en la variable declarada el siguiente int.
    public static String stringInput() {
        Scanner myScanner = new Scanner(System.in);
        String s = myScanner.nextLine();
        return s;
    }
    
    // Calcular valor absoluto.
    public static double abs(double a) {
        return Math.abs(a);
    }
    
    // Elevar un numero a una cierta potencia.
    public static double pow(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    // Decir si el caracter es mayucula o minusula.
    public static boolean esMayuscula(char a) {
        return a >= 'A' && a <='Z';
    } 
    
    // Decir si dos caracteres son iguales.
    public static boolean sonIguales(char a, char b) {
        return a == b;
    }
    
    // Decir si es caracter es un numero.
    public static boolean esNumero(char a) {
        return a >= '0' && a <= '9';
    }

    // Calcular paga de obrero.
    public static double calcularSalrio(int jornada, double precioHoras, double precioHorasExtra) {
        log("Nombre: ");
        String nombre = stringInput();
        log("Clave: ");
        int clave = intInput();
        log("Horas trabajdas: ");
        double horasTrabajadas = doubleInput();
        double totalAPagar;
        if (horasTrabajadas >= jornada) {
            double a = horasTrabajadas - jornada;
            totalAPagar = jornada * precioHoras + a * precioHorasExtra;
        } else {
            totalAPagar = horasTrabajadas*precioHoras;
        }
        System.out.printf("Salario: $%,1.3f.\n", totalAPagar);
        return totalAPagar;
    }
    
    // Validacion para solo numeros positivos. 
    public static int positiveIntInput(String mensaje, String error) {
        int a;
        do {
            log(mensaje);
            a = intInput();
            if (a <= 0) {
               log("\n" + ROJO + error + "\n" + ROJO);
            }
        }
        while (a < 0);
        return a;
    }
    
    // Ponerle precio a un mensaje.
    // Obtner longitud de string. Uso de .lenght().
    public static double precioMensaje(double precioCaracter, double precioNumero, double precioCaracterEspecial, double precioEspacio) {
        log("Mensaje: ");
        String mensaje = stringInput();
        double precio = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z' || mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
                precio = precio + precioCaracter;
            } else if (mensaje.charAt(i) >= '0' && mensaje.charAt(i) <= '9') {
                precio = precio + precioNumero;
            } else if (mensaje.charAt(i) != ' ') {
                precio = precio + precioCaracterEspecial;
            } else if (mensaje.charAt(i) == ' ') {
                precio = precio + precioEspacio;
            }
        }
        System.out.printf("Por pagar: $%,1.2f\n", precio);
        return precio;
    }
    
    // Comparar los primeros caracteres de dos strings.
    // charAt().
    public static void comparaCaracteres(String a, String b) {
        char primerCaracterDeA;
        char primerCaracterDeB;
        primerCaracterDeA = a.charAt(0);
        primerCaracterDeB = b.charAt(0);
        if (primerCaracterDeA == primerCaracterDeB)
            System.out.println("Son iguales.");
        else 
            System.out.println("No son iguales.");
    }
    
    // Obtener digitos de un numero.
    // Obtener los primeros cuatro digitos de un numero.
    public static void imprimeDigitos (int numero) {
        int uno;
        int dos;
        int tres;
        int cuatro;
        uno = numero % 10;
        numero = numero/10;
        dos = numero % 10;
        numero = numero/10;
        tres = numero % 10;
        numero = numero/10;
        cuatro = numero % 10;
        numero = numero/10;
        System.out.println("Uno: " + uno);
        System.out.println("Dos: " + dos);
        System.out.println("Tres: " + tres);
        System.out.println("Cutro: " + cuatro);
    }
    
    // Mostrar la tabla de multiplicar de un numero.
    public static void mostrarTablaDeMultiplicar(int num) {
        int i;
        int limite;
        limite = 10;
        System.out.println("Numero: " + num);
        for (i = 0; i <= limite; i++) {
            System.out.printf("%12d%12d\n", i, num * i);
        }
    }
    
    // Obtener numero de digitos de un  numero.
    // Uso del while() simple.
    public static int obtenerNumeroDeDigitos(int num) {
        int aux;
        int numeroDeDigitos;
        aux = num;
        numeroDeDigitos = 0;
        while (aux > 0) {
            numeroDeDigitos++;
            aux = aux / 10;
        }
        return numeroDeDigitos;
    }
    
    // Determinar si un numero es perfecto.
    public static boolean esPerfecto(int num) {
        int i, limite, suma;
        limite = num/2;
        suma = 0;
        for (i = 1; i <= limite; i++) {
            if (num % i == 0) {
                suma = suma + i;
            } 
        }
        return suma == num;
    }
    
    // Obtener suma de divisores propios.
    public static int divisoresPropios(int a) {
        int i;
        int suma;
        int limite;
        limite = a/2;
        suma = 0;
        for (i = 1; i <= limite; i++) {
            if (a % i == 0)
                suma++;
        }
        return suma;
    }
    
    // Decir si o determinar si dos numeros son amigos.
    public static boolean sonAmigos(int a, int b) {
        return a == divisoresPropios(b) && b == divisoresPropios(a);
    }
    
    // Obtener la serie de Fibonacci.
    public static void getFibonacci(int n) {
        /**
         * La serie de Fibonacci se obtiene con la siguiente relación
         * de recurrencia:
         * a_n = a_{n-1} + a_{n-2}.
         */
        int a = 1; // a_{n-2}
        int b = 1; // a_{n-1}
        int c; // a_n
        System.out.printf(""+a+", ");
        System.out.printf("\033[31m"+b+"\033[0m, ");
        int i; // Contador.
        for (i=0; i<=n-3; i++) {
            c = a+b;
            a=b;
            b=c;
            if (i != n-3) {
                System.out.printf("\033[3"+(i+2)+"m"+c+"\033[0m, ");
            } else {
                System.out.printf("\033[3"+(i+2)+"m"+c+"\033[0m.\n");
            }   
        }
    }
    
    // Lee y valida un numero mayor o igual a 1.
    public static int leeDecimal() {
        Scanner lee;
        int num;
        lee = new Scanner(System.in);
        do {
            System.out.println("\nNúmero decimal.");
            num = lee.nextInt();
            if (num < 1) {
                System.out.println("\n\t\tError: tiene que ser un número positivo.");
            }
        }
        while (num < 1);
        return num;        
    }
    
    // Lee un numero binario.
    public static String leeBinario() {
        Scanner lee;
        String binario;
        lee = new Scanner(System.in);
        System.out.println("\nNúmero en binario: ");
        binario = lee.nextLine();
        return binario;
    }
    
    // Lee un numero entero mayor a cero.
    public static int leerEntero(Scanner scanner) {
        int entero;
        do {
            System.out.println("Especificar número positivo.");
            entero = scanner.nextInt();
            if (entero <= 0) {
                System.out.println("Error: el número debe ser positivo.");
            }
        } while (entero <= 0);
        return entero;
    }
    
    // Convertir decimal a binario
    // decimal-binario. conversiones.
    public static String decimalBinario(int num) {
        String binario;
        binario = "";
        while (num > 0) {
            binario = (num % 2) + binario;
            num = num / 2;
        }
        return binario;
    }
    
    // Convertir binario a decimal.
    // decimal-binario. conversiones.
    public static int binarioDecimal(String binario) {
        int pot2, i, num, n;
        pot2 = 1; // 2 a la 0.
        num = 0;
        n = binario.length() - 1;
        // for statement decreciente.
        for (i = n; i >= 0; i--) { 
            num = num + pot2 * (binario.charAt(i) - '0');
            pot2 = pot2 * 2;
        }
        return num;
    }
    
    // Convertir numero entero a romano.
    // Parse a romano. 
    public static String enteroARomano(int num) {
        String romano = "";
        if (num <= 3999 && num >= 1000) {
            int cuarto;
            int tercero;
            int segundo;
            int primero;            
            cuarto = num / 1000;
            num = num - cuarto * 1000;
            tercero = num / 100;
            num = num - tercero * 100;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            
            switch (cuarto) {
                case 0: break;
                case 1: romano = "M"; break;
                case 2: romano = "MM"; break;
                case 3: romano = "MMM"; break;
            }
            
            switch (tercero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "C";
                    break;
                case 2:
                    romano = romano + "CC";
                    break;
                case 3:
                    romano = romano + "CCC";
                    break;
                case 4:
                    romano = romano + "CD";
                    break;
                case 5:
                    romano = romano + "D";
                    break;
                case 6:
                    romano = romano + "DC";
                    break;
                case 7:
                    romano = romano + "DCC";
                    break;
                case 8:
                    romano = romano + "DCCC";
                    break;
                case 9:
                    romano = romano + "CM";
                    break;
            }
            
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 1000 && num >= 100) {
            int tercero;
            int segundo;
            int primero;
            tercero = num / 100;
            num = num - tercero * 100;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            switch (tercero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "C";
                    break;
                case 2:
                    romano = romano + "CC";
                    break;
                case 3:
                    romano = romano + "CCC";
                    break;
                case 4:
                    romano = romano + "CD";
                    break;
                case 5:
                    romano = romano + "D";
                    break;
                case 6:
                    romano = romano + "DC";
                    break;
                case 7:
                    romano = romano + "DCC";
                    break;
                case 8:
                    romano = romano + "DCCC";
                    break;
                case 9:
                    romano = romano + "CM";
                    break;
            }
            
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 100 && num >= 10) {
            int segundo;
            int primero;
            segundo = num / 10;
            num = num - segundo * 10;
            primero = num;
            switch (segundo) {
                case 0:
                    break;
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        } else if (num < 10 && num >= 1) {
            int primero;
            primero = num;
            switch (primero) {
                case 0:
                    break;
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        }
        return romano;
    }
    
    // Obtener la segunda palabra. Uso del substring().
    // Obtener apellido de un nombre.
    public static String getSegundaPalabra(String nombre) {
        int i, k;
        i = 0;
        while (nombre.charAt(i) != ' ')
            i = i + 1;
        k = i + 1; // Esta viendo la primera letra del apellido.
        i = i + 1;
        while (nombre.charAt(i) != ' ')
            i = i + 1;
        return nombre.substring(k, i);
    }
    
}