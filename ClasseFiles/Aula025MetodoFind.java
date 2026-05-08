package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aula025MetodoFind {
    public static void main(String[] args) {
        Path diretorio = Paths.get("C:\\arquivos");

        try {
            try(Stream<Path> diretorios = Files.find(
                diretorio, 2, 
                (path, atributos) -> atributos.isRegularFile() && path.toString().endsWith(".txt"))
            ) {
                diretorios.forEach(System.out::println);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
