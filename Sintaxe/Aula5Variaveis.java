package Sintaxe;
public class Aula5Variaveis {
    public static void main(String[] args) {
        //Criando uma variável: type NomeVariavel = Valor;

        // String
        String jhon = "Jhon";
        System.out.println(jhon); //Jhon

        // int
        int idade = 19;
        System.out.println(idade); //19

        //Declarando uma variavel sem valor e atribuindo depois
        int numeroDaSorte;
        numeroDaSorte = 20;
        System.out.println(numeroDaSorte); //20

        // Reatribuição de valor de uma variável
        numeroDaSorte = 99;
        System.out.println(numeroDaSorte); //99

        
        //Exemplificando erro de uma variável constante
        final int n1 = 15;
        System.out.println(n1); // 15
        // n1 = 20; //Erro

        // Pode conter _ no nome
        int _numero = 100;
        System.out.println(_numero);

        // Pode conter $ no nome
        int $numero = 400;
        System.out.println($numero);

        // Nome inválido (nao podem começar com numeros)
        // int 19Variavel = 100;

        // Nome inválid (não podem usar palavras reservadas)
        // int int = 10;
    }
}
