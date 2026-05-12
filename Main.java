import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        
        Path imagem = Paths.get("C:", "revisao", "pasta1", "arquivo.txt");

        try {
            try (BufferedWriter writer = Files.newBufferedWriter(imagem)) {
                writer.write("Primeira linha do arquivo.");
                writer.newLine();
                writer.write("Segunda linha do arquivo.");
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }    
    }

}
