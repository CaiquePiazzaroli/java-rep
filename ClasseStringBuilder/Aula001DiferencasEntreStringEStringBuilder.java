package ClasseStringBuilder;

public class Aula001DiferencasEntreStringEStringBuilder {
    public static void main(String[] args) {
        
        // Verificando o tempo de concatenacao utilizando String 
        long tStart = System.currentTimeMillis();
        String texto = "";
        for(int i = 0; i < 100000; i++) {
            texto.concat("-x"); // 5 milisecs
        }
        long tEnd = System.currentTimeMillis();
        System.out.println(tEnd - tStart);


        // Verificando o tempo de concatenacao utilizando StringBuilder 
        long tStartBuilder = System.currentTimeMillis();
        StringBuilder textoBuilder = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            textoBuilder.append("-x");
        }
        long tEndBuilder = System.currentTimeMillis();
        System.out.println(tEndBuilder - tStartBuilder); // 2 milisecs (menor)



    }
}
