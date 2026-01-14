package Metodos;

public class Aula5EscopoNoJava {
    public static void main(String[] args) {

        // Inicinando um bloco de código
        {
            int numero = 8;
            // a variavel numero pode ser acessada em qualquer lugar aqui
        }
        // Finalizando um bloco de código


        // Causará um erro pois a variavel numero não existe fora do bloco onde foi declarada
        System.out.println(numero);  // Erro: numero cannot be resolved

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i); // Erro: i cannot be resolved
     }
}
