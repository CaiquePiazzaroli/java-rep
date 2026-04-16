package ClasseBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Aula007MetodoValueOf {
    public static void main(String[] args) {

        // Instanciando com Long
        BigDecimal valor = BigDecimal.valueOf(100L);
        System.out.println(valor);           // 100
        System.out.println(valor.scale());   // 0

        // Instanciando com double
        BigDecimal valorDouble = BigDecimal.valueOf(55.9000);
        System.out.println(valorDouble); // 55.9
        System.out.println(valorDouble.scale()); // 1 

        // Casos de uso
        // Caso 1: Converter Loong para bigDecimal
        long quantidade = 150L;
        BigDecimal valorCaso1 = BigDecimal.valueOf(quantidade);
        System.out.println(valorCaso1); // 150

        // Caso 2: Somar valores sem perder precisao
        List<Double> valores = Arrays.asList(1.10, 2.20, 3.30);
        BigDecimal soma = BigDecimal.ZERO;
        for (double v : valores) {
            soma = soma.add(BigDecimal.valueOf(v));
        }
        System.out.println(soma); // 6.60
    }
}
