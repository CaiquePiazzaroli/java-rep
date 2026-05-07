package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula0016MetodoReadLines {
    public static void main(String[] args) {
        
        Path arquivo = Paths.get("C:", "revisaoFiles", "meuArquivoDeRevisaoOutro.txt");

        try {
            String conteudo = Files.readString(arquivo);
            System.out.println(conteudo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
