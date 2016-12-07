
/**
 * Clave: 143743
 * @author Bernardo
 */
public class NumeroBinario {
    
    // Ejercicio 70.
    
    // Atributos.
    private String binario;
    
    // Metodos.
    public NumeroBinario() {}
    public NumeroBinario(int decimal) {
        this.binario = decimalBinario(decimal);
    }
    public String toString() {
        return binario;
    }
    public String decimalBinario(int num) {
        int i, n;
        String binario;
        binario = "";
        while (num > 0) {
            binario = (num % 2) + binario;
            num = num / 2;
        }
        n = binario.length();
        for (i = 0; i < 6; i++)
            binario = '0' + binario;
        return binario;
    }
    public int binarioDecimal(String binario) {
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
    public int compareTo(int indice) {
        int resp;
        resp = binario.charAt(indice) - '1';
        return resp;
    }
    public void setBinario(String binario) {
        this.binario = binario;
    }
}
