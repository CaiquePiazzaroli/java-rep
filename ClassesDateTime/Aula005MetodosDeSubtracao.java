package ClassesDateTime;

import java.time.LocalDate;

public class Aula005MetodosDeSubtracao {
    public static void main(String[] args) {
        
        LocalDate dataAtual = LocalDate.now();

        // Subtraindo dias
        LocalDate anteontem = dataAtual.minusDays(2);
        System.out.println(anteontem);
        
        // Subtraindo semana
        LocalDate semanaPassada = dataAtual.minusWeeks(1);
        System.out.println(semanaPassada);

        // Mes passado 
        LocalDate mesPassado = dataAtual.minusMonths(1);
        System.out.println(mesPassado);
    }
}
