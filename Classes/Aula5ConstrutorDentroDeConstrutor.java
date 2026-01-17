package Classes;

public class Aula5ConstrutorDentroDeConstrutor {
    
    int year;
    String model;

    // Construtor 1
    public Aula5ConstrutorDentroDeConstrutor(String model){
        // Como o this recebeu 2 parametros
        // O java entende que tem que usar o construtor 2
        // Nesse caso, caso apenas o nome seja passado, o padrão para o ano será 2020
        // O this sempre deve ser a primeira linha de código dentro de um contrutor
        this(2020, model);
    }

    // Construtor 2
    public Aula5ConstrutorDentroDeConstrutor(int year, String model) {

        // Aqui o processo de atribuição é completo pois os dois parametros são passados
        this.year = year;
        this.model = model;
    }
    public static void main(String[] args) {

        // Instanciando o carro 1
        Aula5ConstrutorDentroDeConstrutor carro1 = new Aula5ConstrutorDentroDeConstrutor("Fiat Uno");
        System.out.println(carro1.year); // 2020

        // Instanciando o carro 2 
        Aula5ConstrutorDentroDeConstrutor carro2 = new Aula5ConstrutorDentroDeConstrutor(2026, "Fiat Uno");
        System.out.println(carro2.year); // 2026
    }
}
