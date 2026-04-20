package ClasseString;

import java.nio.charset.StandardCharsets;

public class Aula000ConstrucaoString {

    public static void main(String[] args) {
    
        // Com a string literal
        String texto1 = "Hello World! 1";
        System.out.println(texto1); // Hello World! 1

        // Com a utilização do new
        String texto2 = new String("Hello World! 2");
        System.out.println(texto2); // Hello World! 2

        // Por meio de outro objeto String
        String texto3 = "Java";
        String copiaTexto3 = new String(texto3);
        System.out.println(copiaTexto3); // Java

        // A partir de Array de caracteres
        char[] letras = {'j', 'a', 'v', 'a'};
        String texto4 = new String(letras); 
        System.out.println(texto4); // java

        // A partir de um intervalo de arrays
        String texto5 = new String(letras, 0,2);
        System.out.println(texto5); // ja

        // A partir de um Array de Bytes
        byte[] letrasBytes = {67, 65, 73, 81, 85, 69}; // Unicode ASCII
        String meuNome = new String(letrasBytes);
        System.out.println(meuNome); // CAIQUE

        // Especificando o conjunto de caracteres
        String meuNome1 = new String(letrasBytes, StandardCharsets.UTF_8);
        System.out.println(meuNome1); // CAIQUE

        // Especificando com a utilização do StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        String textoSb = new String(sb);
        System.out.println(textoSb);

    }
    
}
