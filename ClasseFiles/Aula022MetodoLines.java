package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;

public class Aula022MetodoLines {

    public static void main(String[] args) {
        
        Path arquivo = Paths.get("c:", "arquivos", "file", "meuArquivo.txt");

        if(Files.exists(arquivo)) {
            try {
                try(Stream<String> linhas = Files.lines(arquivo)) {
                    // Filtra as linhas que contem a palavra Escrevendo
                    // Imprime na tela a Stirng
                    linhas
                        .filter(e -> e.contains("Escrevendo"))
                        .forEach(System.out::println);
                } // Imprima todas as linhas do arquivo sob demanda
            } catch (IOException e) {
                System.out.println(e);
            }
        }



    }
}