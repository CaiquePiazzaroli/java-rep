package ClasseFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aula024MetodoWalk {
    public static void main(String[] args) {
        

        Path diretorio = Paths.get("C:", "arquivos");

        try {

            // Caso 1: Listando todos os diretórios
            // try(Stream<Path> diretorios = Files.walk(diretorio)) {
            //     // Imprima todos os arquivos e pastas a partir do diretório autal
            //     diretorios.forEach(System.out::println); 
            // }

            // Caso 2: Listando os diretórios até certo nível (2)
            try(Stream<Path> diretorios = Files.walk(diretorio, 2)) {
                // Imprima até o nivel 2 de pastas
                diretorios.forEach(System.out::println); 
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
