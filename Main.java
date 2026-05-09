import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        
        Path diretorio = Paths.get("c:", "revisao", "criacaoDeArquivos");


        //System.out.println(System.getProperty("java.io.tmpdir"));

        try {
            // CreateDirectory
            // Cria um direório dentro de um sistema de arquivos 
            // Ex -> a pasta revisao ja existe, createDirectory ira criar apenas a pasta criaçãoDeArquivos
            if(!Files.exists(diretorio)) Files.createDirectory(diretorio); 

            // CreateDirectories
            // Cria as pastas recursivamente dentro de um sistema de arquivos
            Path diretorioRecursivo = Paths.get("c:","diretorioRecursivo", "metodosDeCriacao", "criandoDir");

            // Cria C:\diretorioRecursivo\metodosDeCriacao\criandoDir
            Path caminhoRecursivoCriado = Files.createDirectories(diretorioRecursivo);

            // createFile: Cria arquivos]
            Path criado = Files.createFile(diretorio.resolve("meuNovoArquivo.txt"));
            System.out.println(criado);


        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
