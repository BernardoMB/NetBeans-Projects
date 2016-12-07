package blackjack1;
/**
 * Clave: 143743.
 * @author Bernardo
 */
public class Carta {
    
    private int numero;
    private String palo;
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    } 
    public String toString() {
        String cad;
        switch(this.numero) {
            case 11:
                cad = "Sota";
                break;
            case 12:
                cad = "Reina";
                break;
            case 13:
                cad = "Rey";
                break;
            default:
                cad = "" + numero;
        }
        cad  = cad + "-" + palo;
        return cad;
    }
    private int getValor() {
        int resp;
        if (numero <= 10)
            resp = numero;
        else
            resp = 10;
        return resp;
    }
}
