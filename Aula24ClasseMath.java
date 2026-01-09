public class Aula24ClasseMath {
    public static void main(String[] args) {
        
        // Maior entre dois numeros
        int maior = Math.max(10, 7); 
        System.out.println(maior); // 10

        // Menor entre dois numeros
        int menor = Math.min(49, 32);
        System.out.println(menor); // 32

        // Raiz quadrada de um número
        double raiz = Math.sqrt(64);
        System.out.println(raiz); // 8.0

        // Valor absoluto de um número
        double absoluto = Math.abs(-4.8);
        System.out.println(absoluto); // 4.8

        // Potência de x elevado a y
        double potencia = Math.pow(2,8);
        System.out.println(potencia); // 256.0

        // Arendodando para o inteiro mais proximo
        long arrendodado = Math.round(4.6);
        System.out.println(arrendodado); //5

        // Arrendodando para cima
        double arrendodandoParaCima = Math.ceil(4.7);
        System.out.println(arrendodandoParaCima); // 5.0

        // Arrendodando para baixo
        double arrendodandoParaBaixo = Math.floor(4.7);
        System.out.println(arrendodandoParaBaixo); // 4.0

        // Gerando um número aleatório entre 0.0 e 1.0 (não incluso)
        double numeroAlaatorio = Math.random();
        while (numeroAlaatorio < 0.7) {
            System.out.println(numeroAlaatorio);
            numeroAlaatorio = Math.random();
        }

        // Gerando um número aleatório entre 0 e 99
        double aleatorioEntre0e100 = Math.random();
        aleatorioEntre0e100 *= 100;
        System.out.println(aleatorioEntre0e100);

    }
}
