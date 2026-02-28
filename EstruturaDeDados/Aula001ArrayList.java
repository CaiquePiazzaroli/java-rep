package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;

public class Aula001ArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
    
        // Adicionando elementos
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Wolksvagen");
        cars.add("Toyota");

        System.out.println("Inicio: " + cars);

        // Acessando elementos 
        System.out.println("Elemento na 3 posição: " + cars.get(3));

        // Alterando elementos 
        cars.set(0, "Opel");


        // Removendo o primeiro elemento 
        cars.remove(0);

        // Recebendo o tamanho total do array
        System.out.println(cars.size());

        // Ordenando a lista alfabeticamente ou numericalmente
        Collections.sort(cars);
        System.out.println("Array Ordenado: " + cars);
    }
}
