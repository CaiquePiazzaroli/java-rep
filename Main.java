import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if(numero > 0) {
                positivos++;
            } else if(numero < 0) {
                negativos++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
        
        sc.close();
    }
}