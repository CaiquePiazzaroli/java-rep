package ClasseFiles;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class Aula009MetodoCreateFile {
    public static void main(String[] args) {
        Path novo = Paths.get("C:\\ClasseFiles\\meuarquivo.txt");

        try {
            Path criado = Files.createFile(novo);
            System.out.println("Arquivo criado em: " + criado);
        } catch (IOException ex) {
            System.out.println(ex);
        };
        
    }
}
