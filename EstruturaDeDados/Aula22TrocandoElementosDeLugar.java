package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;

public class Aula22TrocandoElementosDeLugar {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        Collections.swap(fruits, 0, 2); // Swap first and third element
        System.out.println(fruits);
    }
}
