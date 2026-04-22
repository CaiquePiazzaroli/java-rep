import java.io.FileOutputStream;

public class Testes {
     public static void main(String[] args) {

        String mensagem = "Ola me chamo caique";

        try {
            FileOutputStream output = new FileOutputStream("teste.txt", true);
            output.write(mensagem.getBytes());
            output.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
    