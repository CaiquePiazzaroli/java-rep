
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {

        // C:\revisao\pasta1
        Path diretorio = Paths.get("C:", "revisao", "pasta1");
        if (!Files.exists(diretorio)) {
            try {
                Files.createDirectories(diretorio);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            try (Stream<Path> caminhos = Files.find(diretorio, 1, (path, atributos) -> path.toString().endsWith("txt"))) {
                caminhos.forEach(System.out::println); // printar todos os arquivos e diretório de pastas e subpastas
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
