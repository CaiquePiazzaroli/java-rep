package StreamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Aula003Map {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(44, 2, 3, 97, 49, 64);

        List<Integer> numerosDuplicados = numeros.stream().map((e) -> {
            return e * 2;
        }).collect(Collectors.toList());

        System.out.println(numerosDuplicados);

    }
}
