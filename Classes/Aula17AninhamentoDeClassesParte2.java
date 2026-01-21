package Classes;

class Externa {
    String name = "Atribto da classe externa";
    
    // Criando uma classe que é estática dentro de outra classe
    public static class Interna {
        public int x = 9;
    }

    public class Interna2 {
        public void refClasseExterna() {
            System.out.println(name);
        }
    }
}


public class Aula17AninhamentoDeClassesParte2 {
    public static void main(String[] args) {
        Externa.Interna ei = new Externa.Interna();
        System.out.println(ei.x); //  9

        Externa ex = new Externa();
        Externa.Interna2 exin2 = ex.new Interna2();
        exin2.refClasseExterna(); // Atributo da classe externa
    }
}
