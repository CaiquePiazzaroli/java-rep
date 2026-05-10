package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula027MetodoIsWriteable {
    public static void main(String[] args) {
        Path arquivo = Paths.get("/var/dados/config.txt");

        boolean podeEscrever = Files.isWritable(arquivo);

        System.out.println(podeEscrever);
    }
}
