import java.util.Scanner;
// 1021 beecrowd
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] cedulas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        int[] quantidadeDeCelulas = {0, 0, 0, 0, 0, 0}; 
        
        // 1, 0.50, 0.25, 0.10, 0.05 e 0.01
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        int[] quantidadeDeMoedas = {0, 0, 0, 0, 0, 0}; 
        double valorEntrada;

        valorEntrada = sc.nextDouble();
        
        for (int i = 0; i < cedulas.length; i++) {
            if(valorEntrada >= cedulas[i]) {
                quantidadeDeCelulas[i] = (int) (valorEntrada / cedulas[i]);
                valorEntrada -= quantidadeDeCelulas[i] * cedulas[i];
            }
        }


        for (int i = 0; i < moedas.length; i++) {
            if(valorEntrada >= moedas[i]) {
                quantidadeDeMoedas[i] = (int) (valorEntrada / moedas[i]);
                valorEntrada -= quantidadeDeMoedas[i] * moedas[i];
            }
        }

        System.out.println("NOTAS:");
        for(int i = 0; i < quantidadeDeCelulas.length; i++) {
            System.out.println(String.format("%d nota(s) de R$ %.2f", quantidadeDeCelulas[i], cedulas[i]));
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < quantidadeDeMoedas.length; i++) {
            System.out.println(String.format("%d moeda(s) de R$ %.2f", quantidadeDeMoedas[i], moedas[i]));
        }
    }
}