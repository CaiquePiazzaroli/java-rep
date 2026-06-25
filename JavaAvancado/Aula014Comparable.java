package JavaAvancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CarroComparable implements Comparable<CarroComparable> {
    private int ano;

    CarroComparable(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public int compareTo(CarroComparable o) {
        // -1 ou 1 ou 0
        // Carros mais novos devem vir na frente 
        CarroComparable outroCarro = (CarroComparable) o;
        if(this.ano > outroCarro.getAno()) return -1; // Esse carro deve vir na frente do outro
        if(this.ano < outroCarro.getAno()) return 1; // o outro deve vir na frente
        return 0; // Tanto faz
    }
}

public class Aula014Comparable {
    public static void main(String[] args) {
        
        List<CarroComparable> carros = new ArrayList<>();
        carros.add(new CarroComparable(1993));
        carros.add(new CarroComparable(2005));
        carros.add(new CarroComparable(2010));
        carros.add(new CarroComparable(2008));
        carros.add(new CarroComparable(2000));

        Collections.sort(carros);

        carros.forEach((c) -> System.out.println(c.getAno())); // Exibe os carros em ordem decrescente
    }
}
