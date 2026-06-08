package StreamsAPI;

import java.util.List;
import java.util.Optional;

public class Aula007Operations {
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(44, 2, 3, 97);

        // min
        Optional<Integer> menor = numeros.stream().min(Integer::compareTo);
        System.out.println("Menor elemento: " + menor.get());

        // max
        Optional<Integer> maior = numeros.stream().max(Integer::compareTo);
        System.out.println("Maior elemento: " + maior.get());

        // sum
        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos elementos: " + soma);

        // average
        Double media = numeros.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println("Média dos elementos: " + media);

        // count
        long quantidade = numeros.stream().count();
        System.out.println("Quantidade de elementos: " + quantidade);

    }
}
