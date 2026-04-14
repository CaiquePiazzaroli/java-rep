package ClasseString;

public class Aula002MetodoContains {
    public static void main(String[] args) {
        String historia = "Era uma vez a história de garota de cachinhos dorados";
        //Era uma vez a história de garota de cachinhos dorados

        // O método contains verifica se uma string contém um determinado trecho de caracteres
        System.out.println(historia.contains("história")); // True
        System.out.println(historia.contains("")); // Toda string tem uma string vazia
        System.out.println(historia.contains("Dourados")); // false, java é case sensitive
        System.out.println(historia.contains(null)); // ERRO: NullPointerException
    }
}
