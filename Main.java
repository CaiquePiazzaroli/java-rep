
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        
        // C:\revisao\pasta1
        Path diretorio = Paths.get("C:","revisao");
        if (!Files.exists(diretorio)) {
            try {
                Files.createDirectories(diretorio);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            try(Stream<Path> caminhos = Files.list(diretorio)) {
                caminhos.forEach(System.out::println); // pasta1 e pasta2
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
