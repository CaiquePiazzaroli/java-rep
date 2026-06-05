import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        
        // ArrayList => Array Que expande seu tamanho -> Melhor para leitura
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10); // Adicionar um elemento
        numeros.get(1); // Recuperar um elemento
        numeros.set(2,99); // Substituir um elemento
        numeros.remove(0); // Remover um elemento
        numeros.size(); // Retorna o tamanho do array


        // LinkedList => Containers que possuem um valor e apontam para o proximo elemento -> Melhor para inserção e remoçao
        List<Integer> numerosLinkados = new LinkedList<>();
        numerosLinkados.add(10); // Adicionar um elemento
        numerosLinkados.get(1); // Recuperar um elemento
        numerosLinkados.set(2,99); // Substituir um elemento
        numerosLinkados.remove(0); // Remover um elemento
        numerosLinkados.size(); // Retorna o tamanho do array


    }
  
      
}
