package JavaAvancado;

class TarefaPesadaAssincrona extends Thread {
    @Override
    public void run() {
        // Simulando um trabalho pesado em segundo plano
        System.out.println("Executando classe assincrona");
        long i = 0;
        while (i < 999_999_999L) { i++; }
    }
}

class TarefaPesadaSincrona {
    public void run() {
        // Simulando trabalho Sincrono
        System.out.println("Executando classe Sincrona");
        long i = 0;
        while (i < 999_999_999L) { i++; }
    }
}

public class Aula008ExemploAssincronoThread {
    public static void main(String[] args) {
        
        // Classe Assincrona
        double inicioSin = System.currentTimeMillis();
        TarefaPesadaSincrona ts = new TarefaPesadaSincrona();
        ts.run();
        double fimSin = System.currentTimeMillis();
        System.out.println("Tempo Síncrono: " + (fimSin - inicioSin) + "ms");

        // Classe Assincrona
        double inicioAssin = System.currentTimeMillis();
        TarefaPesadaAssincrona thread = new TarefaPesadaAssincrona();
        thread.start(); // Chama-se o método Start da função assincrona e não a run
        double fimAssin = System.currentTimeMillis();
        System.out.println("Tempo no Main (Assíncrono): " + (fimAssin - inicioAssin) + "ms");
    }
}