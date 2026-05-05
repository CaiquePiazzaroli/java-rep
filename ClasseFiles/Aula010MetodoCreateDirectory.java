package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Aula010MetodoCreateDirectory {
    public static void main(String[] args) {
        Path caminhiDir = Paths.get("C:\\meuDir");
        try {
            Path caminhoCriado = Files.createDirectory(caminhiDir);
            System.out.println(caminhoCriado);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
