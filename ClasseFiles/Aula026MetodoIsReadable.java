package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula026MetodoIsReadable {

    public static void main(String[] args) {
        Path arquivo = Paths.get("/home/usuario/config.txt");

        if (Files.isReadable(arquivo)) {
            System.out.println("Arquivo disponível para leitura.");
        } else {
            System.out.println("Sem permissão de leitura.");
        }
    }
}