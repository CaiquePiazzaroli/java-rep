package JavaAvancado;

import java.util.ArrayList;
import java.util.List;

public class Aula010ExpressoesLambdas {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<Integer>();
        
        // Adicionando elementos no arraylist
        inteiros.add(10);
        inteiros.add(45);
        inteiros.add(36);
        inteiros.add(666);

        // Utilizando a função lambda
        inteiros.forEach((n) -> System.out.println(n));
        inteiros.forEach((n) -> System.out.println(n/2));
        inteiros.forEach((n) -> System.out.println(n*2));
    }
}
