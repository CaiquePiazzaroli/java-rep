package ManipulacaoDeArquivos;

import java.nio.file.Files;
import java.nio.file.Path;

public class Aula010LendoArquivos {
    public static void main(String[] args) {
        
        // Localiza o arquivo no diretório
        Path arquivo = Path.of("C:\\diretorioTeste\\appendFile.txt");

        try {
            // Le o arquivo rastreado
            String conteudo = Files.readString(arquivo);

            // Imrpimindo..
            System.out.println(conteudo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
