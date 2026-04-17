package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Aula010MetodoMutiply {
    public static void main(String[] args) {
        
        BigDecimal resultado = BigDecimal.ZERO;

        // Exemplo 1: Multiplicando dois valores 
        BigDecimal numero1 = new BigDecimal("12.500");
        BigDecimal numero2 = new BigDecimal("5.500"); 
        resultado = numero1.multiply(numero2); // xx.xxxxxx (Soma das escanas de numero1 e numero2)
        System.out.println(resultado);

        // Exemplo 2: Multiplicando dois valores mas controlando as casas decimais
        BigDecimal numero3 = new BigDecimal("125.99845");
        BigDecimal numero4 = new BigDecimal("9.45689"); 
        MathContext contexto = new MathContext(6, RoundingMode.CEILING);

        resultado = numero3.multiply(numero4); // xxxx.xxxxxxxxxx = 1191.5534818205
        System.out.println(resultado);

        resultado = numero3.multiply(numero4, contexto); // xxxx.xx = 1191.56
        System.out.println(resultado);
    }
}
