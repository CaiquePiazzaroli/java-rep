

public class Main {
    public static void main(String[] args) {
        

        //Value of
        Integer numero1 = Integer.valueOf(20); // primitivo
        System.out.println(numero1); //OK

        Integer numero2 = Integer.valueOf("45"); // string
        System.out.println(numero2); //OK

        // Integer numero3 = Integer.valueOf(" 45 "); // Exeption: java.lang.NumberFormatException
        // System.out.println(numero3); // NOTOK

        Integer numero4 = Integer.valueOf("45a"); // Exeption: java.lang.NumberFormatException
        System.out.println(numero4); // NOTOK

    }
}
