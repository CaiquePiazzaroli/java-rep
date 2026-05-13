
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        
        // C:\revisao\pasta1
        Path diretorio = Paths.get("C:","revisao", "pasta1");
        if (!Files.exists(diretorio)) {
            try {
                Files.createDirectories(diretorio);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Path arquivo = diretorio.resolve("EscrevendoComInputStream.txt");
            try(Stream<String> linhas = Files.lines(arquivo)) {
                linhas.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
