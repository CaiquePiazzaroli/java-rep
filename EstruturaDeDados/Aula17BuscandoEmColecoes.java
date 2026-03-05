package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Aula17BuscandoEmColecoes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Chris Redfield");
        names.add("James Sunderland");
        names.add("Clarie Redfield");
        names.add("Harry Potter");

        Collections.sort(names);

        int index = Collections.binarySearch(names, "James Sunderland");

        if(index > 0) {
            System.out.println("Encontrado " + names.get(index) + " com índice " + index);
        } else {
            System.out.println("Elemento nao encontrado");
        }
    }
}
