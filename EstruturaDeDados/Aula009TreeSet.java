package EstruturaDeDados;

import java.util.TreeSet;
import java.util.Set;

public class Aula009TreeSet {
    public static void main(String[] args) {
        Set<String> cars = new TreeSet<String>();

        cars.add("Fiat");
        cars.add("Hyundai");
        cars.add("Volkswagen");
        cars.add("Chevrolet");
        cars.add("Hyundai"); // Não será incluso pois é repetido

        System.out.println(cars.size());

        System.out.println(cars); // Imprime em ordem alfabetica
    
    }
}
