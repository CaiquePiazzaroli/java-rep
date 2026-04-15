public class Main {

  public static void main(String[] args) {
    
    // O valor da soma não será preciso nesse caso
    double numero1 = 0.2;
    double numero2 = 0.1;
    System.out.println(numero1 + numero2); // 0.30000000000000004

    // Somando o mesmo valor 10x
    double numero3 = 0.2;
    double resultado = 0.0;
    for (int i = 0; i < 10; i++) {
      resultado += numero3;
    }
    System.out.println(resultado); // 1.9999999999999998 e não 2.0 
  }
}
