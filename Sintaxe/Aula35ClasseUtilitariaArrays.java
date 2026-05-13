package Sintaxe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Aula35ClasseUtilitariaArrays {
    public static void main(String[] args) {
        
        // Um array commum
        Integer[] numeros = new Integer[]{2, 10, 56, 95, 139, 1};
        System.out.print("Array Original: ");
        imprimirArray(numeros);

        // asList: converte um array comum em um array collections
        List<Integer> lista = Arrays.asList(numeros);
        System.out.println("Array collections: " + lista); // [2, 10, 56, 95, 139, 1]

        // sort: Ordena os elementos do menor para o maior (Mutável)
        Arrays.sort(numeros);
        System.out.print("Array Ordenado: ");
        imprimirArray(numeros);

        // Stream: converte array em uma Stream
        Stream<Integer> meuArrayStream = Arrays.stream(numeros);
        meuArrayStream.filter(e -> e.intValue() > 10).forEach(e -> System.out.print(e + " "));

    }   

    static <T> void imprimirArray(T[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.print("]\n");
    }
}
