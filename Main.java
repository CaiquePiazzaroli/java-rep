import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int valor = sc.nextInt();
        int count = 0;
     
        while(count < 6)  {
            if(valor % 2 != 0) {
                System.out.println(valor);
                count++;
            }
            valor++;
        }

        sc.close();
    }
}