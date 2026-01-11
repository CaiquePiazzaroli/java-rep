// Impoertando a classe Scanner
import java.util.Scanner;

public class Aula34ClasseScanner {
    public static void main(String[] args) {

        // Instancio o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo uma string
        String msg;

        //Recebendo input do usuário
        System.out.print("Escreva seu nome: ");
        msg = scanner.nextLine();

        //Exibindo o input do usuário na tela
        System.out.println("Seu nome é " + msg);


        // Fechando o scanner
        scanner.close();

    }
}
