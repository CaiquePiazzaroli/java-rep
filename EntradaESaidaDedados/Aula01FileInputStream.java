package EntradaESaidaDedados;

import java.io.FileInputStream;

public class Aula01FileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C:\\task-cli\\database.json");
            int byteLido;
            while (true) {
                // LE o proximo byte
                byteLido = input.read();
    
                // Encerra a leitura do arquivo quando o resultado da variavel for -1
                if(byteLido == -1){
                    break;
                }
                
                // Parseia o int para char
                System.out.print((char) byteLido); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}