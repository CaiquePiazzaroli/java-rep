import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        
        // Conjuntos

        // 1. Sem ordem 
        Set<String> conjuntoSet = new HashSet<>();
        conjuntoSet.add("caique");
        conjuntoSet.add("joao");
        conjuntoSet.add("maria");
        conjuntoSet.add("amanda");
        conjuntoSet.add("caique"); // Conjuntos nao permitem elementos duplicados

        for(String e: conjuntoSet) {
            System.out.println(e);
        }

        System.out.println("------");

        // 2. Por ordem de inserção 
        Set<String> conjuntoLinked = new LinkedHashSet<>();
        conjuntoLinked.add("caique");
        conjuntoLinked.add("joao");
        conjuntoLinked.add("maria");
        conjuntoLinked.add("amanda");

        for(String e: conjuntoLinked) {
            System.out.println(e);
        }

        System.out.println("------");

        // 3. Por ordem natural (alfabetica)
        Set<String> conjuntoAlfabetico = new TreeSet<>();
        conjuntoAlfabetico.add("caique");
        conjuntoAlfabetico.add("joao");
        conjuntoAlfabetico.add("maria");
        conjuntoAlfabetico.add("amanda");

        for(String e: conjuntoAlfabetico) {
            System.out.println(e);
        }

        System.out.println("------");

        
    }    
  
      
}
