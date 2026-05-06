package ClassesCalendarEDate;

import java.util.Calendar;

public class Aula003MetodoRoll {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.roll(Calendar.MONTH, 12); // Mantém o ano de 2026 mesmo adicionando 12 meses
        System.out.println(calendario.getTime()); 
    }
}
