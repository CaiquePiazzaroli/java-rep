import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
            //instância um objeto da classe Random usando o construtor básico
            Random gerador = new Random();

            //imprime sequência de 5 números inteiros aleatórios entre 5 e 10
            for (int i = 0; i <= 10; i++) {
                System.out.println(gerador.nextInt(11 - 5) + 5);
            }

    }
}
