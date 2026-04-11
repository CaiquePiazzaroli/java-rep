package Classes.Aula06modificadoresDeAcesso.packageUm;

public class Aula06Pessoa {

    public static void main(String[] args) {
        Aula06Pessoa pessoa = new Aula06Pessoa();
        pessoa.apresentarPublico();
        pessoa.apresentarPrivado();
    }

    // Pode ser acessada por qualquer classe
    public void apresentarPublico() {
        System.out.println("Ola estou me apresentando atraves so método public");
    }

    // Pode ser acessado por apenas esta classe
    private void apresentarPrivado() {
        System.out.println("Ola estou me apresentando atraves so método private");
    }

    // Pode ser acessado por classes no mesmo pacote
    protected void apresentarProtected() {
        System.out.println("Ola estou me apresentando atraves so método private");
    }
}
