package Sintaxe;
public class Aula6PrintandoVariaveis {
    public static void main(String[] args) {
        
        // Imprimindo String
        String name = "Caique";
        System.out.println(name); //Caique

        // Usando o + para concatenar strings
        String sobrenome = " Mendes";
        System.out.println(name + sobrenome); // Caique mendes

        // Exemplo de utilização do + com numeros
        int n1 = 5;
        int n2 = 6;
        System.out.println(n1 + n2); // 11

        // Exemplo de utilização do + com numero + string
        int n3 = 9;
        int n4 = 7;
        String resultado = "Resultado: ";
        System.out.println(resultado + n3 + n4); // Resultado: 97  (Jeito errado!!!!)

        // Jeito correto de usar string com numero
        System.out.println(resultado + (n3 + n4)); // Resultado: 16

    }
}
