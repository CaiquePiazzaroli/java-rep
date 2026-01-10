public class Aula25EstruturaDeDecisao {
    public static void main(String[] args) {
        boolean estaChovendo = true;

        // Exemplo de utilização de if
        if(estaChovendo) {
            System.out.println("Levar guarda chuva");
        }

        // Exemplo de utilização de if sem as chaves
        // Só funciona para a primeira linha
        if(estaChovendo) 
            System.out.println("Levar guarda chuva sem chaves - dentro do if");
            System.out.println("Fora do if");


        // Exemplo com if e else
            boolean isRaining = false;

        if (isRaining) {
        System.out.println("Bring an umbrella!");
        } else {
        System.out.println("No rain today, no need for an umbrella!");
        }


        // Usando o else if
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
        System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
        System.out.println("Wear sunglasses.");
        } else {
        System.out.println("Just go outside normally.");
        }
        // Outputs "Wear sunglasses."
        
        // Usando if ternário
        String ifTernario = (4 > 10) ? "sim" : "Não";
        System.out.println(ifTernario); // não
    }
}
