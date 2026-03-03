package EstruturaDeDados;

import java.util.Set;
import java.util.TreeSet;

public class Aula010TreeSet {
    public static void main(String[] args) {
        Set<Integer> cars = new TreeSet<Integer>();

        cars.add(1996);
        cars.add(2000);
        cars.add(1990);
        cars.add(2010);
        cars.add(2026);

        System.out.println(cars.size()); // Imprime o tamanho do vetor

        System.out.println(cars); // Imprime em ordem crecente
    
    }
}
