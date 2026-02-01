package ManipulacaoDeArquivos;

import java.io.File;

public class Aula06DeletandoArquivos {
    public static void main(String[] args) {
        // Rastreando o arquivo para deletar
        File fileToDelete = new File("ManipulacaoDeArquivos\\diretorio\\filename.txt");
        if(fileToDelete.delete()) {
            System.out.println("O arquivo foi deletado com sucesso!");
        } else {
            System.out.println("Erro ao deletar o arquivo");
        }
    }
}
