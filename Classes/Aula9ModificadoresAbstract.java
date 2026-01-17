package Classes;

// Classe Abstrata que será extendida por alguma outra classe
abstract class Humano {
    public String nome;

    public abstract void falar();

    // Construtor definido na classe humano para que não
    public Humano(String nome) {
        this.nome = nome;
    };
} 

// Pessoa extends Humano, herdando tudo de humano
// Nesse caso herda o construtor Humano e o atributo nome
class Pessoa extends Humano {

    public Pessoa(String nome) {
        // Chamando o contrutor da classe
        // É o construtor: public Humano(String nome) {this.nome = nome;}
        super(nome); 
    }

    // Aviso! The type Pessoa must implement the inherited abstract method Humano
    // Pelo fato do método falar() ser abstrato, é obrigatória sua implementação
    // em classes filhas
    // @Overrride é uma label que indica que o método abaixo é um método sobreescrito de um supertipo
    @Override
    public void falar() {
        System.out.println("Ola meu nome é: " + this.nome);
    }
}



public class Aula9ModificadoresAbstract {
    public static void main(String[] args) {

        // Ponto 1: Não é possivel instanciar classes abstratas
        // Humano hm = new Humano();

        // Ponto 2: Podemos instanciar o Objeto Pessoa e ele terá todos os
        // atributos e métodos herdados da classe Humano
        Pessoa ps = new Pessoa("Caique");
        System.out.println(ps.nome);
        ps.falar(); // Caique
    }
}
