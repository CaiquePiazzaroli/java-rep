package DebugandoCodigo;

public class Aula001DebugandoCodigo {
    public static void main(String[] args) {
        double numero1 = 0.1;
        double numero2 = 0.3;

        double soma = soma(numero1, numero2);

        System.out.println(soma);
    }


    public static double soma(double n1, double n2) {
        return n1 + n2;
    }
}
