package StreamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Aula004Filter {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(44, 2, 3, 97, 49, 64, 7, 24, 33, 15657878);


        //                                               (expressao booleana)
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(numerosPares);
                                                                
        //                                                  (expressao booleana)
        List<Integer> numerosInpares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(numerosInpares);


    }
}
