package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Aula21MetodoNewBufferdWriter {
    public static void main(String[] args) {
        Path caminho = Paths.get("C:\\arquivos\\file");
        Path arquivo = caminho.resolve("meuArquivo.txt");

        try {
            try(BufferedWriter writer = Files.newBufferedWriter(arquivo, StandardOpenOption.APPEND)) {
                for (int i = 0; i< 10; i++) {
                    writer.write("\nEscrevendo com bufferedWriter - " + i);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
