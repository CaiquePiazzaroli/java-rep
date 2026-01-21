package Classes;

class Animal {
    Animal() {
        System.out.println("Construtor de animal");
    }
    public void fazerBarulho() {
        System.out.println("O animal faz barulho!");
    }
}

class Cachorro extends Animal {
    public void fazerBarulho() {
        super.fazerBarulho(); // Chama o método da Superclasse Animal
        System.out.println("O cachorro LATE!");
    }
}

class Gato extends Animal {
    // Chama o construtor de Animal dentro do construtor de Gato
    Gato() {
        super();
    }
}

public class Aula15PalavraChaveSuper {
    public static void main(String[] args) {
        Cachorro ch = new Cachorro();
        ch.fazerBarulho(); // O animal faz barulho! // O cachorro LATE!

        Gato gt = new Gato(); // Construtor de animal
    }
}
