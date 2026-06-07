package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aula001Streams {
    public static void main(String[] args) {
        // Exemplo 1
        List<String> frutas = List.of("Maçã", "Banana", "Morango");

        // Sem Streams
        for (String fruta : frutas) {
            if (fruta.length() > 4) {
                System.out.println(fruta);
            }
        }

        // Com Streams
        frutas.stream()
                .filter(p -> p.length() > 4)
                .forEach(System.out::println);

        // Exemplo 2
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Sem Stream API
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero * 2);
            }
        }

        // Filtrar números pares e depois dobrar cada um
        List<Integer> resultadoStream = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(resultadoStream); // Saída: [4, 8]
    }
}
