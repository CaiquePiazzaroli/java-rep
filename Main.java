import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path arquivo = Paths.get("C:","revisao", "pasta1", "EscrevendoComInputStream.txt");


        System.out.println(Files.isReadable(arquivo)); // true
        System.out.println(Files.isWritable(arquivo)); // true
        System.out.println(Files.isExecutable(arquivo)); // true

        try {
            System.out.println(Files.getLastModifiedTime(arquivo)); // 2026-05-12T17:50:00.9607495Z
            System.out.println(Files.size(arquivo)); // Retorna o tamanho do arquivo em bytes
        } catch (Exception e) {

        }

        
        

    }
}
