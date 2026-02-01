package ManipulacaoDeArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula05LendoUmArquivoComScanner {
    public static void main(String[] args) {

        // Instanciando um File e localizando com base em seu diretório
        File file = new File("ManipulacaoDeArquivos\\diretorio\\filename.txt");

        // Nome do arquivo
        System.out.println("Nome do arquivo: " + file.getName());
        System.out.println("Diretório completo: " + file.getAbsolutePath());
        System.out.println("Pode ser escrito: " + file.canWrite());
        System.out.println("Pode ser Lido: " + file.canRead());
        System.out.println("Tamanho do arquivo: " + file.length() + " Bytes");

        // Instanciando o scanner dentro da condicao do try
        try(Scanner sc = new Scanner(file)) {
            // Enquanto existir linhas no arquivo, imprimir
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
