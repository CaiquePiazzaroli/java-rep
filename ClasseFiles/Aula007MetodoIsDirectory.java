package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula007MetodoIsDirectory {
    public static void main(String[] args) {
        Path caminho = Paths.get("C:\\ClasseFiles"); 
        boolean ehDiretorio = Files.isDirectory(caminho);
        System.out.println(ehDiretorio); // true
    }
}
