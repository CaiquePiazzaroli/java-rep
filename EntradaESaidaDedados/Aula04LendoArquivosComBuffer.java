package EntradaESaidaDedados;

import java.io.BufferedReader;
import java.io.FileReader;

public class Aula04LendoArquivosComBuffer {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Users\\Caique\\Desktop\\ImagemItalia\\filename.txt");
            BufferedReader buffer = new BufferedReader(file);
            String line;
            while (true) {
                line = buffer.readLine();
                if (line.isEmpty()) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
