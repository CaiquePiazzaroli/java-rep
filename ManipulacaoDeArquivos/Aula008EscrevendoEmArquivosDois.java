package ManipulacaoDeArquivos;

import java.nio.file.Path;
import java.util.List;
import java.nio.file.Files;

public class Aula008EscrevendoEmArquivosDois {
    public static void main(String[] args) {
        
        try {
            Path arquivo = Path.of("C:\\diretorioTeste\\outroArquivo.txt");
            //Files.writeString(arquivo, "Olá este arquivo foi escrito diretamente");

            List<String> nomes = List.of("Renato", "Gabriela", "Adão");

            Files.write(arquivo, nomes);

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
