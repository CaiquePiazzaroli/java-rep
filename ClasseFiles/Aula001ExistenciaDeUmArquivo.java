package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;

public class Aula001ExistenciaDeUmArquivo {
    public static void main(String[] args) {
        
        // Referenciando o diretório
        Path diretorio = Path.of("C:", "classeFilesTeste");

        // Verificando se o diretório C:\classeFilesTesteExiste
        boolean diretorioExiste = Files.exists(diretorio);

        String teste = diretorioExiste ? "Diretorio: Existe" : "Diretorio: não existe";
        System.out.println(teste);


        // Referenciando um arquivo 
        Path arquivo = Path.of("C:", "classeFilesTeste", "arquivoTeste.txt");
        String arquivoExiste = Files.exists(arquivo) ? "Arquivo: existe" : "Arquivo : não existe";
        System.out.println(arquivoExiste);
    }
}
