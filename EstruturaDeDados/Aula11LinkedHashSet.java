package EstruturaDeDados;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aula11LinkedHashSet {
    public static void main(String[] args) {
        Set<String> games = new LinkedHashSet<String>();

        games.add("God of War");
        games.add("Ragnarok Online");
        games.add("Elden Ring");
        games.add("Alone in the Dark");
        games.add("Elden Ring"); // Este elemento será ingnorado e não será adicionado
        
        System.out.println(games); // Imprimirá no console os elementos na ordem em que foram adicionados

    }
}
