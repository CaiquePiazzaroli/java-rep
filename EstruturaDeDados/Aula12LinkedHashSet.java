package EstruturaDeDados;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aula12LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> ages = new LinkedHashSet<Integer>();

        ages.add(10);
        ages.add(99);
        ages.add(46);
        ages.add(1996);

        System.out.println(ages);
    }
}
