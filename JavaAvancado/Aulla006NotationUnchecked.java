package JavaAvancado;

import java.util.ArrayList;

public class Aulla006NotationUnchecked {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);
    }
}
