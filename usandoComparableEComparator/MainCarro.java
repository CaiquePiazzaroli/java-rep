package usandoComparableEComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro(1975L, "Volks");
        Carro carro2 = new Carro(1960L, "Ford");
        Carro carro3 = new Carro(2018L, "Kwid");

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        System.out.println(carros);

        CarroComparator cc = new CarroComparator();
        Collections.sort(carros, cc);

        System.out.println(carros);

    }
}
