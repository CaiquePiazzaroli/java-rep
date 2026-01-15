package Classes;

public class Aula3ConstrutoresDeUmaClasse {
    public static void main(String[] args) {
        Aula1ClassesParteDois c1 = new Aula1ClassesParteDois(); // Executa o contrutor: Essa parte foi executada

        // Usando parametros no construtor de uma classe
        Aula1ClassesParteDois c2 = new Aula1ClassesParteDois("Caique");
        System.out.println(c2.sobrenome); // Caique

    }
}
