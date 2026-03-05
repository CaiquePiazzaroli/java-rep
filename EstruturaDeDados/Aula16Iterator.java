package EstruturaDeDados;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Aula16Iterator {
    public static void main(String[] args) {
        
        List<String> cities = new ArrayList<String>();
        
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("San Diego");
        cities.add("Seattle");

        Iterator<String> it = cities.iterator();

        // Imprime todos os elementos da colleção
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Removendo elementos da lista
        Iterator<String> it2 = cities.iterator();
        while (it2.hasNext()) {
            it2.next(); // Avança para o elemento
            it2.remove(); // Remove o elemento
        }

        System.out.println(cities); // Imprime a coleção sem nenhum elemento

    }
}
