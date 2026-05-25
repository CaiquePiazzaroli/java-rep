package ClasseScanner;

import java.util.Scanner;


public class Aula001Scanner {
    public static void main(String[] args) {

        String nome;
        double altura;
        int idade;

        Scanner sc = new Scanner(System.in);

        altura = sc.nextDouble(); // Recebe numero + \n
        
        idade = sc.nextInt(); // Recebe numero + \n

        sc.nextLine(); // Limpa o \n 

        nome = sc.nextLine(); 

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Altura: %.2f", altura);
    }
}
