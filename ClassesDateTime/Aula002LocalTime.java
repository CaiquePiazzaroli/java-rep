package ClassesDateTime;

import java.time.LocalTime;

public class Aula002LocalTime {
    public static void main(String[] args) {
        
        // Criando o LocalTime da hora atual
        LocalTime horaAtual = LocalTime.now();
        System.out.println("A hora atual é: " + horaAtual); // A hora atual é: 11:43:39.477399500

        // Crinado uma LocalTime específica
        LocalTime horaEspecifica = LocalTime.of(12, 30);
        System.out.println("Uma hora específica: " + horaEspecifica); // Uma hora específica: 12:30

        // Criando a partir de uma String
        LocalTime horario = LocalTime.parse("14:30"); 
        System.out.println("Horario a partir de string: " + horario); // Horario a partir de string: 14:30

    }
}
