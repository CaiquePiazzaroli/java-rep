import java.util.Arrays;
import java.util.List;

public class Main {

    // esc. global
    static int meuNumero = 40;

    public static void main(String[] args) {

        // Estrutura simples de decisao
        if (true) {
            System.out.println("é verdade este bilhete");
        }

        // Estrutura simples sem chaves (deve conter apenas 1 linha)
        if (true)
            System.out.println("É verdade este bilhete novamente");

        // Estrutura de decisao composta
        int nota = 8;
        if (nota >= 7) {
            System.out.println("Aprovado"); // Excuta se nota > ou = a 7
        } else {
            System.out.println("Reprovado"); // Executa se nota for < 7
        }

        // Estrutura de decisao composta sem chaves (deve conter apenas 1 linha)
        double precoCasa = 249000.90;
        if (precoCasa <= 300000)
            System.out.println("Compra a casa"); // Compra se o preço da casa for < que 300k
        else
            System.out.println("Busca empréstimo"); // Busca empréstimo caso a casa seja maior que 300k

        // Estruturas condicionais encadeadas
        int anoCarro = 2015;
        if (anoCarro > 2014) {
            System.out.println("Compra na hora!");
        } else if (anoCarro > 2010 && anoCarro <= 2014) {
            System.out.println("Pensa na proposta");
        } else {
            System.out.println("Nem considera a compra!");
        }

        // if ternário ou operador ternário -> Atribui dinamicamente um valor a uma
        // variavel
        int nota2 = 6;
        String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado = " + resultado);

        // IF aninhado => realizar um if dentro de outro if
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");
            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Switch case
        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Não foi encontrado dias correspondentes!");
        }


        // Retorna um valor
        String descricaoDia = switch (day) {
            case 1 -> "Segunda";
            case 2 -> "Terça";
            default -> "Dia inválido";
        };


    }
}
