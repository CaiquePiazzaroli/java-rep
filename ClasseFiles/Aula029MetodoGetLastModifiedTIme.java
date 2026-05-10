package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Aula029MetodoGetLastModifiedTIme {
    public static void main(String[] args) {
        Path arquivo = Paths.get("/var/dados/relatorio.txt");
        try {
            FileTime ultimaModificacao = Files.getLastModifiedTime(arquivo);
            System.out.println(ultimaModificacao);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
