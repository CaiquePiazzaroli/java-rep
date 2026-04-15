package ClasseBigDecimal;

import java.math.BigDecimal;

public class Aula001InstanciandoUmBigDecimal {
    public static void main(String[] args) {

        // Errado: Nunca instanciar um big decimal com numeros 
        BigDecimal valor1 = new BigDecimal(0.2);
        System.out.println(valor1.multiply(new BigDecimal(10)).toPlainString()); // 2.000000000000000111022302462515654042363166809082031250

        // Correto: Sempre use String como parametro ou o método valueof()
        BigDecimal valor2 = new BigDecimal("0.2");
        System.out.println(valor2.multiply(new BigDecimal("10"))); // 2.0

        BigDecimal valor3 = BigDecimal.valueOf(0.2);
        System.out.println(valor2.multiply(BigDecimal.valueOf(10))); // 2.0
    }
}
