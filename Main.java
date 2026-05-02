

public class Main {
    public static void main(String[] args) {
        // Maior entre dois numeros
        int maior = Math.max(40, 30);
        System.out.println(maior); // 40
        
        int menor = Math.min(55, 97);
        System.out.println(menor); // 55

        double raiz = Math.sqrt(9);
        System.out.println(raiz); // 3.0

        int absoluto = Math.abs(-3);
        System.out.println(absoluto); // 3

        int pow = Math.powExact(2, 3);
        System.out.println(pow); // 8

        double arrCima = Math.ceil(5.5);
        System.out.println(arrCima); // 6.0

        double arrBaixo = Math.floor(4.3);
        System.out.println(arrBaixo); // 4.0

        double aleatorio = Math.random();
        System.out.println(aleatorio); // Um numero entre 0.0 e 1.0

    }
}
