package ClassesWrapper;

public class Aula008ParseXXX {
    public static void main(String[] args) {
        

        // Convertendo uma String para primitivo inteiro
        int numero = Integer.parseInt("16"); 
        System.out.println(numero);

        // Convertendo para double
        double numeroDouble = Double.parseDouble("10.45");
        System.out.println(numeroDouble);

        // Exceção
        String stringVazia = new String();
        int numeroErrado = Integer.parseInt(stringVazia); // NumberFormatException


    }
}
