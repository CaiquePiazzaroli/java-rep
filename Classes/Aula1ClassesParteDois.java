package Classes;

public class Aula1ClassesParteDois {
    int x = 20;
    final String nome = "Caique";
    String sobrenome = "unknow";

    public Aula1ClassesParteDois(){};

    // Construtor aqui
    public Aula1ClassesParteDois(String nomeInicial) {
        System.out.println("Essa parte foi executada");
        
        // Setando valor inicial
        sobrenome = nomeInicial;
    }

    String sayMyName() {
        return this.nome;
    }
}
