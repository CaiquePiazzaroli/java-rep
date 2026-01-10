public class Aula33Arrays {
    public static void main(String[] args) {
        // Criando um array de strings
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars); // printa: [Ljava.lang.String;@7ad041f3

        // Imprimindo um array usando o for loop
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Usando o for each 
        for(String car : cars) {
            System.out.println(car);
        }
    }   
}
