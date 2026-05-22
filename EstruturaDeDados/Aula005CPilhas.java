package EstruturaDeDados;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Aula005CPilhas {
    public static void main(String[] args) {
        
        // Criando uma pilha de Strings usando LinkedList (LIFO)
        Deque<String> livros = new LinkedList<>();

        // Empilhando (Push)
        livros.push("Senhor dos aneis");
        System.out.println("Com 1 elemento: " + livros); 

        livros.push("A guerra dos tronos");
        System.out.println("Com 2 elemento: " + livros); 

        livros.push("Duna");
        System.out.println("Com 3 elemento: " + livros); 
        livros.push("Hobbit");

        // Imprimindo a pilha
                                                        //  (Topo)                                 (Fundo)
        System.out.println("Pilha inicial: " + livros); // [Hobbit, Duna, A guerra dos tronos, Senhor dos aneis]

        // Imprimindo o primeiro e o ultimo
        System.out.println("Primeiro: " + livros.getFirst()); // Hobbit
        System.out.println("Ultimo da fila: " + livros.getLast()); // Senhor dos aneis
        
        // Espiando o topo (Peek)
        System.out.println("Topo da pilha: " + livros.peek()); // Saída: Hobbit
        System.out.println("Espiando o ultimo: " + livros.peekLast()); // Senhor dos aneis

        // Desempilhando (Pop)
        System.out.println("Removido: " + livros.pop()); // Desempilha Hobbit
        System.out.println("Novo topo: " + livros.peek()); // Duna
        System.out.println("Pilha Final: " + livros); // [Duna, A guerra dos tronos, Senhor dos aneis]
    }
}
