public class Main {
    public static void main(String[] args) {

        // Operadores Aritiméticos
        // + - / * %
        System.out.println(4 + 2); // 6
        System.out.println(5 - 3); // 2
        System.out.println(17 / 3); // 5 (promoção binária numérica => todos sao inteiros => inteiro)
        System.out.println(5 * 4); // 20
        System.out.println(19 %  5); // 4 (resto da divisao)

        // Ordem de precendencia, Promoção binaria numérica e cast
        double n1 = 3 / 10; // => 3 / 10 (inteiro) 0 => 0.0 (convertido e armazenado na var)
        System.out.println(n1); // 0.0
        double n2 = (double) 3 / 10; // => 3 (convertido para 3.0) / 10 => 0.3 (promoção binária numérica)
        System.out.println(n2); // 0.3
        double n3 = (double) (3 / 10); // ordem de precedencia (3/10 => 0) => (conversao) 0 => 0.0 (armazenado)
        System.out.println(n3); // 0.0

        // Concatenação de strings
        // 1+1+1+"1";
        System.out.println(1 + 1 + 1 + "1" ); // Soma os 3 primeiros 1 e depois concatena o ultimo => 31
        //1+"1"+1+1; 
        System.out.println(1 + "1" + 1 + 1 ); // A partir do segundo 1 ele começa a concatenar => 1111
        // 1+"1"+1+"1";
        System.out.println(1 + "1" + 1 + "1" ); // A partir do segundo 1 ele começa a concatenar => 1111
        //"1"+1+1+1;
        System.out.println("1" + 1 + 1 + 1); // Concatena dede o primeiro elemento => 1111
        //"1"+(1+1+1);
        System.out.println("1" + (1 + 1 + 1)); // Ex os parenteses (1 + 1 + 1) = 3 concatena com o numero um => "1" + 3 => 13


        // Operadores de comparação
        // == (igual), != (diferente), > (maior que), < (menor que), >= (maior ou igual), <= (menor ou igual)
        System.out.println(5 == 5); // true
        System.out.println(5 != 5); // false
        System.out.println(5 > 5); // false
        System.out.println(6 < 5); // false
        System.out.println(6 <= 5); // false
        System.out.println(6 >= 5); // true


        // Operadores lógicos
        System.out.println(2 > 4 || 7 > 3); // Retorna true se um ou outra expressão for veraddeira > true
        System.out.println(2 > 4 && 7 > 3); // Retorna true ambas expressoes forem veraddeiras > false
        System.out.println(!(2 > 4)); // Inverte o valor lógico > true

        // Operadores de atribuição
        // =, +=, -=, /=, *=, %=
        int numero = 10;
        numero += 4; // => numero = numero + 4
        System.out.println(numero); // 14
        numero -= 4; // => numero = numero - 4
        System.out.println(numero); // 14 - 4 => 10
        numero *= 4; // => numero = numero * 4
        System.out.println(numero); // 14 * 4 => 40
        numero /= 4; // => numero = numero / 4
        System.out.println(numero); // 40 / 4 => 10
        numero %= 4; // => numero = numero * 4
        System.out.println(numero); // 10 % 4 => 2

        // Operadores unários
        // ++ e -- => incrementam e decrementam valores
        int numero2 = 40;
        numero2++;
        System.out.println(numero2); // 41
        numero2--;
        System.out.println(numero2); // 40

        System.out.println(numero2++); // 40
        System.out.println(numero2); // 41

        System.out.println(--numero2); // 40
        System.out.println(numero2); // 40

        // Operador ternário
        // (cond) ? se true : se false => atribui valor a uma variavel dinamicamente
        int idade = 32;
        String apto = (idade > 18) ? "Pode passar" : "nao pode passar";
        System.out.println(apto); // Pode passar

        

    }
}

class MinhaClasse {
    public int numero;
}
