package Sintaxe;
public class Aula32BreakEContinue {
    public static void main(String[] args) {
        // Usando o break
        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if(i == 75) {
                System.out.println("O valor de i é " + i + " parando o loop");
                break;
            }
        }

        // Usando o continue
        for(int i = 1; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println("O valor de i é " + i + " pulando o loop");
                continue;
            }
            System.out.println("loop rodou pela " + i + "°" + " vez");
        }
    }
}
