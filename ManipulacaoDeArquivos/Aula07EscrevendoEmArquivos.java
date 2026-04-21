package ManipulacaoDeArquivos;

import java.nio.file.Files;
import java.nio.file.Path;

public class Aula07EscrevendoEmArquivos {
    public static void main(String[] args) {
        
        try {
            // Variavel Path, mostra o caminho do diretório
            Path diretorio = Path.of("C:\\diretorioTeste");

            // Cria o diretório de fato a partir do objeto Path acima
            Files.createDirectories(diretorio);

            // Variavel Path, usada para reprsentar o nome do arquivo.
            // O método resolve cria uma url final
            Path arquivo = diretorio.resolve("teste.txt"); // C:\caiqueArq\teste.txt

            // Cria o arquivo no diretório em questão se não existir
            // Se existir, escreve por cima
            Files.writeString(
                arquivo,
                "Escrevendo um arquivo de texto"
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
