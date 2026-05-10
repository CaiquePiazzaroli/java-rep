package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Aula009MetodoGetLastModifiedTime {
    public static void main(String[] args) {

        Path link = Paths.get("/var/dados/atalho.txt");

        try {
            FileTime ultimaModificacao = Files.getLastModifiedTime(
                link,
                LinkOption.NOFOLLOW_LINKS
            );
            System.out.println(ultimaModificacao);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
