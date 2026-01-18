// Essa classe pertence ao pacote Classes
package Classes;

// Importanto uma classe built in do java
import java.util.Scanner;

// Imporando um pacote todo
import java.time.*;

public class Aula11PacotesBuiltInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Olá meu nome é: " + nome);

        LocalDateTime dataHoraAgora = LocalDateTime.now();
        System.out.println(dataHoraAgora);
    }
}
