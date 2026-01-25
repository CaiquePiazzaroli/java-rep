import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constante mantida (ótima prática)
        final int TOTAL_HORAS_DIA = 24;

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        // Boa prática: Fechar o scanner assim que não precisar mais dele
        sc.close(); 

        // Cálculo inicial simples
        int duracao = horaFinal - horaInicial;

        // Se a duração for menor ou igual a zero (ex: começou 22 e terminou 2, ou começou 10 e terminou 10)
        // Significa que virou o dia ou durou 24h completas.
        if (duracao <= 0) {
            duracao += TOTAL_HORAS_DIA;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}