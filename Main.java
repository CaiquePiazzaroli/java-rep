import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Chris Redfield");
        names.add("Harry Potter");
        names.add("James Sunderland");
        names.add("Gerald de Rívia");
        names.add("Marika");

        System.out.println("Ordem inicial: " + names);

        // sort - Ordenacao por ordem natural (ou Comparable)
        Collections.sort(names);
        System.out.println("Ordenado alfabeticamente: " + names);
        
        // reverse
        Collections.reverse(names);
        System.out.println("Realizando inversao: " + names);
        
        // shuffle
        Collections.shuffle(names);
        System.out.println("Embaralhando os elementos: " + names);
    
        // addAll
        Collections.addAll(names, "Clarie Redfield", "Leon Scott Kennedy", "Rhaenyra Targaryen"); 
        System.out.println(names);

        // binarySearch
        int index = Collections.binarySearch(names, "Rhaenyra Targaryen");
        if(index > 0) {
            System.out.println("Encontrado " + names.get(index) + " com índice " + index);
        } else {
            System.out.println("Elemento nao encontrado");
        }

        // Swap - Trocando elementos de lugar
        Collections.swap(names, 6, 7);
        System.out.println(names);
        
    }

}
