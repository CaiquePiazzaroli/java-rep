package ClassesDateTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula007ConvertendoDataDiaMesAno {

    public static void main(String[] args) {
        
        String data = "10/12/2023"; // Uma data em formato BR
        
        
        // Erro: DateTimeParseException
        try {
            LocalDate minhaDataErro = LocalDate.parse(data);
        } catch (DateTimeException e) {
            System.out.printf("Formato da data %s é inválido\n", data);
        }
        

        // OK pois usamos o formatador para dizer o formato de origem
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        LocalDate minhaData = LocalDate.parse(data, formatterBR);
        System.out.println(minhaData); // 2023-12-10 (Formato padrao US)




    }
}