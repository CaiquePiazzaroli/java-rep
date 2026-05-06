package ClassesCalendarEDate;

import java.util.Calendar;
import java.util.Date;

public class Aula001DateComCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance(); // Ideal para realizar operações 
        Date data = calendario.getTime(); // Retorna um objeto date
        System.out.println(data);
    }
}
