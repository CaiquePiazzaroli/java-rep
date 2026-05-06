package ClasseFiles;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.net.URI;
import java.io.FileOutputStream;
import java.io.IOException;


public class Aula012MetodoCopy {
    public static void main(String[] args) {

        // Movendo de um local para outro
        Path origem1 = Paths.get("C:\\ClasseFiles\\meuarquivo.txt");
        Path destino1 = Paths.get("C:\\ClasseFiles\\testando\\metodo\\copy\\meuarquivo.txt");
        try {
            Path copia = Files.copy(origem1, destino1, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(copia);
        } catch (IOException e) {
            System.out.println(e);
        }


        // Copiando (Baixando) da internet e copiando em uma pasta
        Path destino2 = Paths.get("C:\\ClasseFiles\\image.jpg");
        try {
            URI url = new URI("https://cataas.com/cat"); // Api online que gera fotos aleatorias
            try (InputStream in = url.toURL().openStream()) {

                // Sobrecarga: Recebe um InputStream como origem
                Files.copy(in, destino2, StandardCopyOption.REPLACE_EXISTING);

                System.out.println("Conteúdo salvo em: " + destino2);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // Copia um output de dados para outro local
        Path origem3 = Paths.get("C:\\ClasseFiles\\image.jpg");

        try {
            try (OutputStream out = new java.io.FileOutputStream("C:\\ClasseFiles\\copyimage.jpg")) {
            long bytesCopiados = Files.copy(origem3, out);
            System.out.println("Bytes copiados: " + bytesCopiados);
        }
        } catch (Exception e) {
            System.out.println(e);
        }

        

    }
}
