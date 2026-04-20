package ClassesWrapper;

import java.nio.channels.Pipe.SourceChannel;

public class Aula004ComparandoDoisNumeros {
    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 10;
        
        // Se n1 > n2 retorna 1
        // Se n1 < n2 retorna -1
        // Se n1 == 2 retorna 0
        int comparacao = Integer.compare(n1, n2); 
        System.out.println(comparacao); // 1


        Integer numeroInteiro1 = Integer.valueOf(41);
        Integer numeroInteiro2 = Integer.valueOf(33);

        // Se numeroInteiro1 > numeroInteiro2 retorna 1
        // Se numeroInteiro1 < numeroInteiro2 retorna -1
        // Se numeroInteiro1 == numeroInteiro2 retorna 0
        System.out.println(numeroInteiro1.compareTo(numeroInteiro2));
    }
}
