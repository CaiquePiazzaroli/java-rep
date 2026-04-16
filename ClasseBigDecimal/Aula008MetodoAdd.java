package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Aula008MetodoAdd {
    public static void main(String[] args) {

        BigDecimal resultado = BigDecimal.ZERO;
        
        // Soma de dois valores
        BigDecimal n1 = new BigDecimal("10.95");
        BigDecimal n2 = new BigDecimal("90.7859");
    
        resultado = n1.add(n2); // 10.95 + 90.7859 = 101,7359
        System.out.println(resultado);

        // Soma de dois valores controlando aas casas decimais
        BigDecimal n3 = new BigDecimal("44.93");
        BigDecimal n4 = new BigDecimal("100.56489");
        MathContext contexto = new MathContext(5, RoundingMode.HALF_UP);

        resultado = n3.add(n4, contexto); // 44.93 + 100.56489 = 145,49489
        System.out.println(resultado); // 145.49 (5 digitos e arredondamento HALF_UP)
    }
}
