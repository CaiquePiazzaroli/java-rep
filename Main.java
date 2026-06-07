import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Fila
        Queue<Integer> fila = new LinkedList<>();
        fila.offer(Integer.valueOf(10));
        fila.offer(Integer.valueOf(30));
        System.out.println(fila.peek()); // Observa o primeiro
        System.out.println(fila.poll()); // Observa e remove
        System.out.println(fila);

        Queue<Integer> filaPrioritaria = new PriorityQueue<>(); // Prioridade definida pelo compareTo do comparable
        filaPrioritaria.offer(40);
        filaPrioritaria.offer(30);
        filaPrioritaria.offer(754);
        System.out.println(filaPrioritaria);

        // Pilha
        // Criando uma pilha de Strings usando LinkedList (LIFO)
        Deque<String> livros = new LinkedList<>();

        // Empilhando (Push)
        livros.push("Senhor dos aneis");
        livros.push("A guerra dos tronos");
        livros.push("Duna");
        livros.push("Hobbit");
        //                                                   (Topo)                               (Fundo)
        System.out.println("Pilha inicial: " + livros); // [Hobbit, Duna, A guerra dos tronos, Senhor dos aneis]

        // Espiando o topo (Peek)
        System.out.println("Topo da pilha: " + livros.peek()); // Saída: Hobbit

        // Desempilhando (Pop)
        System.out.println("Removido: " + livros.pop()); // Desempilha Hobbit
        System.out.println("Novo topo: " + livros.peek()); // Duna

        System.out.println("Pilha Final: " + livros); // [Duna, A guerra dos tronos, Senhor dos aneis]
    }

}
