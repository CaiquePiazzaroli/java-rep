package ManipulacaoDeArquivos;

import java.io.File;
import java.io.IOException;

public class Aula02CriandoArquivos {
    public static void main(String[] args) {
        File file = new File("ManipulacaoDeArquivos\\diretorio\\Aula02MeuArquivoCriado.txt");
        
        // CreateNewFile pode lançar uma exceção do tipo IOException
        try {
            if(file.createNewFile()) {
                System.out.println("Seu arquivo foi criado em: " + file.getAbsolutePath());
            } else {
                System.out.println("Seu arquivo não pode ser criado! Ja existe um arquivo com este nome!");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
