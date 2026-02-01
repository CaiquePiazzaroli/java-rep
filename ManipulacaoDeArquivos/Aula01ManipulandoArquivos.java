package ManipulacaoDeArquivos;

import java.io.*;

public class Aula01ManipulandoArquivos {

    public static void main(String[] args) throws IOException {

        // Cria uma pasta chamada diretório dentro da pasta ManipulacaoDeArquivos
        File createFolder = new File("ManipulacaoDeArquivos\\diretorio");

        // CreateFolder.mkdir() tenta criar a pasta e retorna true se ela for criada
        // Obs Se a pasta/diretorio ja existir, não cria
        if (!createFolder.mkdir()) {
            System.out.println("A pasta nao pode ser criada");
        }

        // Instanciando uma nova classe file mas agora para o arquivo que será criada
        File createTxtFile = new File(String.format("%s\\%s", createFolder.getAbsolutePath(), "filename.txt"));

        // createTxtFile.createNewFile() retorna true se o arquivo for criado com
        // sucesso
        if (createTxtFile.createNewFile()) {
            System.out.println("Seu arquivo foi criado com sucesso!");
        }
    }
}