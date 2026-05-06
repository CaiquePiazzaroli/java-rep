package ClassesCalendarEDate;

import java.util.Calendar;

public class Aula002OperadocoesComDatas {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        java.util.Date minhaDataModificada = null;

        // #1 Adicionando um mês na data atual
        calendario.add(Calendar.MONTH,1);
        minhaDataModificada = calendario.getTime(); // Junho
        System.out.println(minhaDataModificada);

        // #2 Adicionando +30 dias corridos
        calendario.add(Calendar.DAY_OF_MONTH,30);
        minhaDataModificada =  calendario.getTime(); // é preciso reatribuir = Julho
        System.out.println(minhaDataModificada);
        
        // #3 (Set) Definindo o valor da hora, minuto segundos e milissegundos para 0
        calendario.set(Calendar.HOUR,24); 
        calendario.set(Calendar.MINUTE,0);
        calendario.set(Calendar.SECOND,0);
        calendario.set(Calendar.MILLISECOND,0);
        minhaDataModificada = calendario.getTime();
        System.out.println(minhaDataModificada); // 12:00:00 pno formato 12h

        // #4 (Set) Definindo o modelo de tempo para o modelo 24 horas de 0 a 24
        calendario.set(Calendar.AM_PM, Calendar.AM); 
        minhaDataModificada = calendario.getTime();
        System.out.println(minhaDataModificada); // 00:00:00 no formato 24h


        //Obtem o ano, dia do mês e semana do mês respectivamente
        System.out.println(calendario.get(Calendar.YEAR));
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));
        
    }
}
