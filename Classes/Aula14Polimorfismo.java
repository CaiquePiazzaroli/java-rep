package Classes;
class Animal {
    protected void SomAnimal() {
        System.out.println("Animal faz barulho");
    }
}

class Cachorro extends Animal {
    public void SomAnimal() {
        System.out.println("CACHORRO LATE!");
    }
}

class Gato extends Animal {
    public void SomAnimal() {
        System.out.println("GATO MIA!");
    }
}

public class Aula14Polimorfismo {
    public static void main(String[] args) {
        Animal an = new Animal();
        Cachorro ch = new Cachorro();
        Gato gt = new Gato();
        an.SomAnimal(); // BARULHO
        ch.SomAnimal(); // AU AU
        gt.SomAnimal(); // MIAU MIAU
    }
}
