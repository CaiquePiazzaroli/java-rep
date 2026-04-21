package ClassesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula004MetodosDeAdicaoDeDatas {
    public static void main(String[] args) {
        
        
        LocalDate dataAtual = LocalDate.now();

        // Adicionando dias
        LocalDate proximaSemana = dataAtual.plusDays(7);
        System.out.println(proximaSemana);

        // Adicionando mes
        LocalDate proximoMes = dataAtual.plusMonths(1);
        System.out.println(proximoMes);

        // Adicionando horas 
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime proximaHora = localDateTime.plusHours(1);
        System.out.println(proximaHora);

    }
}
