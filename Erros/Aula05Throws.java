package Erros;

public class Aula05Throws {
    private static boolean situacaoPaga = false;

    // Diz a jvm que quem for usar este método deverá tratar com try catch 
    // ou repassar o erro com o throws
    public static boolean verificarIdadeMaiorQueDezoito(int idade) throws Exception{
        if(idade < 18) {
            throw new Exception("Pessoa menor de 18 anos");
        }
        return true;
    }

    // Esse método chama o método varificarIdadeMaiorQueDezoito e nao usa o try catch
    // nesse caso, deverá repassar o erro
    public static void verificarIdadeESituacaoPaga(int idade) throws Exception{
        if(verificarIdadeMaiorQueDezoito(idade) && situacaoPaga) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Nao pode entrar pois nao pagou");
        }
    } 

    //Por ultimo, a função main chama o verificarIdadeESituacaoPaga 
    // Por isso, deve conter um try catch para tratar o problema
    public static void main(String[] args) {
        try {
            verificarIdadeESituacaoPaga(15);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
