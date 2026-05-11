package ClassesDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aula009FormatandoTempo {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual); 

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("hh:mm:ss");
        
        System.out.println(formatador.format(horaAtual));
    }
}
