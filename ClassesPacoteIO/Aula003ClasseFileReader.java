package ClassesPacoteIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aula003ClasseFileReader {
    public static void main(String[] args) {
        // Aponta para um arquivo: Existente, nao existente mas com diretório ok
        File arquivo = new File("C:\\arquivos\\file\\meuArquivo2.txt");
        try {
            // Cria o arquivo se nao existir
            if(arquivo.createNewFile()) System.out.println("Arquivo criado");

            StringBuilder conteudo = new StringBuilder();
    
            try(FileReader fr = new FileReader(arquivo)) {
                while (fr.ready()) {
                    conteudo.append( (char) fr.read());
                }
            }
            String contedutoFinal = conteudo.toString();
            System.out.println(contedutoFinal);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
