package Classes;

class Person {
    public String nome;
    private int idade; 

    // Poderá ser acessado apenas em classes do mesmo pacote e subclasses
    protected Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Aula6ModificadoresDeAcesso {
    public static void main(String[] args) {
        Person prs = new Person("Caique", 29); // OK: person é protected
        System.out.println(prs.nome); // OK: nome é public
        // System.out.println(prs.idade); // Erro: The Field Person.idade not visible
    }
}
