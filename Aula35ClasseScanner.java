import java.util.Scanner;

public class Aula35ClasseScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome, idade e salário: ");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        double salario = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + ".");
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("E Você ganha " + salario + " R$.");

        scanner.close();

    }
}
