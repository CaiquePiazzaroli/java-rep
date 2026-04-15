package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula004MetodosBigDecimal {
    public static void main(String[] args) {
        
        BigDecimal n1 = new BigDecimal("0.5");
        BigDecimal n2 = new BigDecimal("2");
        BigDecimal resultado;

        // Soma 
        resultado = n1.add(n2); 
        System.out.println(resultado); // 0.5

        // Subtração
        resultado = n1.subtract(n2); 
        System.out.println(resultado); // 0.1

        // Subtração
        resultado = n1.multiply(n2); 
        System.out.println(resultado); // 0.06

        // Divisao
        resultado = n1.divide(n2); 
        System.out.println(resultado); // 1.5

        // Com arredondamento
        resultado = n1.divide(n2, RoundingMode.HALF_EVEN);  // 0.5 / 2 = 0.25
        System.out.println(resultado); // 0.2

    }
}
