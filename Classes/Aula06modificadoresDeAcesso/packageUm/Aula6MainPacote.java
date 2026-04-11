package Classes.Aula06modificadoresDeAcesso.packageUm;

public class Aula6MainPacote {
    public static void main(String[] args) {
        Aula06Pessoa pessoa = new Aula06Pessoa();
        pessoa.apresentarPublico(); // OK: método publico

        pessoa.apresentarPrivado(); // Erro: Método Privado

        pessoa.apresentarProtected(); // OK: metodo protected pode ser acessado no pacote
    }
}
