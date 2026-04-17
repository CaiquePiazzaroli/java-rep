package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula11MetodoDivide {
    public static void main(String[] args) {

        BigDecimal resultado = BigDecimal.ZERO;

        // Exemplo 1: divisão exata ou finita
        BigDecimal a = BigDecimal.valueOf(7);
        BigDecimal b = BigDecimal.valueOf(2);

        resultado = a.divide(b);
        System.out.println(resultado); // 3.5

        // Exemplo 2: Exceção por divisão de numeros que geram uma dízima periódica
        a = BigDecimal.valueOf(10.0);
        b = BigDecimal.valueOf(3.0);

        // resultado = a.divide(b); // Lança uma exceção
        // System.out.println(resultado); 

        // Exemplo 3: Divisão com gerenciamendo de resultados infinitos
        resultado = a.divide(b, RoundingMode.CEILING); // 10.0 / 3.0 = 3.4 
        System.out.println(resultado); // 3.4

        // Exemplo 4 Divisão com maior nivel de segurança: escala e arredondamento
        BigDecimal n1 = BigDecimal.valueOf(10.00);
        BigDecimal n2 = BigDecimal.valueOf(3.00);

        resultado = n1.divide(n2, 2, RoundingMode.HALF_UP);
        System.out.println(resultado); // 3.33
    }
}
