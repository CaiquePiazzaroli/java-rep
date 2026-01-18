import java.util.Scanner;
// 1021 beecrowd
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] cedulasEMoedasEmCentavos = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        int[] quantidadeDeCelulasEMoedas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
        double valorEntrada;
        int valorEntradaEmCentavos;

        valorEntrada = sc.nextDouble();
        valorEntradaEmCentavos = (int) (valorEntrada * 100 + 0.5);


        int index = 0;
        while (index < cedulasEMoedasEmCentavos.length) {
            if(valorEntradaEmCentavos >= cedulasEMoedasEmCentavos[index]) {
                valorEntradaEmCentavos -= cedulasEMoedasEmCentavos[index];
                quantidadeDeCelulasEMoedas[index]++;
            } else {
                index++;
            }
        }
        
        for(int i = 0; i < cedulasEMoedasEmCentavos.length; i++) {
            if(cedulasEMoedasEmCentavos[i] > 100) {
                if(cedulasEMoedasEmCentavos[i] == 10000) {
                    System.out.println("NOTAS:");
                }
                System.out.println(String.format("%d nota(s) de R$ %.2f", quantidadeDeCelulasEMoedas[i], cedulasEMoedasEmCentavos[i] / 100));
            } else {
                if(cedulasEMoedasEmCentavos[i] == 100) {
                    System.out.println("MOEDAS:");
                }
                System.out.println(String.format("%d moeda(s) de R$ %.2f", quantidadeDeCelulasEMoedas[i], cedulasEMoedasEmCentavos[i] / 100));
            }
        }
    }
}