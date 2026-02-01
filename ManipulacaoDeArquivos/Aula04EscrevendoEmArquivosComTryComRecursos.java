package ManipulacaoDeArquivos;
import java.io.FileWriter;
import java.io.IOException;

public class Aula04EscrevendoEmArquivosComTryComRecursos {
    public static void main(String[] args) {
        // O true no construtor coloca a classe FileWriter como append, isto é, escreve continuamente
        // Com base no conteúdo que ja está no arquivo
        try( FileWriter fw = new FileWriter("ManipulacaoDeArquivos\\diretorio\\filename.txt", true)) {
            fw.write("\n############################");
            fw.write("Escrevendo em um arquivo usando o  try(){}catch()");
            fw.write("Assim não precisamos usar o .close para fechar o arquivo");
            fw.write("############################");
        } catch(IOException e) {
            System.out.println(e);
        };
    }
}
