
public class Main {

    public static void main(String[] args) {

         try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[7]); //2
            int result = 10/0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        } catch (ArithmeticException  e) {
            System.out.println("Erro : " + e);
        } catch (Exception e) {
            System.out.println("Erro geral: " + e);
        }

    }    
  
      
}
