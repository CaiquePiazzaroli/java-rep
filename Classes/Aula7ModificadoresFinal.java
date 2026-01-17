package Classes;

class PlacaDeVideo {
    final public String nome = "AMD Radeon 6750XT";
    public int memoria;

    public PlacaDeVideo(int memoria) {
        this.memoria = memoria;
    }
}

public class Aula7ModificadoresFinal {
    public static void main(String[] args) {
       PlacaDeVideo pv = new PlacaDeVideo(4096);
       pv.nome = "Geforce GTX"; // Erro: The final field Aula1ClassesParteDois.nome cannot be assigned
    }
}
