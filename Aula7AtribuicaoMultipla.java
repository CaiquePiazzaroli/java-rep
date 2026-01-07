public class Aula7AtribuicaoMultipla {
    public static void main(String[] args) {
        // Criando varias variaveis do mesmo tipo em uma unica linha
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z); // 61


        // Atribuindo um mesmo valor para 3 variaveis ao mesmo tempo
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c); // 150
    }
}
