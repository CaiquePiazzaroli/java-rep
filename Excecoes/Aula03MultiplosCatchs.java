package Excecoes;

public class Aula03MultiplosCatchs {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[1]); //2
            int result = 10/0; // ArithmeticException
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        } catch (ArithmeticException  e) {
            System.out.println("Erro: " + e);
        } catch (Exception e) {
            System.out.println("Erro geral: " + e);
        }
    }
}
