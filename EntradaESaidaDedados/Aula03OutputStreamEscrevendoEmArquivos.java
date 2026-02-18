package EntradaESaidaDedados;

import java.io.FileOutputStream;

public class Aula03OutputStreamEscrevendoEmArquivos {
    public static void main(String[] args) {
        String meuTextoString = "Caique Kevin Piaçaroli Maccei Mendes";
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Caique\\Desktop\\ImagemItalia\\arquivo.txt", true);
            output.write(meuTextoString.getBytes());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
