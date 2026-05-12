package ClassesDateTime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Aula010ClasseInstant {
    public static void main(String[] args) {
        
        // Instanciando 
        Instant meuInstante = Instant.EPOCH; // 1970-01-01T00:00:00Z
        System.out.println(meuInstante.plus(6, ChronoUnit.DAYS));
        

        // 
        Instant meuInstante2 = Instant.parse("1996-08-03T15:26:30.45Z");
        System.out.println("Meu instante especifico: " + meuInstante2);
        System.out.println(meuInstante2.getEpochSecond()); // Retorna valor em segundos desde 1970-01-01T00:00:00Z.
        System.out.println(meuInstante2.getNano()); // Retorna o valor de nanosegundos



        //Data base: 1970-01-01T00:00:00Z
        // Adiciona milisegundos a data base
        long milisegundos = 1678713480000l;
        Instant instant = Instant.ofEpochMilli(milisegundos);
        System.out.println(instant);
        

        // Adicionando segundos a data base
        long segundos = milisegundos / 1000;
        instant = Instant.ofEpochSecond(segundos);
        System.out.println(instant);

        // Manipulando instante 
        instant.plus(10, ChronoUnit.DAYS);
        System.out.println(instant); // Instante + 10 dias

    }
}
