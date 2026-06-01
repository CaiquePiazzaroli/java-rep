import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //Data atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual); // 01/06/2026


        // Tempo atual
        LocalTime tempoAtual = LocalTime.now();
        System.out.println(tempoAtual); // 12:41:ss:yy

        // Tempo e data atual
        LocalDateTime horaEDataAtual = LocalDateTime.now();
        System.out.println(horaEDataAtual); // yyyy-MM-ddTHH:mm:ss


        // Formatando uma data e hora
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.CANADA);

        String horaEDataAtualFormatada = horaEDataAtual.format(formatador);
        System.out.println(horaEDataAtualFormatada);

        // Retornando valores
        System.out.println(dataAtual.getMonthValue()); // 06
        System.out.println(dataAtual.getMonth()); // JUNE
        System.out.println(dataAtual.withYear(2030)); // 2030-06-01

        // Intente

        Instant instante = Instant.ofEpochSecond(30L);
        System.out.println(instante);

        // Periodo
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2026, 8, 03);

        Period period = Period.between(hoje, aniversario);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

    }    
  
      
}
