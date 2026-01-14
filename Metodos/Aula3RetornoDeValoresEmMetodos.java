package Metodos;

public class Aula3RetornoDeValoresEmMetodos {

    static int somaComCinco(int i) {
        return 5 + i;
    }

    static int soma(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println(somaComCinco(10)); // 15
        System.out.println(soma(10, 20)); // 30
        int subtracao = sub(44, 22);
        System.out.println(subtracao); //22
    }
}
