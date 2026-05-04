package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;

public class Aula006MetodoNotExists {
    public static void main(String[] args) {

        Path caminho = Path.of("C:", "ClasseFiles", "inexistente.txt");

        boolean naoExiste = Files.notExists(caminho);
        System.out.println(naoExiste); // true somente se a ausência for confirmada
    }
}
