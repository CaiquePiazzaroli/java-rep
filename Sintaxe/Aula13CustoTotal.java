package Sintaxe;
public class Aula13CustoTotal {
    public static void main(String[] args) {
        // Exercicio de calular o valor total de uma compra
        // Cada item custa 9,99 R$
        // Foram comprado 47 itens
        // Calcule o valor total a se pagar
        int quantidadeItens = 47;
        double valorUnitario = 9.99d;

        System.out.println("O valor total dos itens é: " + (quantidadeItens * valorUnitario) + " R$");
    }
}
