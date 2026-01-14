package Metodos;

public class Aula4SobrecargaDeMetodos {

    static int soma(int x, int y) {
        return x + y;
    }

    static float soma(float x, float y) {
        return x + y;
    }

    static double soma(double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {

        // Usando o método que retorna um int
        int inteiro = soma(4, 2);
        System.out.println(inteiro); // 6 do tipo inteiro

        // Usando a função que retorna um float
        float flutuante = soma((float) 4.0, (float) 2.0);
        System.out.println(flutuante); // 6.0 do tipo float

        // Usando a função que retorna um double
        double valorDouble = soma((double) 4.0, (double) 2.0);
        System.out.println(valorDouble); // 6.0 do tipo double
    }
}
