package ClassesPacoteIO;

import java.io.File;
import java.io.IOException;

public class Aula001ClasseFile {
    public static void main(String[] args) {
        
        // Aponta para um diretório
        File diretorio = new File("C:\\arquivos\\file");
        if (!diretorio.exists()) {

            // mkdirs: Cria o diretório e os diretórios pais se for necessário
            if(diretorio.mkdirs()) System.out.println("Diretório criado");; 

            // mkdir: Cria apenas aultima camada de diretório
            // if(diretorio.mkdir()); 
        }

        // Aponta para o arquivo
        File arquivo = new File(diretorio, "meuArquivo.txt"); // C:\\arquivos\\file\\meuArquivo.txt

        // Tratando exceção 
        try {
            // Cria um novo aruivo se o diretório existir e se não existir um arquivo igual
            if(arquivo.createNewFile()) System.out.println("Arquivo criado com sucesso");; 
        } catch (IOException e) {
            System.out.println(e);
        }
    

    }
}
