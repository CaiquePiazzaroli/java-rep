package ClasseSystem;

public class Aula002SystemErr {
    public static void main(String[] args) {
        // Saida com erro
        int nota = 25;
        if(nota > 10 || nota < 0) {
            System.err.println("\nImpossível a nota deve estar entre 0 e 10");
        }
    }
}
