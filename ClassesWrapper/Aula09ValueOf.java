package ClassesWrapper;

public class Aula09ValueOf {
    public static void main(String[] args) {
        
        // De primitivo para complexo
        Integer numeroInteiro = Integer.valueOf("10");

        System.out.println(numeroInteiro instanceof Integer); // True

        Integer numeroInteiro2 = Integer.valueOf(20);

        System.out.println(numeroInteiro2 instanceof Integer); // True


    }
}
