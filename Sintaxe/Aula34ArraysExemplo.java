package Sintaxe;

public class Aula34ArraysExemplo {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "joao";
        nomes[1] = "maria";
        nomes[2] = "teodoro";

        System.out.println(nomes[0]); // joao
        System.out.println(nomes[1]); // maria
        System.out.println(nomes[2]); // teodoro
        System.out.println(nomes[3]); // null
    }
}
