package EstruturaDeDados;

import java.util.HashSet;

public class Aula008HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Elemento duplicado, não será inserido no Set
        cars.add("Mazda");

        System.out.println(cars); // Imprime os elementos da lista independente de ordem de inserção ou duplicações

        System.out.println(cars.contains("Ford")); // Verifica se o elemento ford existe na lista

        cars.remove("Volvo"); // Remove o elemento volto da lista

        System.out.println(cars); // Imprime a colecao sem o elemento volvo
        
	    System.out.println(cars.size()); // Retorna o tamanho da coleção

        for(String car : cars) {
            System.out.println(car); // Imprime cada elemento da coleção
        }
    
        cars.clear(); // Remove todos os elementos da lista

        System.out.println(cars); // Imprime a coleção vazia
    }
}
