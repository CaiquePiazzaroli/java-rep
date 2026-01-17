package Classes;

class Processador {

    String label = "BXQW!@#$";

    // static: Definindo um método que pertence à classe e não apenas ao objeto
    static void arquitetura() {
        System.out.println("Arquitetura x64");
        System.out.println(this.label);
    }
}

public class Aula8ModificadoresStatic {
    public static void main(String[] args) {

        // Não é preciso instanciar uma classe Processador para usar o método arquitetura()
        Processador.arquitetura(); // Arquitetura x64
    }
}
