package Sintaxe;
public class Aula20ObjetoString {
    public static void main(String[] args) {
        
        // Exemplo de utilização de uma string
        String nome = "Caique";
        System.out.println(nome);

        // Usando a função length para saber o tamanho de uma string
        int tamanho = nome.length(); 
        System.out.println("Tamanho de uma string: " + tamanho); // 6 Pois a palavra caique tem 6 letras

        // Transformando todas as letras em maiúsculas 
        String maiusculo = nome.toUpperCase();
        System.out.println("A palavra Caique em maiúsculo é: " + maiusculo);

        // Transformando todas as letras em minúsculas 
        String minusculo = nome.toLowerCase();
        System.out.println("A palavra Caique toda em minúscula ficaria: " + minusculo);

        // Encontrando um valor ou caracter dentro de uma string (indexof)
        String fraseMotivacional = "Tudo é possível quando se tem força de vontade!";

        // Descobrindo qual é o valor do primeiro índice da palavra força com indexOf
        int indiceDaPalavraProcurada = fraseMotivacional.indexOf("força");
        System.out.println(indiceDaPalavraProcurada);

        // Acessando o caractere na prosição com o charAt
        System.out.println(fraseMotivacional.charAt(indiceDaPalavraProcurada)); // f



        // Comparando duas strings
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false
    

        // Removendo espaços em branco do início e fim de uma string
        String txt = "   Hello World   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

    }
}
