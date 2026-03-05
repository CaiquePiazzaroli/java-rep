package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;

public class Aula20EmbaralhandoColecoes {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
    cards.add("Ace");
    cards.add("King");
    cards.add("Queen");
    cards.add("Jack");  

    System.out.println(cards);
    Collections.shuffle(cards);
    System.out.println(cards);
    }
}
