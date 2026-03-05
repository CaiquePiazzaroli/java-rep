package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula21FrequenciaDeUmElemento {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");
    }
}
