import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosEmOrdemDeEntrada = new int[3];
        int[] numerosCrescentes = new int[3];
        int posUm = 0, posDois = 1, posTres = 2, posTemporaria;

        for(int i = 0; i < numerosEmOrdemDeEntrada.length; i++) {
            numerosEmOrdemDeEntrada[i] = sc.nextInt();
            numerosCrescentes[i] = numerosEmOrdemDeEntrada[i];
        }

        if(numerosCrescentes[posUm] > numerosCrescentes[posDois]) {
            posTemporaria = numerosCrescentes[posDois];
            numerosCrescentes[posDois] = numerosCrescentes[posUm];
            numerosCrescentes[posUm] = posTemporaria;
        }

        if(numerosCrescentes[posDois] > numerosCrescentes[posTres]) {
            posTemporaria = numerosCrescentes[posTres];
            numerosCrescentes[posTres] = numerosCrescentes[posDois];
            numerosCrescentes[posDois] = posTemporaria;
        }

        if(numerosCrescentes[posUm] > numerosCrescentes[posDois]) {
            posTemporaria = numerosCrescentes[posDois];
            numerosCrescentes[posDois] = numerosCrescentes[posUm];
            numerosCrescentes[posUm] = posTemporaria;
        }

        System.out.println(numerosCrescentes[posUm]);
        System.out.println(numerosCrescentes[posDois]);
        System.out.println(numerosCrescentes[posTres]);

        System.out.println("");

        System.out.println(numerosEmOrdemDeEntrada[posUm]);
        System.out.println(numerosEmOrdemDeEntrada[posDois]);
        System.out.println(numerosEmOrdemDeEntrada[posTres]);

    }
}