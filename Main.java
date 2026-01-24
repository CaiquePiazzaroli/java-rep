import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA, valorB;

        valorA = sc.nextInt();
        valorB = sc.nextInt();
        
        int restoDaDivisaoAPorB = valorB % valorA;
        if(valorA > valorB) {
            restoDaDivisaoAPorB = valorA % valorB;
        }

        if(restoDaDivisaoAPorB == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}