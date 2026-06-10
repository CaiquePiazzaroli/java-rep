import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class AlunoClasse implements Comparable<AlunoClasse>{

    private String nome;
    private Double nota;

    public AlunoClasse(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    

    public String getNome() {
        return nome;
    }



    public Double getNota() {
        return nota;
    }



    @Override
    public int compareTo(AlunoClasse o) {
        if(this.getNota() > o.getNota()) {
            return 1;
        } else if (this.getNota() < o.getNota()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {  
        return this.nome.hashCode();
    }
    
    @Override
    public String toString() {
        return this.nome.toString();
    }
}




public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Chris Redfield");
        names.add("Harry Potter");
        names.add("James Sunderland");
        names.add("Clarie Redfield");
        names.add("Harry Potter");
        names.add("James Sunderland");
        names.add("Harry Potter");
        names.add("James Sunderland");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        Collections.swap(names, 0, 7); // Troca elementos
        Collections.sort(names); // Ordena por ordem natural ou pela implementação do compareTo
        Collections.binarySearch(names, "James Sunderland"); // faz uma busca do elemento por busca binaria
        Collections.shuffle(names); // Bagunça a lista
        Collections.frequency(names, "Harry Potter"); // Retorna quantas vezes um determinado elemento aparece

        // Iteracoes
        for(String c: names) {
            System.out.println(c);
        }

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        
       
    }

}
