package ClasseFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Aula014MetodoDelete {
    public static void main(String[] args) {
        Path caminho = Paths.get("C:\\ClasseFiles\\arquivo.txt");

        try {
            Files.delete(caminho);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
