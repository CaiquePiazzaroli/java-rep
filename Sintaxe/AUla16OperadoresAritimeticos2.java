package Sintaxe;

public class AUla16OperadoresAritimeticos2 {
    public static void main(String[] args) {
        

        String concatenacao ="?"; 
        System.out.println(concatenacao); // ?

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // 1 + 1 + 1  = 3 e concatena com o 1 = 31

        concatenacao = 1+"1"+1+1; 
        System.out.println(concatenacao);  // 1 + "1" (concatena até o fim)

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1 + "1" = "11" + 1 = "111" + "1" = "1111" 

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // "1111"

        // "1" (1 + 1 + 1) = 3 => "1" + 3 = "13"
        concatenacao = "1"+(1+1+1); // "13"
        System.out.println(concatenacao);

    }
}
