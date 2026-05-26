public class Main {

    static void exibirNome(String nome, int idade) {
        System.out.println("Seu nome é: " + nome);
        System.out.println("Voce tem " + idade + " anos");
    }

    static int calcularMaioridade(int idade) {

        if (idade >= 18) {
            return 0;
        }

        return 18 - idade;
    }

    static int calcularMaioridade(int idade, int parametroMaioridade) {

        if (idade >= parametroMaioridade) {
            return 0;
        }

        return parametroMaioridade - idade;
    }



    public static void main(String[] args) {

        exibirNome("Amanda", 24);

        int idadePessoa = 15;
        int anosParaMaioridade = calcularMaioridade(idadePessoa);
        System.out.println("Uma pessoa de "
                + idadePessoa +
                " ainda tem que fazer mais " + anosParaMaioridade
                + " para ser maiorde idade");

        int anosParaMaioridadeCustomizada = calcularMaioridade(idadePessoa, 24);
        System.out.println(anosParaMaioridadeCustomizada);

    }
}
