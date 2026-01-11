package Sintaxe;
public class Aula26OperadoresLogicosEIfs {
    public static void main(String[] args) {
        int graus = 25;
        boolean estaNublado = true;

        // (&&) Executa apenas se ambas forem verdadeiras
        if(graus > 25 && estaNublado) {
            System.out.println("Operador && executada");
        }

        // (||) Executa se pelo menos uma condição é true
        if(graus > 25 || estaNublado) {
            System.out.println("Operador || executada");
        }

        // (!) Inverte o valor de um booleano
        // graus > 25 é false, mas fica true pois tem o ! na frente
        if(!(graus > 25) && estaNublado) {
            System.out.println("Operador && executada por causa do !");
        }
    }
}
