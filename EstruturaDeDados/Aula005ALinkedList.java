package EstruturaDeDados;
import java.util.List;
import java.util.LinkedList;

public class Aula005ALinkedList {
    public static void main(String[] args) {
        List<String> frutas = new LinkedList<String>();

        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Pera");
        frutas.add("Limão");

        // Acessando o primeiro elemento
        System.out.println(frutas.get(0));

        // Removendo o elemento 1
        frutas.remove(1);
        System.out.println(frutas);

        // Tamanho da lista
        System.out.println(frutas.size());
    }
}
