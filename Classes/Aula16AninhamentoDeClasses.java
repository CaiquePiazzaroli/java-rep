package Classes;

class OuterClass {
    int x = 10;


    class InnerClass {
        int y = 5;
    }

    // Ou tambem ppode ser privada ou protected
    //   private class InnerClass {
    //     int y = 5;
    //   }
}

public class Aula16AninhamentoDeClasses {
    public static void main(String[] args) {

        // Instancia um objeto de Outerclass
        OuterClass myOuter = new OuterClass();

        // Instancia um novo objeto mas agora usando o objeto MyOuter
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        // Imprimindo os valores de ambos objetos
        System.out.println(myInner.y + myOuter.x);
    }
}
