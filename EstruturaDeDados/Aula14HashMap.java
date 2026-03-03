package EstruturaDeDados;

import java.util.Map;
import java.util.HashMap;

public class Aula14HashMap {
    public static void main(String[] args) {

        Map<String, Integer> cityHabitants = new HashMap<>();


        cityHabitants.put("São Paulo", 46000000);
        cityHabitants.put("Campinas", 1139000);
        cityHabitants.put("São José do Rio Preto", 504166);
        cityHabitants.put("Ouro Preto", 74821);

        // iterando sobre suas chaves
        for(String key : cityHabitants.keySet()) {
            System.out.println(key); // Imprime cada uma das chaves
        }

        // iterando sobre seus valores
        for(Integer value : cityHabitants.values()) {
            System.out.println(value); // Imprime cada um dos valores
        }
    }
}
