package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;

public class Aula007OrdenandoListas {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<Integer>();

        ages.add(20);
        ages.add(43);
        ages.add(29);
        ages.add(19);

        System.out.println(ages); // Imprime os elementeos na ordem em que foram inseridos

        Collections.sort(ages); // Ordena os elementos do array por ordem crescente

        System.out.println(ages); // Imprime os elementos ordenados por ordem crescente.

        Collections.sort(ages, Collections.reverseOrder()); // Organiza os elementos da lista por ordem crescente reversa

        System.out.println(ages); // Imprime os elementos ordenado em ordem crescente reversa
    } 
}
