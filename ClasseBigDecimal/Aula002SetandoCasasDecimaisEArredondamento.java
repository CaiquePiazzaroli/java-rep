package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula002SetandoCasasDecimaisEArredondamento {
    public static void main(String[] args) {
        
        // Numero com 3 casas decimais e sempre arredondando para cima
        BigDecimal numero1 = new BigDecimal("0.2556").setScale(3, RoundingMode.UP);
        System.out.println(numero1.toPlainString()); // 0.256

    }
}
