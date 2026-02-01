package ManipulacaoDeArquivos;
import java.io.FileWriter;
import java.io.IOException;

public class Aula03EscrevendoEmUmArquivo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("ManipulacaoDeArquivos\\diretorio\\filename.txt");
            fileWriter.write("Primeira frase criada com o fileWriter");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
