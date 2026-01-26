package Erros;

public class Aula02ThrowException {
    static void verificarIdade(int idade) {
        if(idade < 18) {
            throw new ArithmeticException("Acesso negado - Menor de 18 anos");
        }
        System.out.println("Acesso permitido - divirta-se");
    }
    public static void main(String[] args) {
        try{
            verificarIdade(14);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no código: " + e);
        }
    }
}
