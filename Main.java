import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        
        // Imutabilidade da String
        String nome = "Caique";
        nome.concat(" Mendes"); // Cria uma nova String com o valor Caique Mendes mas não sobrepoe a original
        System.out.println(nome); // Caique

        // Mutabilidade da StringBuilder
        StringBuilder nome2 = new StringBuilder("Caique");
        nome2.append("Mendes com stringbuilder");
        System.out.println(nome2); // Caique Mendes com Stringbuilder


        // Instanciação
        String str1 = "String1";
        System.out.println(str1);
        
        String str2 = new String("String 2");
        System.out.println(str2);
        
        String str3 = new String(str2);
        System.out.println(str3);

        char[] letras = {'J', 'a', 'v','a'};
        String str4 = new String(letras);
        System.out.println(str4);
        
        String str5 = new String(letras, 1, 3);
        System.out.println(str5);

        byte[] bytes = {65, 66, 67};
        String str6 = new String(bytes);
        System.out.println(str6);

        String str7 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(str7);

        StringBuilder sb = new StringBuilder("Minha String builder");
        String str8 = new String(sb);
        System.out.println(str8);


        // Métodos da classe String
        String variavelTeste = " Minha variavel ";
        System.out.println(variavelTeste.length()); // 14
        System.out.println(variavelTeste.toUpperCase()); // Tudo em maiusculo
        System.out.println(variavelTeste.toLowerCase()); // Tudo em minúsculo
        System.out.println(variavelTeste.indexOf("variavel")); // 6 -> Onde começa o termo variável
        System.out.println(variavelTeste.charAt(7)); // v
        System.out.println(variavelTeste.equals(variavelTeste)); // true
        System.out.println(variavelTeste.equals("outra coisa")); // false
        System.out.println(variavelTeste.trim()); // "Minha variavel" -> Sem espaços em branco no inicio e fim
        System.out.println(variavelTeste.concat(" concatenado ")); //  Minha variavel concatenado 
        System.out.println(String.join(", ", "Banana", "Maça", "Pera")); // "Banada, Maça, "Pera
        System.out.println(variavelTeste.contains("variavel")); // true
        System.out.println(variavelTeste.contains("CARRO")); // false
        System.out.println(variavelTeste.repeat(4)); // imprime 4x o conteudo

        // Diferença entre isEmpty e isBlank
        String teste1 = "";
        String teste2 = "  ";
        String teste3 = "\n";
        String teste4 = "Teste 4";

        // Se contem letras visiveis false, do contrário true
        System.out.println(teste1.isBlank()); // true 
        System.out.println(teste2.isBlank()); // true
        System.out.println(teste3.isBlank()); // true
        System.out.println(teste4.isBlank()); // false

        // Se contem caractere seja especial ou nao = true, do contrario false
        System.out.println(teste1.isEmpty()); // true 
        System.out.println(teste2.isEmpty()); // false
        System.out.println(teste3.isEmpty()); // false
        System.out.println(teste4.isEmpty()); // false

    }
}
