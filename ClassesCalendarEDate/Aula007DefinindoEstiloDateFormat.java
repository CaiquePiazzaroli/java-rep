package ClassesCalendarEDate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Aula007DefinindoEstiloDateFormat {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        java.util.Date dataAtual = calendario.getTime();
        DateFormat formatadorData = DateFormat.getDateInstance(3); // 0 1 2 e 3 
        System.out.println(formatadorData.format(dataAtual));

    }
}
