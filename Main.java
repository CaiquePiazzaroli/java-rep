import java.util.Arrays;
import java.util.List;

public class Main {

    // esc. global
    static int meuNumero = 40;


    public static void main(String[] args) {

        String nome = "caique";
        String outroNome = new String("caique");

        System.out.println(nome==outroNome); //false

        // equals
        System.out.println(nome.equals(outroNome));


        Object obj = 123;
        String texto = String.valueOf(obj);
        System.out.println(texto);


        // Metodos String

        // Contains:  verifica se uma string contém uma determinada sequência de caracteres.
        // Sem sobrecarga
        String email = "usuario@email.com";
        if (email.contains("@")) {
            System.out.println("E-mail válido!");
        }
        if (email.contains("")) {
            System.out.println("Contem vazio");
        }
        // if (email.contains(null)) {
        //     System.out.println("Exceção por CharSequence ser null");
        // }

        //endsWith verifica se um arquivo termina com sufixo
        // sem sobrecarga 
        String arquivo = "relatorio_final.pdf";
        System.out.println(arquivo.endsWith(".pdf"));

        String url = "https://www.site.com.br";
        if (url.endsWith(".br")) {
            System.out.println("Site brasileiro!");
        }

        // equals: equals(Object obj) da classe String compara o conteúdo de duas strings 
        // sem sobrecarga
        System.out.println("brasil".equals("brasil")); // true

        // equalsIgnoreCase: equalsIgnoreCase(String obj) da classe String compara o conteúdo de duas strings 
        // sem sobrecarga
        System.out.println("brasil".equalsIgnoreCase("Brasil")); // true

        // isEmpty x isBlank
        String vazia = "";
        String espacos = "   ";
        String texto2 = "Java";

        System.out.println(vazia.isEmpty());    // true
        System.out.println(espacos.isEmpty());  // false
        System.out.println(texto2.isEmpty());    // false

        System.out.println(vazia.isBlank());    // true
        System.out.println(espacos.isBlank());  // true
        System.out.println(texto2.isBlank());    // false

        nome = "";
        if (nome.isBlank()) {
            System.out.println("O campo nome não pode estar em branco!");
        }

        String resposta = "";
        if (resposta.isEmpty()) {
            System.out.println("Nenhuma resposta foi fornecida.");
        }

        // Join 
        // join(CharSequence delimiter, CharSequence... elements)
        // join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        String resultado = String.join(", ", "Java", "Python", "C++");
        System.out.println(resultado); // "Java, Python, C++"

        List<String> linguagens = Arrays.asList("Java", "Python", "C++");
        resultado = String.join(", ", linguagens);
        System.out.println(resultado); // "Java, Python, C+

        String caminho = String.join("/", "usuarios", "42", "perfil");
        System.out.println(caminho);

        // lenght
        // sem sobrecarga
        System.out.println("Minha string".length());
        
        String senha = "abc123";
        if (senha.length() < 8) {
            System.out.println("Senha muito curta — mínimo 8 caracteres.");
        }

        // Replace -> String substitui todas as ocorrências 
        // replace(char oldChar, char newChar)
        // replace(CharSequence target, CharSequence replacement)
        String texto1 = "banana";
        String resultado2 = texto1.replace('a', 'o');
        System.out.println(resultado2);

        String frase = "Eu gosto de Java";
        String resultado3 = frase.replace("Java", "Kotlin");
        System.out.println(resultado3);

        String preco = "R$ 1.000,00";
        String numeros = preco.replace("R$ ", "")
                            .replace(".", "")
                            .replace(",", ".");
        System.out.println(numeros);
    }
}
