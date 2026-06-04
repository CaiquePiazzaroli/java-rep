import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        
        // Listas
        List<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);

        for(Integer e: lista) {
            System.out.println(e);
        }
        System.out.println("----");

        List<Integer> listaLinkada = new LinkedList<>();
        listaLinkada.add(110);
        listaLinkada.add(120);
        listaLinkada.add(130);
        listaLinkada.add(140);
        listaLinkada.add(150);
        listaLinkada.add(160);

        for(Integer e: listaLinkada) {
            System.out.println(e);
        }
        System.out.println("----");

        // Fila
        Queue<Integer> fila = new LinkedList<>();
        fila.add(210);
        fila.add(220);
        fila.add(230);
        fila.add(240);
        fila.add(250);
        fila.add(260);

        System.out.println(fila.peek()); //210
        System.out.println(fila);
        System.out.println(fila.poll()); //210 and remove 210
        System.out.println(fila);

        // Pilha
        Deque<Integer> pilha = new ArrayDeque<>();
        pilha.add(1001);
        pilha.add(1002);
        pilha.add(1003);
        pilha.add(1004);
        pilha.add(1005);

        System.out.println(pilha.getLast()); // 1005
        System.out.println(pilha);

        System.out.println(pilha.getFirst()); // 1001
        System.out.println(pilha);

        System.out.println(pilha.removeLast()); // 1005 remove it
        System.out.println(pilha);

        
    }    
  
      
}
