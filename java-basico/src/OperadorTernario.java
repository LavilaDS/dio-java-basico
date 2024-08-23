public class OperadorTernario {
    public static void main(String[] args) {
        // Operador Ternário

        int idade = 23;
        String faixaEtaria = (idade > 17) ? "Adulto" : "Adolescente";
        // (condicao) ? [valor_se_verdadeiro]: [valor_se_falso]

        System.out.println(faixaEtaria); // Saída: Adulto
    }
}
