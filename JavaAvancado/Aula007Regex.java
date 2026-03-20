package JavaAvancado;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Aula007Regex {

    public static void main(String[] args) {
        
        // Pattern define qual regex será procurada
        // Mesmo que haja diferença de letras minusculas e maiúsculas, o pattern irá ser encontrado por causa da flag
        Pattern pattern = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);

        // Faz uma busca na string Visit w3schools e retorna um objeto Matcher
        Matcher matcher = pattern.matcher("abcde");

        // O metodo find retorna um booleano true caso tenha encontrado o regex e false caso não
        boolean matchFound = matcher.find();

        
        if(matchFound) {
            System.out.println("Encontrou o regex");
        } else {
            System.out.println("Regex não encontrado");
        }
    }
}