package ClassesWrapper;

public class Aula003MetodosDeExtracao {
    public static void main(String[] args) {
        
        Double numero = Double.valueOf("456.4569");

        int numeroInteiro = numero.intValue(); // Retorna um inteiro 
        System.out.println(numeroInteiro); // 456

        float numeroFloat = numero.floatValue(); // Retorna um float 
        System.out.println(numeroFloat); // 456.4569

    }
}
