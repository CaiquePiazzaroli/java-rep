package Classes;

public class Aula4PalavraChaveThis {
    int x;

    // Construtor
    public Aula4PalavraChaveThis(int x) {
        // this.x se refere ao atributo da classe
        // e apenas o x se refere parametro do construtor
        this.x = x;
    }

    public static void main(String[] args) {
        Aula4PalavraChaveThis a4 = new Aula4PalavraChaveThis(10);
        System.out.println("O valor do atributo X é: " + a4.x);
    }
}
