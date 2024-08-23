public class OperadoresUnarios {
    public static void main(String[] Args) throws Exception {
        // Operadores Unários
        int numero = 5;

        System.out.println(+numero);    // Saída: 5
        System.out.println(-numero);    // Saída: -5
        System.out.println(numero++);   // Saída: 5 (Sufixal)
        System.out.println(++numero);   // Saída: 7 (Prefixal)
        System.out.println(numero--);   // Saída: 7 (Sufixal)
        System.out.println(--numero);   // Saída: 5 (Prefixal)
        System.out.println(-(-numero)); // Saída: 5 

        System.out.println(!true);      // Saída: false
    }
}
