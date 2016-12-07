package personaedades;
/**
 *
 * @author Bernardo
 */
public class PersonaEdades {

    public static void main(String[] args) {
        
        Persona p;
        p = new Persona("Domitila Dominuez", 21);
        if (p.compareTo(12) < 0) 
            System.out.println(p + " es niño.");
        else 
            if (p.compareTo(21) <= 0) 
                System.out.println(p + " es adolescente.");
            else 
                System.out.println(p + " es adulto.");
        
    }
    
}
