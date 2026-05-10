package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula30MetodoSize {
    public static void main(String[] args) {
        Path arquivo = Paths.get("/var/dados/video.mp4");

        try {
            long tamanho = Files.size(arquivo);

            System.out.println(tamanho);
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
