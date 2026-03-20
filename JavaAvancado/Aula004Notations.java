package JavaAvancado;

abstract class Aula004NotationsAnimal {
    void makeSound() {System.out.println("a");};
}


class Abelha extends Aula004NotationsAnimal {

    @Override
    void makeSound() {
        System.out.println("ZZZZZZZZZZZZZZZ");
    }
    
}


public class Aula004Notations {
    public static void main(String[] args) {
        Abelha abelha = new Abelha();
        abelha.makeSound();
    }

}