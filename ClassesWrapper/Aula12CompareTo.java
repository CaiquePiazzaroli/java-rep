package ClassesWrapper;

public class Aula12CompareTo {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(20);

        System.out.println(a.compareTo(b)); // -1 — a menor que b
        System.out.println(b.compareTo(a)); //  1 — b maior que a
        System.out.println(a.compareTo(a)); //  0 — iguais
    }
}
