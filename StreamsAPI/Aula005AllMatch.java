package StreamsAPI;

import java.util.List;

public class Aula005AllMatch {
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(44, 2, 3, 97, 49, 64, 7, 24, 33, 15657878);

        boolean todosSaoPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println(todosSaoPositivos);

        boolean todosSaoPares = numeros.stream().allMatch(n -> n % 2 == 0);
        System.out.println(todosSaoPares);



    }
}
