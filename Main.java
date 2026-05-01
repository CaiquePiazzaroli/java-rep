import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // RoundMode.UP = Maior ABSOLUTO
        BigDecimal numero1 = new BigDecimal("-0.2456").setScale(2, RoundingMode.UP);
        System.out.println(numero1); // -0.25

        // 0.100 + 0.045
        BigDecimal numero2 = BigDecimal.valueOf(0.145).setScale(1, RoundingMode.UP); 
        System.out.println(numero2); // 0.2


        // RoundMode.DOWN = Trunca
        BigDecimal numero3 = BigDecimal.valueOf(4.964568).setScale(2, RoundingMode.DOWN);
        System.out.println(numero3); // 4.96

        // RoundMode.CEILING = Infinito positivo
        BigDecimal numero4 = BigDecimal.valueOf(5.95689).setScale(2, RoundingMode.CEILING);
        System.out.println(numero4); // 5.96

        // RoundMode.FLOOR = Infinito negativo
        BigDecimal numero5 = BigDecimal.valueOf(5.95689).setScale(2, RoundingMode.FLOOR);
        System.out.println(numero5); // 5.95

        // RoundMode.HALF_UP = Se 0.5 ou acima, arredonda para cima
        BigDecimal numero6 = BigDecimal.valueOf(5.95500).setScale(2, RoundingMode.HALF_UP);
        System.out.println(numero6); // 5.96

        // RoundMode.HALF_DOWN = Se acima de 0.5, arredonda para cima
        BigDecimal numero7 = BigDecimal.valueOf(5.95500).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(numero7); // 5.95

        // RoundMode.HALF_EVEN = Vizinho par mais proximo caso a sobra seja == 0.5 
        BigDecimal numero8 = BigDecimal.valueOf(5.97500).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(numero8); // 5.98


        // Retirando tipos primitivos
        BigDecimal numero9 = BigDecimal.valueOf(95.94654).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(numero9.intValue()); // Retorna um int

        // CompareTo: comparando
        System.out.println(numero9.compareTo(numero8)); // 1 pois numero 9 é maior que numero 8
        System.out.println(numero8.compareTo(numero9)); // -1 pois numero 8 é menor que numero 9
        System.out.println(numero6.compareTo(numero7)); // 0 pois são iguais

    }
}
