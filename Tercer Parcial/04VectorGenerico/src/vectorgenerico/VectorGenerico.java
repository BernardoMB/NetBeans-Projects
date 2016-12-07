package vectorgenerico;

public class VectorGenerico {

    public static void main(String[] args) {
        Vector<Integer> nums;
        nums = new Vector<Integer>(20);
        nums.alta(new Integer(7));
        nums.alta(8); // Esto tambien es valido.
        nums.alta(new Integer(7));
        nums.alta(new Integer(3));
        nums.alta(new Integer(-1));
        nums.alta(new Integer(4));
        System.out.println(nums); // Se llama al toString del vector.
        System.out.println("\nBusca -1: " + nums.buscaSecuancial(new Integer(-1)));
        System.out.println("Busca -22: " + nums.buscaSecuancial(new Integer(22)));
        System.out.println("\nEliminando 7: " + nums.bajaSinOrden(new Integer(7)));
        System.out.println(nums);
        System.out.println("\nEliminando 7: " + nums.bajaSinOrden(new Integer(7)));
        System.out.println(nums);
    }
    
}
