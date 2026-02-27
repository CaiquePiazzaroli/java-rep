package EstruturaDeDados;

import java.util.HashMap;

public class Aula003HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("nome", "Caique Mendes");
        hash.put("idade", "29");
        hash.put("nascimento", "Piracaia");

        System.out.println(hash);
    }
}
