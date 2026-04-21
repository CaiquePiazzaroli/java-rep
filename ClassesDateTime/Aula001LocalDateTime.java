package ClassesDateTime;

import java.time.LocalDate;

public class Aula001LocalDateTime {
    public static void main(String[] args) {
        
        // Instanciando a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje é dia: " + hoje);

        // Instanciando uma data específica
        LocalDate dataDeNascimento = LocalDate.of(1996, 8, 03);
        System.out.println("Minha data de nascimento é: " + dataDeNascimento);

        // Instanciando a partir de uma String
        LocalDate dataString = LocalDate.parse("2004-05-10");
        System.out.println("Uma outra data qualquer " + dataString);

    }
}
