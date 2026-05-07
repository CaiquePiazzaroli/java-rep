package ClasseFiles;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Aula017MetodoWriteString {
    public static void main(String[] args) {
        Path diretorio = Paths.get("C:", "revisaoFiles");

        try {
            // Sobreesceve no arquivo
            Path arquivo = diretorio.resolve("novoArquivo.txt");
            Files.writeString(arquivo, "Ola mmundo!"); // Cria se nao existir e sobresceve se ja existir

            // Adiciona no final do arquivo
            Files.writeString(arquivo, "Novo conteúdo no arquivo!", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
