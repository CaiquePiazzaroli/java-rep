package StreamsAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Aula008Collect {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(44, 2, 3, 97, 49, 64, 64);

        Set<Integer> numerosDuplicadosSet = numeros.stream().map((e) -> {
            return e * 2;
        }).collect(Collectors.toSet()); // converte para set

        List<Integer> numerosDuplicadosLista = numeros.stream().map((e) -> {
            return e;
        }).collect(Collectors.toList());

        System.out.println(numerosDuplicadosSet);
        System.out.println(numerosDuplicadosLista);
    }
}
