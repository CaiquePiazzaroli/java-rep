package Classes;

interface AnimalAula19AbstracaoComInterfaces {
    public void makeSound();
    public void sleep();
}

class PigAula19AbstracaoComInterfaces implements AnimalAula19AbstracaoComInterfaces {
    public void makeSound() {
        System.out.println("Hoink Hoink");
    }
    public void sleep() {
        System.out.println("Dormindo na lama");
    }
}


public class Aula19AbstracaoComInterfaces {
    public static void main(String[] args) {
        PigAula19AbstracaoComInterfaces pig = new PigAula19AbstracaoComInterfaces();
        pig.makeSound();
        pig.sleep();
    }
}
