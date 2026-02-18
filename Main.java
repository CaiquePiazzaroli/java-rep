import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Caique\\Desktop\\ImagemItalia\\paralerEx.ods");
            int leitura;
            while (true) {
                leitura = input.read();

                if(leitura == -1){
                    break;
                }

                System.out.print((char) leitura);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}