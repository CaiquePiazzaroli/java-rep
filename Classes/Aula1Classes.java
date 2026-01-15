package Classes;

public class Aula1Classes {
  int x = 5;
  String name = "Aula1Classes";
  public static void main(String[] args) {

    // Instanciando uma classe por meio de um objeto
    Aula1Classes myObj = new Aula1Classes();
    System.out.println(myObj.x); // 5
    System.out.println(myObj.name); // nome

    // Intanciando a classe Aula1ClassesParteDois
    Aula1ClassesParteDois myObj2 = new Aula1ClassesParteDois();
    System.out.println(myObj2.x); // 20

    // Modificando atributos da objeto myObj2
    myObj2.x = 77;
    System.out.println(myObj2.x); // Imprimirá 77 pois o atributo x foi reescrito

    // Tetando reescrever um atributo constrante (Causa ERRO)
    myObj2.nome = "Joao"; // The final field Aula1ClassesParteDois.nome cannot be assigned (ERRO)
  }
}