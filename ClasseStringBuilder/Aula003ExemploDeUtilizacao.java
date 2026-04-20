package ClasseStringBuilder;

public class Aula003ExemploDeUtilizacao {
    public static void main(String[] args) {
        // transformar em https://localhost:8080
        String url = "http:";

        System.out.println("Url no início: " + url);
        
        // Criar um StringBuilder a partir de uma String
        StringBuilder sb = new StringBuilder(url); // valor atual: "http:"

        // Adicionando a letra s no http (posicao 4)
        sb.insert(4, "s"); // valor atual: "https:"

        // Adicionando //localhost:8080 ao final da StringBuilder
        sb.append("//localhost:8080");

        // Retornando o valor resultante para a variavel url
        url = sb.toString();

        System.out.println("URL no fim: " + url); // https://localhost:8080
    }
}
