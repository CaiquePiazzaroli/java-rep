package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Files;

public class Aula002CriandoUmArquivo {
    public static void main(String[] args) {
        try {
            Path diretorio = Path.of("C:", "aulaDoisTeste");

            // Criando o diretório antes de criar o arquivo
            Files.createDirectory(diretorio);

            Path arquivo = Path.of("C:", "aulaDoisTeste", "arquivoCriadoTeste.txt");

            // Criando o arquivo 
            Files.createFile(arquivo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
