package Classes.Aula06modificadoresDeAcesso.packageDois;

// Importando a classe pessoa
import Classes.Aula06modificadoresDeAcesso.packageUm.Aula06Pessoa;

public class Aula6Main {
    public static void main(String[] args) {
        Aula06Pessoa pessoa = new Aula06Pessoa();
        pessoa.apresentarPublico(); // OK: método publico

        pessoa.apresentarPrivado(); // Erro: Método Privado

        pessoa.apresentarProtected(); // Erro: metodo protected
    }
}
