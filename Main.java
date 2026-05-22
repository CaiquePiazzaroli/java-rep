
public class Main {
    public static void main(String[] args) {

        // while
        int count = 1;
        while (count < 10) {
            System.out.println("While >> " + count);
            count++;
        }

        // dowhile executa pelo menos 1x
        do {
            System.out.println("Do while >> " + count);
            count++;
        } while (count < 10);


        // for
        for(int i = 0; i < 5; i++) {
            System.out.println("For: " + i);
        } 


        // for each
        String[] nomes = new String[] {"Joao", "Maria", "José", "Desconhecido", "Cleide", "Lindomar", "Daniel"};
        for(String nome : nomes) {

            // Continue Pula para proxmia iteração
            if(nome.equalsIgnoreCase("desconhecido")) continue;


            // Break Encerra
            if(nome.equalsIgnoreCase("CLEIDE")) {
                System.out.print("Achamos a Cleide - ");
                System.out.println("Nome: " + nome);
                break;
            };

            
            System.out.println(nome);
        }
        

    }
}
