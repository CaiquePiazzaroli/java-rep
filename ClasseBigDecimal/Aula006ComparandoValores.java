package ClasseBigDecimal;

import java.math.BigDecimal;

public class Aula006ComparandoValores {
    public static void main(String[] args) {
        BigDecimal valor1 = new BigDecimal("10");
        BigDecimal valor2 = new BigDecimal("20");
        BigDecimal valor3 = new BigDecimal("20");


        System.out.println(valor1.compareTo(valor2)); // -1 pois o valor inicial é menor que o valor coparado
        System.out.println(valor2.compareTo(valor1)); // 1 pois o valor inicial é maior que o comparado
        System.out.println(valor2.compareTo(valor3)); // 0 pois os valores são iguais

        // Exemplo 1:
        if(valor1.compareTo(valor2) > 0) {
            System.out.println("O valor1 é maior que o valor 2");
        }

        // Exemplo 2:
        if(valor1.compareTo(valor2) < 0) {
            System.out.println("O valor1 é menor que o valor 2");
        }

        // Exemplo 3:
        if(valor1.compareTo(valor2) == 0) {
            System.out.println("O valor1 é igual ao valor 2");
        }

        // Exemplo 4:
        if(valor1.compareTo(valor2) != 0) {
            System.out.println("O valor1 é diferente do valor 2");
        }
    }
}
