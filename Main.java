import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        
        // Diretórios
        Path diretorioInexistente = Paths.get("C:", "arquivosInexistente");
        Path diretorio = Paths.get("C:", "arquivos");

        // Arquivos
        Path arquivoIntexistente = Paths.get("C:", "arquivos", "arquivoInexistente.txt");
        Path arquivo= Paths.get("C:", "arquivos", "caique_arquivo.txt"); 

        // Diretório existente
        System.out.println("Diretorio existente");
        System.out.println(Files.exists(diretorio)); // true
        System.out.println(Files.notExists(diretorio)); // false
        System.out.println(Files.isDirectory(diretorio)); // true
        System.out.println(Files.isRegularFile(diretorio)); // false

        // Diretório Inexistente
        System.out.println("Diretório Inexistente");
        System.out.println(Files.exists(diretorioInexistente)); // false
        System.out.println(Files.notExists(diretorioInexistente)); // true
        System.out.println(Files.isDirectory(diretorioInexistente)); // false
        System.out.println(Files.isRegularFile(diretorioInexistente)); // false


        // Arquivo existente
        System.out.println("Arquivo existente");
        System.out.println(Files.exists(arquivo)); // true
        System.out.println(Files.notExists(arquivo)); // false
        System.out.println(Files.isDirectory(arquivo)); // false
        System.out.println(Files.isRegularFile(arquivo)); // true

        // Arquivo Inexistente
        System.out.println("Arquivo Inexistente");
        System.out.println(Files.exists(arquivoIntexistente)); // false
        System.out.println(Files.notExists(arquivoIntexistente)); // true
        System.out.println(Files.isDirectory(arquivoIntexistente)); // false
        System.out.println(Files.isRegularFile(arquivoIntexistente)); // false

    }
}
