package ClasseBigDecimal;

import java.math.BigDecimal;

public class Aula005MetodosDeConversao {
    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal("100.5");
        
        // Convertendo para int
        int numero1 = n1.intValue();
        System.out.println(numero1); // 100

        // Convertendo para long
        long numero2 = n1.intValue();
        System.out.println(numero2); // 100

        // Convertendo para float
        float numero3 = n1.floatValue();
        System.out.println(numero3); // 100.5

        // Convertendo para double
        double numero4 = n1.doubleValue();
        System.out.println(numero4); // 100.5

        // Convertendo para string
        String texto = n1.toPlainString();
        System.out.println(texto); // 100.5 em string
    }
}
