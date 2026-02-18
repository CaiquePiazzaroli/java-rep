package EntradaESaidaDedados;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Aula05EscrevendoEmArquivosComBuffer {
    public static void main(String[] args) {
        try {
            String diretorio = "C:\\Users\\Caique\\Desktop\\ImagemItalia\\filename.txt";
            BufferedWriter buffer = new BufferedWriter(new FileWriter(diretorio));
            buffer.write("First line"); // Adiciona a primeira linha
            buffer.newLine();  // quebra de linha
            buffer.write("Second line"); //Segunda linha
            buffer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
