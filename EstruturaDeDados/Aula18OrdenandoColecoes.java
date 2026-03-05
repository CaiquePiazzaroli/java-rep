package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Aula18OrdenandoColecoes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Chris Redfield");
        names.add("James Sunderland");
        names.add("Clarie Redfield");
        names.add("Harry Potter");

        System.out.println(names);

        Collections.sort(names);
        
        System.out.println(names);
    }
    
}
