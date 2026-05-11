package ClassesDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Aula008FormatandoDatas {
    public static void main(String[] args) {

        // Exemplo 1: a partir de um padrão string
        LocalDate data = LocalDate.of(2023, 1, 13);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(data)); // 13/01/2023

        // Exemplo 2: a partir da localização padrao do sistema
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); // 13 de janeiro de 2023
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); // 13 de jan. de 2023
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))); // 13/01/2023
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); // sexta-feira, 13 de
                                                                                              // janeiro de 2023

        // Exemplo 3: Alterando a região das datas com Locale
        Locale[] locales = { Locale.CANADA, Locale.US, Locale.of("fi", "FI"), Locale.UK };

        for (Locale locale : locales) {
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }
    }
}
