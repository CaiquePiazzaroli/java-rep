package ClassesDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Aula11ClassePeriod {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate natal = LocalDate.of(2080, 12, 25);

        Period period = Period.between(hoje, natal);
        System.out.println(period); // P54Y7M13D

        System.out.println(period.getYears());  //anos
        System.out.println(period.getMonths()); //meses
        System.out.println(period.getDays()); //dias
    }
}
