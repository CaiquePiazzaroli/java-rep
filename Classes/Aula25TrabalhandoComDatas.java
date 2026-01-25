package Classes;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Aula25TrabalhandoComDatas {
    public static void main(String[] args) {
        // Exibindo a data atual
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow); // YYYY-MM-DD

        // Exibindo o tempo atual
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow); // hh:mm:ss.xxx

        // Exibindo data e tempo
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);  // YYYY-MM-DDThh:mm:ss.xxx

        // Formatando uma data e tempo
        // Instanciando um formtador que será passado para DateTime.format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime dateTimeTestFormated = LocalDateTime.now();

        String resultDataFormatted = dateTimeTestFormated.format(dateTimeFormatter);
        System.out.println("Hora e data formatada: " + resultDataFormatted); // yyyy-MM-dd HH:mm:ss

        
    }
}
