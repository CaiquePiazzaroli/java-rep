package Classes;

public class Aula21Enums {
    enum EstadoJogador {
        VIVO,
        MORTO,
        FERIDO
    }

    public static void main(String[] args) {
        EstadoJogador estadoJogador = EstadoJogador.FERIDO;

        // Executa quando o enum é ferido
        if (estadoJogador == EstadoJogador.FERIDO) {
            System.out.println("Vida 25%");
        }

        // Executa quando o enum é morto
        if (estadoJogador == EstadoJogador.VIVO) {
            System.out.println("We are alive bitchess!");
        }

        if (estadoJogador == EstadoJogador.MORTO) {
            System.out.println("Se fodeu!");
        }


        switch (estadoJogador) {
            case VIVO:
                System.out.println("Estamos vivios, siga em frente.");
                break;
            case FERIDO:
                System.out.println("Estamos andando lentamente, mas chegaremos lá!");
                break;
            case MORTO:
                System.out.println("Solicitando reforços estmos soldados caidos, repito, soldados caidos!");
                break;
        }

    
        for(EstadoJogador estado: EstadoJogador.values()) {
            System.out.println(estado);;
        }

    }
}
