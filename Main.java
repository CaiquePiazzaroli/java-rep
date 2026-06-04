import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        // Mapas

        // 1. Sem garantia de ordem
        Map<String, String> mapaSemOrdem = new HashMap<>();
        mapaSemOrdem.put("caique", "mendes");
        mapaSemOrdem.put("joao", "pereira");
        mapaSemOrdem.put("maria", "do carmo");

        for(String e: mapaSemOrdem.keySet()) {
            System.out.println(e + " - " + mapaSemOrdem.get(e));
        }

        System.out.println("---------------");

        // 2. Sem garantia de ordem
        Map<String, String> mapaOrdemInsercao = new LinkedHashMap<>();
        mapaOrdemInsercao.put("caique", "mendes");
        mapaOrdemInsercao.put("joao", "pereira");
        mapaOrdemInsercao.put("maria", "do carmo");

        for(String e: mapaOrdemInsercao.keySet()) {
            System.out.println(e + " - " + mapaOrdemInsercao.get(e));
        }

        System.out.println("---------------");

        // 3. Por ordem natural
        Map<String, String> mapaOrdenadoNaturalmente = new TreeMap<>();
        mapaOrdenadoNaturalmente.put("caique", "mendes");
        mapaOrdenadoNaturalmente.put("joao", "pereira");
        mapaOrdenadoNaturalmente.put("maria", "do carmo");

        for(String e: mapaOrdenadoNaturalmente.keySet()) {
            System.out.println(e + " - " + mapaOrdenadoNaturalmente.get(e));
        }
    
    
        
    }    
  
      
}
