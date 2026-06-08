package StreamsAPI;

import java.util.List;

public class Aula002ForEach {
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(44, 2, 3, 97, 49, 64);

        numeros.stream().forEach((e) -> {
            if(e < 10) {
                System.out.println(e);
            }
        });


    }
}
