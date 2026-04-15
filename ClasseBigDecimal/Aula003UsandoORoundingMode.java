package ClasseBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula003UsandoORoundingMode {
    public static void main(String[] args) {
        
        // UP: Afasta o valor do numero 0
        BigDecimal valor1 = new BigDecimal("2.5687").setScale(0, RoundingMode.UP);
        System.out.println(valor1); // 3

        BigDecimal valor2 = new BigDecimal("-2.5687").setScale(0, RoundingMode.UP);
        System.out.println(valor2); // -3

        // DOWN: Aproxima do zero, trunca o numero e ignora as casas decimais extras
        BigDecimal valor3 = new BigDecimal("2.5687").setScale(2, RoundingMode.DOWN);
        System.out.println(valor3); // 2.56

        BigDecimal valor4 = new BigDecimal("-2.5687").setScale(2, RoundingMode.DOWN);
        System.out.println(valor4); // -2.56

        // CEILING: Arrendoda para o maior número (em direção ao infinito positivo)
        BigDecimal valor5 = new BigDecimal("2.5687").setScale(2, RoundingMode.CEILING);
        System.out.println(valor5); // 2.7

        BigDecimal valor6 = new BigDecimal("-2.5687").setScale(2, RoundingMode.CEILING);
        System.out.println(valor6); // -2.56

        // FLOOR: Arrendoda para o menor número (em direção ao infinito negativo)
        BigDecimal valor7 = new BigDecimal("2.5687").setScale(2, RoundingMode.FLOOR);
        System.out.println(valor7); // 2.56
       
        BigDecimal valor8 = new BigDecimal("-2.5687").setScale(2, RoundingMode.FLOOR);
        System.out.println(valor8); // -2.57

        // HALF_UP: Arrendonda para cima se o decimal em questao for maior ou igual a 0.5
        BigDecimal valor9 = new BigDecimal("2.5687").setScale(2, RoundingMode.HALF_UP);
        System.out.println(valor9); // 2.57
        
        BigDecimal valor10 = new BigDecimal("-2.5687").setScale(2, RoundingMode.HALF_UP);
        System.out.println(valor10); // -2.57

        // HALF_DOWN: Arrendonda para baixo se o decimal em questao for maior do que 0.5
        BigDecimal valor11 = new BigDecimal("2.5649").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(valor11); // 2.56
        
        BigDecimal valor12 = new BigDecimal("-2.5649").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(valor12); // -2.56
  
        // HALF_EVEN: Se a sobra for 0.5, arredonda para o vizinho que for número par.
        BigDecimal valor13 = new BigDecimal("2.55").setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(valor13); // 2.55 = 2.50 + 0.05 -> Como 0.05 esta na metade, arrendoda para o proxmimo par = 2.6
        
        BigDecimal valor14 = new BigDecimal("2.56").setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(valor14); // 2.6 Arredonda para cima 2.50 + 0.6 (maior que 0.5)

         BigDecimal valor15 = new BigDecimal("2.54").setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(valor15); // 2.5 Arredonda para baixo 2.50 + 0.4 (menor que 0.5)

        // UNNECESSARY: Gera erro se o numero precisar ser arrendondado
        BigDecimal valor16 = new BigDecimal("2.50").setScale(1, RoundingMode.UNNECESSARY);
        System.out.println(valor16); // OK, pois o numero é exato

        BigDecimal valor17 = new BigDecimal("2.55").setScale(1, RoundingMode.UNNECESSARY);
        System.out.println(valor17); // ERRO pois o numero não é exato

    }
}
