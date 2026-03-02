package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;

public class Aula006OrdenandoListas {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Ford");
        cars.add("Hyundai");
        cars.add("Volkswagen");
        cars.add("Fiat");

        System.out.println(cars); // Imprime os elementeos na ordem em que foram inseridos

        Collections.sort(cars); // Organiza os elementos da lista cars por ordem alfabética

        System.out.println(cars); // Imprime os elementos ordenados por ordem alfabética.

        Collections.sort(cars, Collections.reverseOrder()); // Organiza os elementos da lista por ordem alfabética na ordem reversa

        System.out.println(cars); // Imprime os elementos ordenado em ordem alfabetica na ordem reversa
    }
}
