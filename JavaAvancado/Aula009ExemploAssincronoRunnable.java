package JavaAvancado;

class RunnableAssincrono implements Runnable {

    @Override
    public void run() {
        System.out.println("Metodo assincrono rodando");
    }

}

class Aula009MetodoSincrono {
    void run() {
        System.out.println("Metodo sincrono rodando");
    }
}


public class Aula009ExemploAssincronoRunnable {
    public static void main(String[] args) {
        // Sincrono
        double inicioS = System.currentTimeMillis();
        Aula009MetodoSincrono ms = new Aula009MetodoSincrono();
        ms.run();
        double finalS = System.currentTimeMillis();
        System.out.println("Tempo de corrido: " + (finalS - inicioS) + "ms");


        // Assincrono
        // Criando uma classe implementada por Runnable
        RunnableAssincrono ra = new RunnableAssincrono();

        // Passando a classe para o construtor thread 
        Thread thread = new Thread(ra);
    
        double inicioAss = System.currentTimeMillis();
        // Iniciando uma nova thread
        thread.start();
        double fimAss = System.currentTimeMillis();
        System.out.println("Tempo de corrido: " + (fimAss - inicioAss) + "ms");

        
        

    }
}
