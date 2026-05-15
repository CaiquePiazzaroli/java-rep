package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula001ArrayList {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<String>();
    
        // Adicionando elementos
        cars.add("Volvo");
        cars.add("Wolksvagen");
        cars.add("Toyota");
        cars.add("BMW");

        System.out.println("Inicio: " + cars); // [Volvo, Wolksvagen, Toyota, BMW]

        // Acessando elementos 
        System.out.println("Elemento na 3 posição: " + cars.get(3)); // BMW

        // Alterando elementos 
        cars.set(0, "Opel");
        System.out.println(cars); // [Opel, Wolksvagen, Toyota, BMW]

        // Removendo o primeiro elemento 
        cars.remove(0);
        System.out.println(cars); // [Wolksvagen, Toyota, BMW]

        // Removendo por objeto
        cars.remove("Toyota");
        System.out.println(cars); // [Wolksvagen, BMW]

        // Recebendo o tamanho total do array
        System.out.println(cars.size()); // [Wolksvagen, BMW] => 2
 
        // Verificando se está vazio
        System.out.println("Vazio? " + cars.isEmpty()); // [BMW, Toyota].size != 0

        // Ordenando a lista alfabeticamente ou numericalmente (natural)
        Collections.sort(cars);
        System.out.println("Array Ordenado: " + cars); // [BMW, Wolksvagen]


        // Embaralhando a lista
        Collections.shuffle(cars);
        System.out.println("Array embaralhado: " + cars); // [BMW, Wolksvagen]
    }
}
