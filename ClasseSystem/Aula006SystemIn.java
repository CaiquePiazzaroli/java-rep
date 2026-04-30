package ClasseSystem;

import java.util.Scanner;

public class Aula006SystemIn {
    public static void main(String[] args) {
        // System.in é do tipo InputStream
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();
        System.out.println("Resposta: " + resposta);
        sc.close();
    }
}
