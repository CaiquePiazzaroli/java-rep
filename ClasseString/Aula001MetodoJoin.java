package ClasseString;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Aula001MetodoJoin {
    public static void main(String[] args) {

        // Junta ou concatena um ou mais Strings com um delimitador especificado
        // Exemplo 1
        String exemplo1 = String.join(", ", "Banana", "Maça", "Pera");
        System.out.println(exemplo1); // Banana, Maça, Pera

        // Exemplo 2 
        List<String> cestaDeFrutas = Arrays.asList("Maca Nanica", "Pera Grande", "Banana da Terra");
        String exemplo2 = String.join(" - ", cestaDeFrutas);
        System.out.println(exemplo2); // Maca Nanica - Pera Grande - Banana da Terra

        // Exemplo 3
        String delimitador = " | ";
        List<String> listDeCarros = List.of("Ford", "Nissan", "Chevrolet", "Tesla");
        String carros = String.join(delimitador, listDeCarros);
        System.out.println(carros); // "Ford | Nissan | Chevrolet | Tesla"  
    }
}   
