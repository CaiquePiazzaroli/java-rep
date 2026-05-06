package ClasseFiles;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Aula013MetodoMove {
    public static void main(String[] args) {
        
        // Aponta para o arquivo de origem
        Path origem = Paths.get("C:\\ClasseFiles\\arquivo.txt");

        // O diretorio precisa existir antes de mover
        Path destino = Paths.get("C:\\ClasseFiles\\arquivo.txt"); 

        try {   
            Path arquivoMovido = Files.move(origem, destino); 
            System.out.println("Arquivo movido em: " + arquivoMovido);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
