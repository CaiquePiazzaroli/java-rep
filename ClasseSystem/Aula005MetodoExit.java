package ClasseSystem;

public class Aula005MetodoExit {
    public static void main(String[] args) {

        String opcao = "ficar";

        if("sair".equalsIgnoreCase(opcao)) {
            System.out.println("Saindo do sistema");
            System.exit(0);
        }
        
        System.out.println("Ficando no sistema");
    }
}
