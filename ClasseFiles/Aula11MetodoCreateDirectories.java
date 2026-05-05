package ClasseFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula11MetodoCreateDirectories {
    public static void main(String[] args) {
        Path caminhiDir = Paths.get("C:\\meuDir\\caique\\mendes\\criando\\recursivamente\\esta\\pasta");
        try {
            Path caminhoCriado = Files.createDirectories(caminhiDir);
            System.out.println(caminhoCriado);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
