package Classes;

enum EstadoJogadorAula22Construtores {
    VIVO("Vivo", 100),
    MORTO("Morto da silva", 0),
    FERIDO("Ferido", 45);

    private String descricao;
    private int percentualDeVida;

    private EstadoJogadorAula22Construtores(String descricao, int percentualDeVida) {
        this.descricao = descricao;
        this.percentualDeVida = percentualDeVida;
    }

    // Getter method to read the description
    public String getDescricao() {
        return descricao;
    }

    public int getPercentualDeVida() {
        return percentualDeVida;
    }
}

public class Aula22ConstrutoresEnums {
    public static void main(String[] args) {
        EstadoJogadorAula22Construtores myVar = EstadoJogadorAula22Construtores.VIVO;
        System.out.println(myVar.getDescricao());
        System.out.println(myVar.getPercentualDeVida());

        // Iterando sobre o enum
        for(EstadoJogadorAula22Construtores estado: EstadoJogadorAula22Construtores.values()) {
            System.out.println(estado.getDescricao());
        }
    }
}
