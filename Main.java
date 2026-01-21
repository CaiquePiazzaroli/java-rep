import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        
        if(numero < 0.0000 && numero > 100.0000) {
            System.out.println("Fora do intervalo");
        } 

        if(numero >= 0.0000 && numero <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        }

        if(numero >= 25.0001 && numero <= 50.0000) {
            System.out.println("Intervalo (25,50]");
        }

        if(numero >= 50.0001 && numero <= 75.0000) {
            System.out.println("Intervalo (50,75]");
        }

        if(numero >= 75.0001 && numero <= 100.0000) {
            System.out.println("Intervalo (75,100]");
        }
    }
}