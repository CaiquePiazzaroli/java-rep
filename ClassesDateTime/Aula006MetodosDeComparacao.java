package ClassesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula006MetodosDeComparacao {
    public static void main(String[] args) {
        
        LocalDateTime dataMarcada = LocalDateTime.parse("2026-04-30T12:30");

        if(dataMarcada.isEqual(LocalDateTime.parse("2026-04-28T12:30"))) {
            System.out.println("Hoje é o dia da prova");
        }

        if(dataMarcada.isBefore(LocalDateTime.parse("2026-04-28T12:30"))) {
            System.out.println("Ainda não chegou o dia da prova");
        }

        if(dataMarcada.isAfter(LocalDateTime.parse("2026-04-28T12:30"))) {
            System.out.println("Ja passou do dia da prova");
        }

    }
}
