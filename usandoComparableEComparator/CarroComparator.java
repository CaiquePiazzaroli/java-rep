package usandoComparableEComparator;

import java.util.Comparator;

public class CarroComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.compareTo(o2);
    }
    
}
