package Sintaxe;

public class Aula16Parte1AprodundandoNaDivisao {
    public static void main(String[] args) {
        double divisaoUm = 3 / 10; // resultado 0.3, mas trunca o decimal por ser divisao de 2 inteiros 3
        System.out.println(divisaoUm); // 0.0

        double divisaoDois = (double) 3 / 10; // O (double) afeta apenas o 3, ficando 3.0 / 10
        System.out.println(divisaoDois); // 0.3 

        double divisaoTres = (double) (3 / 10);
        System.out.println(divisaoTres); // 0.0
    }
}
