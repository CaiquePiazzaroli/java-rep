package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Aula003EscrevendoNoArquivo {
    public static void main(String[] args) {
        try {
            List<String> nomes = List.of("Caique", "Joao", "Marcela");
            Path arquivo = Path.of("C:", "aulaDoisTeste", "arquivoCriadoTeste.txt");

            // Escreve no arquivo o array de Strings
            // Se o aquivo nao existir, cria, se ja existir, coloca no final do arquivo
            Files.write(arquivo, nomes, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
