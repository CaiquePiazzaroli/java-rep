package StreamsAPI;

import java.util.List;

public class Aula006Reduce {
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(44, 2, 3, 97);

        int soma = numeros.stream().reduce(0, (total, valor) -> {
            return total + valor;
        });

        int sub = numeros.stream().reduce(200, (total, valor) -> {
            return total - valor;
        });

        System.out.println("Resultado da soma: " + soma); // 146
        System.out.println("A subtração é: " + sub); // 54

    }
}
