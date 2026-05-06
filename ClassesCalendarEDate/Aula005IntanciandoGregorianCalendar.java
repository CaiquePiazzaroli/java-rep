package ClassesCalendarEDate;

import java.util.GregorianCalendar;

public class Aula005IntanciandoGregorianCalendar {
    public static void main(String[] args) {

        // #1 Data atual
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        java.util.Date minhaData = gregorianCalendar.getTime();
        System.out.println(minhaData); // Imprime a data do dia atual

        // #2 Data específica 
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(1996, 7, 3);
        java.util.Date dataEspecifica = gregorianCalendar2.getTime();
        System.out.println(dataEspecifica);

        // #3 Data específica com horas, minutos e segundos
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar(1996, 7, 3, 2, 34, 12);
        java.util.Date dataEspecifica1 = gregorianCalendar3.getTime();
        System.out.println(dataEspecifica1);
    }
}
