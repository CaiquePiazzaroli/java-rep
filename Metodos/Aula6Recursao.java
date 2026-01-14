package Metodos;

public class Aula6Recursao {
    static int sum(int k) {
        if(k>0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    static int somaDois(int start, int end) {
        if(end > start) {
            return start + somaDois(start, end-1);
        } else {
            return end;
        }
    }

    static int fatorial(int valor) {
        if(valor > 0) {
            return valor * fatorial(valor - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int resultado = sum(10);
        System.out.println(resultado);

        int resultado2 = somaDois(10, 20);
        System.out.println(resultado2);

        int fatorial = fatorial(4);
        System.out.println(fatorial); // 24 pois 4 * 3 * 2 * 1 = 24
    }
}
