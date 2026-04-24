package ClassesWrapper;

public class Aula13ToString {
    public static void main(String[] args) {
        
        // ToString estático
        String numeroString = Integer.toString(40);
        System.out.println(numeroString);

        // ToString de instancia herdada de Object
        Integer numeroInteger = Integer.valueOf(102);
        String numeroAPartirDeInteger = numeroInteger.toString();
        System.out.println(numeroAPartirDeInteger);

    }
}
