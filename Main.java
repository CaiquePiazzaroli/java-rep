import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        
        // Transferindo arquivos da pasta x para pasta y no sistema de arquivos
        Path arquivoOrigem = Paths.get("C:", "revisao", "pasta1", "arquivo.txt");
        Path arquivoDestino = Paths.get("C:", "revisao", "pasta2", "arquivo.txt");
        try {
            Path resultado = Files.copy(arquivoOrigem, arquivoDestino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println(e);
        }
        

        // Copiando de um InputStream (na web)
        Path arquivoDestinoInputStream = Paths.get("C:", "revisao", "pasta2", "imagem.png");
        try {
            URI uri = new URI("https://cataas.com/cat");

            try(InputStream in =  uri.toURL().openStream()) {
                Files.copy(in, arquivoDestinoInputStream, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Conteúdo salvo em: " + arquivoDestinoInputStream);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Copiando arquivo para outro com outputStream
        Path arquivoOrigemOutPutStream = Paths.get("C:", "revisao", "pasta2", "imagem.png");
        try {
            try(OutputStream out = new FileOutputStream("C:\\revisao\\pasta1\\imagem1.png")) {
                long bytesCopiados = Files.copy(arquivoOrigemOutPutStream, out);
                System.out.println(bytesCopiados);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
