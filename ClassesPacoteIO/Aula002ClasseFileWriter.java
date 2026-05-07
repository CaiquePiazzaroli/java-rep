package ClassesPacoteIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aula002ClasseFileWriter {

    public static void main(String[] args) {
        // Aponta para um arquivo: Existente, nao existente mas com diretório ok
        File arquivo = new File("C:\\arquivos\\file\\meuArquivo2.txt");
        try {
            // Cria o arquivo se nao existir
            if(arquivo.createNewFile()) System.out.println("Arquivo criado");

            // FileWriter recebe um arquivo File - sobrepoe o conteudo (apaga e reescreve)
            try(FileWriter fw = new FileWriter(arquivo)) {
                fw.write("Escreve uma string");
            }

            // Adiciona no final por causa do argumento appen = true
            try(FileWriter fw = new FileWriter(arquivo, true)) {
                fw.write("\nEscreve uma string no final");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}