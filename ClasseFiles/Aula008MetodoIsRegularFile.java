package ClasseFiles;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Aula008MetodoIsRegularFile {
    public static void main(String[] args) {
        
        Path caminho = Paths.get("C:\\ClasseFiles\\arquivo.txt "); 

        // Path caminho = Paths.get("C:\\ClasseFiles\\arquivo.txt "); -> java.nio.file.InvalidPathException (espaço no final)
        
        boolean ehArquivo = Files.isRegularFile(caminho);
        System.out.println(ehArquivo); // true

    }
}
