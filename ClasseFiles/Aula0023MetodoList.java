package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aula0023MetodoList {
    public static void main(String[] args) {
        
        Path diretorio = Paths.get("c:", "arquivos");

        if(Files.exists(diretorio)){
            try {
                try(Stream<Path> diretorios = Files.list(diretorio)) {
                    // Exeplo principal: Listar todos os diretorios/arquivos dentro da pasta C:\arquivos
                    // diretorios.forEach(dir -> System.out.println("Diretorio: " + dir));

                    // Exemplo 1: Filtrando apenas arquivos
                    // diretorios.filter(dir -> dir.toString().contains(".txt")).forEach(System.out::println);

                    // Exemplo 2 Filtrando apenas diretórios
                    diretorios.filter(Files::isDirectory).forEach(System.out::println);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
