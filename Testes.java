import java.math.BigDecimal;
import java.math.RoundingMode;

public class Testes {
     public static void main(String[] args) {

        BigDecimal valorTotal = new BigDecimal("100.00");
        int quantidadeParcelas = 6;

        BigDecimal valorParcela = calcularValorParcela(valorTotal, quantidadeParcelas); // 16,666666666666666666666666666667

        System.out.println("Valor da parcela: R$ " + valorParcela);
    }

    public static BigDecimal calcularValorParcela(BigDecimal valorTotal,
                                                   int quantidadeParcelas) {

        return valorTotal.divide(
                BigDecimal.valueOf(quantidadeParcelas),
                2,
                RoundingMode.HALF_EVEN
        );
    }
    
}
    