package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Aula009MetodoSubtract {
    public static void main(String[] args) {
        
        BigDecimal resultado = BigDecimal.ZERO;
        
        // Exemplo 1: subtraindo dois numeros
        BigDecimal n1 = new BigDecimal("96.78");
        BigDecimal n2 = new BigDecimal("40.56979");

        resultado = n1.subtract(n2); // 56,21021
        System.out.println(resultado);

        // Exemplo 2: subtraindo dois numeros mas controlando as casas decimais
        BigDecimal n3 = new BigDecimal("77.002");
        BigDecimal n5 = new BigDecimal("33.4569879");
        MathContext contexto = new MathContext(4, RoundingMode.HALF_UP);

        resultado = n3.subtract(n5, contexto); // 77.002 - 33.4569879 = 43.5450121
        System.out.println(resultado); // 43.55

    }
}
