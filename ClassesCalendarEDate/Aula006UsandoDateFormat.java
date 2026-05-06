package ClassesCalendarEDate;

import java.text.DateFormat;
import java.util.Calendar;

public class Aula006UsandoDateFormat {
    public static void main(String[] args) {
        // iniciando um formatador de datas
        DateFormat formatador = DateFormat.getDateInstance();
        
        //criando um objeto calendar
        Calendar calendario = Calendar.getInstance();
        
        //Obtendo o objeto date para ser formatado
        java.util.Date data = calendario.getTime();
        System.out.println("Formato original da data é: " + data);
        
        //Usando um formatador para exibir a data formatada
        String dataFormatada = formatador.format(data);
        System.out.println("A data formatada é: " + dataFormatada);
    }
}
