package Classes;

abstract class AnimalAula18Abstracao {
    abstract void makeSound();
}

class PigAula18Abstracao extends AnimalAula18Abstracao {
    public void makeSound() {
        System.out.println("Hoink Hoink");
    }
}

public class Aula18AbstracaoComSuperclasses {
    public static void main(String[] args) {
        PigAula18Abstracao pig = new PigAula18Abstracao();
        pig.makeSound();
    }
}
