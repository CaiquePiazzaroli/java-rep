package ClassesDateTime;

import java.time.LocalDateTime;

public class Aula003LocalDateTime {
    public static void main(String[] args) {
        

        // A partir do metodo now
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual); // 2026-04-21T11:48:49.231521900

        // A partir de uma data e hora especificada
        LocalDateTime dataHoraEscpecifica = LocalDateTime.of(2026, 04, 21, 11,47);
        System.out.println(dataHoraEscpecifica); // 2026-04-21T11:47

        // A partir de uma String
        LocalDateTime dataHora = LocalDateTime.parse("2024-05-20T14:30");
        System.out.println(dataHora); // 2024-05-20T14:3

    }
}
