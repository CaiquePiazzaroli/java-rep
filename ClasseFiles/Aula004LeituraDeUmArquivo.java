package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Aula004LeituraDeUmArquivo {
    public static void main(String[] args) {
        try {
            Path arquivo = Path.of("C:", "aulaDoisTeste", "arquivoCriadoTeste.txt");
            Stream<String> retorno = Files.lines(arquivo);
            retorno.forEach(e -> System.out.println(e));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
