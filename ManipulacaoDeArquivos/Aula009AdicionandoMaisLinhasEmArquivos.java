package ManipulacaoDeArquivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Aula009AdicionandoMaisLinhasEmArquivos {
    public static void main(String[] args) {

        try {
            // Define o arquivo a ser escrito
            Path caminho = Path.of("C:\\diretorioTeste\\appendFile.txt");

            // Escreve no arquivo
            // Se não existir, cria
            // Se o arquivo ja existir ele adiciona no fim
            Files.writeString(
                    caminho,
                    "Nova linha de log novo de novo\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
