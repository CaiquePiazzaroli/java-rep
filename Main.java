import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        final int MAX = 200000;

        //Teste de velocidade ArrayList
        
        
        List<Integer> listaArrayList = new ArrayList<Integer>();
        
        //ArrayList é mais lento para inserção e remoção: 4s
        for (int i = 0; i < MAX; i++) {
            listaArrayList.add(i);
        }
        
        // ArrayList é mais rapido para acessar elementos: 1s
        long tInicioArrayList = System.currentTimeMillis();
        for (int i = 0; i < listaArrayList.size(); i++) {
            listaArrayList.get(i);
        }
        long tFimArrayList = System.currentTimeMillis();
        
        System.out.println("Tempo total: " + (tFimArrayList - tInicioArrayList)); // Resultado 74


        // Teste de velocidade ArrayList
        List<Integer> listaLinkedList = new LinkedList<Integer>();
        
        // LinkedList é mais rapido para inserção e remoção tempo: 3s
        for (int i = 0; i < MAX; i++) {
            listaLinkedList.add(i);
        }
        
        long tInicioLinkedList = System.currentTimeMillis();
        for (int i = 0; i < listaLinkedList.size(); i++) {
            listaLinkedList.get(i);
        }
        long tFimLinkedList = System.currentTimeMillis();
        
        System.out.println("Tempo total: " + (tFimLinkedList - tInicioLinkedList)); // Resultado 280

    }
}
