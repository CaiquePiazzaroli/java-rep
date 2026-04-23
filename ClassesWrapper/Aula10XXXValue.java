package ClassesWrapper;

public class Aula10XXXValue {
    public static void main(String[] args) {

        // Intancia um objeto Integer
        Double objeto   = Double.valueOf(42.96);

        // Extrai um inteiro do integer
        int     primitivo = objeto.intValue(); // 42

        System.out.println("Objeto:    " + objeto); // Imutável: 42.96
        System.out.println("Primitivo: " + primitivo); // Objeto do tipo int: 42
    }
}
