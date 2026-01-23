package Classes;

class Vehicle {

    // Protected: para que a classe carro pudesse ser acessada
    protected String brand = "Ford"; // Atributo do da classe Vehicle
    public void honk() { // método da classe vehicle
        System.out.println("Tuut, tuut");
    }
}

// A classe Carro Herda da classe Veículo
class Car extends Vehicle {
    protected String modelName = "Mustang"; //Atributo de carro
}


class Aula13HerancaEmJava {

    public static void main(String[] args) {
        // Cria o objeto carro
        Car car = new Car();

        // Chama o método honk da superclasse veículo
        car.honk();

        // Mostra o atributo da classe Pai Veículo
        System.out.println("Marca: " + car.brand);

        // Mostra o atributo modelo da classe filha Car
        System.out.println("Modelo: " + car.modelName);
    }
}

