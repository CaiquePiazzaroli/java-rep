package EstruturaDeDados;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula005BFilas {
    public static void main(String[] args) {

        // Criando uma fila de Strings usando LinkedList
        Queue<String> entrevistados = new LinkedList<>();

        // Adicionando elementos (Enfileirar)
        entrevistados.offer("Joao");
        entrevistados.offer("Maria");
        entrevistados.offer("Thaynara");
        entrevistados.offer("Edvan Pereira");

        System.out.println("Fila inicial: " + entrevistados); // Fila inicial: [Joao, Maria, Thaynara, Edvan Pereira]

        // Espiar o próximo da fila (sem remover)
        System.out.println("Quem é o próximo da fila? " + entrevistados.peek()); // Joao

        // Remover elementos (Desenfileirar)
        String atendido = entrevistados.poll(); // Joao 
        System.out.println(atendido + " foi entrevistado.");

        System.out.println("Fila após o atendimento: " + entrevistados); // [Maria, Thaynara, Edvan Pereira]

        // 4. Percorrer a fila restante
        System.out.println("--- Pessoas restantes na fila ---");
        for (String pessoa : entrevistados) {
            System.out.println(pessoa);
        }
    }
}
