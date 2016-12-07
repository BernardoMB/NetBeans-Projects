package blackjack1;
/**
 * Clave: 143743
 * @author Bernardo
 */
public class BlackJack1 {
    
    public static Carta creaCarta() {
        int num, p;
        String palo;
        num = (int)(Math.random() * 13) + 1;
        p = (int)(Math.random() * 4) + 1;
        switch (p){
            case 1:
                palo = "diamante";
                break;
            case 2:
                palo = "corazon";
                break;
            case 3:
                palo = "espada";
                break;
            case 4:
                palo = "trebol";
                break;
            default:
                palo = "nada";
        }
        return new Carta(num, palo);
    }
    
    public static void main(String[] args) {
        
        // Ejercicio 71.
        
        
    }
    
}
