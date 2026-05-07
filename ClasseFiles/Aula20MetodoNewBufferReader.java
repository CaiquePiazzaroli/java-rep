package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;

public class Aula20MetodoNewBufferReader {
    public static void main(String[] args) {

        Path caminho = Paths.get("C:\\arquivos\\file");
        Path arquivo = caminho.resolve("meuArquivo.txt");

        try {
            try(BufferedReader bf = Files.newBufferedReader(arquivo)) {
                while (bf.readLine() != null) {
                    System.out.println(bf.readLine());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        


    }
}
