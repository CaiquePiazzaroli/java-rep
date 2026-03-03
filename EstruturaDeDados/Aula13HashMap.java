package EstruturaDeDados;

import java.util.HashMap;
import java.util.Map;

public class Aula13HashMap {
    public static void main(String[] args) {
        Map<String, Integer> cityHabitants = new HashMap<>();

        cityHabitants.put("São Paulo", 46000000);
        cityHabitants.put("Campinas", 1139000);
        cityHabitants.put("São José do Rio Preto", 504166);
        cityHabitants.put("Ouro Preto", 74821);

        System.out.println(cityHabitants); // Imprime todos os items entre chaves {} no formato chave-valor

        // Acessando um item
        System.out.println(cityHabitants.get("São Paulo")); // Retorna o valor dos habitantes
        System.out.println(cityHabitants.get("são paulo")); // Retorna null pois não encontrou são paulo em minusculo

        // Removendo um item
        cityHabitants.remove("Ouro Preto");
        System.out.println(cityHabitants); // Imprime na tela todos os itens mas sem o item Ouro Preto

        // Descobrindo o tamanho do HashMap
        System.out.println(cityHabitants.size()); 

        // Removendo todos os itens
        cityHabitants.clear();

        // Imprimindo o HashMap Vazio
        System.out.println(cityHabitants);

    }
}
