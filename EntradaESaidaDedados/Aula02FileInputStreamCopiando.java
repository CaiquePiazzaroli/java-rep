package EntradaESaidaDedados;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Aula02FileInputStreamCopiando {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Caique\\Desktop\\ImagemItalia\\italia.webp");
            FileOutputStream output = new FileOutputStream("C:\\Users\\Caique\\Desktop\\ImagemItalia\\italiapng.png");
            int byteLido;
            while (true) {
                byteLido = input.read();

                if(byteLido == -1) {
                    System.out.println("Finalizado");
                    break;
                }

                output.write(byteLido);
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
