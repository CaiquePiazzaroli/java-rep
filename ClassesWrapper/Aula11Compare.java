package ClassesWrapper;

public class Aula11Compare {
    public static void main(String[] args) {
        System.out.println(Integer.compare(20, 40)); // -1 pois x é menor que y
        System.out.println(Integer.compare(40, 30)); // 1 pois x é maior que y
        System.out.println(Integer.compare(40, 40)); // 0 pois x é igual a y
    }
}
