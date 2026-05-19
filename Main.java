public class Main {
    public static void main(String[] args) {

        float valor1 = 456.90f; // 32 bits ou 4 Bytes (Menor em espaço)
        double valor2 = 97.42; // 64 bits ou 8 Bytes (Maior em espaço)

        // Widening (Wide - Largo) cast ou cast implícito: quando converte um tipo menor em um maior
        double novoValor1 = valor1;
        System.out.println(novoValor1);

        // Narrowing  (narrow - estreito) cast ou cast explícito: Quando converte-se um tipo maior em um tipo menor a
        float novoValor2 = (float) valor2;
        System.out.println(novoValor2);
        
    }
}

class MinhaClasse {
    public int numero;
}
