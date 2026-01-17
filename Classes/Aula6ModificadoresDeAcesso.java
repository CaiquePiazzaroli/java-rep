package Classes;

class Person {
    public String nome;
    private int idade; 

    protected Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}


public class Aula6ModificadoresDeAcesso {
    public static void main(String[] args) {
        Person prs = new Person("Caique", 29);
        System.out.println(prs.nome); // Caique
        System.out.println(prs.idade); // Erro: The Field Person.idade not visible
    }
}
