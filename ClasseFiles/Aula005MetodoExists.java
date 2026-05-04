package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class Aula005MetodoExists {
    public static void main(String[] args) {
        
        //C:\ClasseFiles\arquivo.txt
        Path caminho = Path.of("C:", "ClasseFiles", "arquivoa.txt");
        boolean existe = Files.exists(caminho); 
        System.out.println(existe);
    }
}
