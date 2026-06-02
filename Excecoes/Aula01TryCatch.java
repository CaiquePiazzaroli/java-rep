package Excecoes;

public class Aula01TryCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Causará um erro: Index 10 out of bounds for length 3
        } catch(Exception e) {
            System.out.println("Algo deu errado");
        } finally {
            // Esse bloco será executado de qualquer maneira
		        System.out.println("Procure um administrador de sistema");
		}
    }
}
