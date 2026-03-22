package JavaAvancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Uma classe Carro que possui uma propriedade ano
class Carro {
    private Integer ano;

    Carro(Integer ano) {
        this.ano = ano;
    }

    Integer getAno() {
        return ano;
    }
}

// Uma classe que será usada para comprar dois objetos do tipo Carro
class ClassificadorPorAno implements Comparator {

    // A interface Comparator obriga a implementação de compare
    @Override
    public int compare(Object o1, Object o2) {
        // O método compare deve comparar dois objetos dos quais desejamos comparar
        Carro a = (Carro) o1;
        Carro b = (Carro) o2;

        // Compare deve retornar apenas 0, -1 ou 1 com base nos valores que desejamos comparar desses objetos
        if(a.getAno() < b.getAno()) return -1; // Se o ano do carro b for maior que o do carro a
        if(a.getAno() > b.getAno()) return 1; // Se o ano do carro a for maior que o ano do carro b
        return 0; // Se os carros tiverem o mesmo ano
    }
    
}

public class Aula013Comparator {

    public static void main(String[] args) {

        // Criando um Array de carros para comprar
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(2025));
        carros.add(new Carro(2010));
        carros.add(new Carro(2007));
        carros.add(new Carro(1993));

        carros.forEach(c -> System.out.print(c.getAno() + " ")); // Imprime o ArrayList na ordem de inserção

        // Instanciando um coparador
        Comparator meuComparadorDeCarros = new ClassificadorPorAno();

        // Classificando os elementos (Carros) por ordem crescente com base no ano (Definido na classe ClassificadorPorAno)
        Collections.sort(carros, meuComparadorDeCarros); 

        // Imprimindo elementos...
        System.out.println("\n");
        carros.forEach(c -> System.out.print(c.getAno() + " "));
    }
}