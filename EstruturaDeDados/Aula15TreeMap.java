package EstruturaDeDados;

import java.util.Map;
import java.util.TreeMap;

public class Aula15TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> cityHabitants = new TreeMap<>();

        cityHabitants.put("São Paulo", 46000000);
        cityHabitants.put("Campinas", 1139000);
        cityHabitants.put("São José do Rio Preto", 504166);
        cityHabitants.put("Ouro Preto", 74821);

        cityHabitants.put("Campinas", 11879000); // Não será incluso pois é elemento duplicado

        System.out.println(cityHabitants);


        // Acessando um intem
        System.out.println(cityHabitants.get("São Paulo"));

        // Removendo um item
        cityHabitants.remove("Ouro Preto");
        System.out.println(cityHabitants);

        // Tamanho da coleção
        System.out.println(cityHabitants.size());
    
    }
}
