package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Aula12MetodoRound {
    public static void main(String[] args) {
        
        BigDecimal numero = new BigDecimal("25.46597");
        MathContext contexto = new MathContext(4, RoundingMode.HALF_UP);
        System.out.println(numero.toPlainString());

        // Numero arredondado com o round
        BigDecimal novoBigDecimal = numero.round(contexto); // 25.47
        System.out.println(novoBigDecimal.toPlainString());

    }
}
