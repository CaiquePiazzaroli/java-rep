package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Aula015MetodoReadAllLines {
    public static void main(String[] args) {
        
        Path caminho = Paths.get("C:\\ClasseFiles\\meuArquivo.txt");

        try {
            List<String> linhas = Files.readAllLines(caminho);
            System.out.println(linhas); // Array de S trings
        } catch (Exception e) {
            System.out.println(e);
        }  
    }
}
