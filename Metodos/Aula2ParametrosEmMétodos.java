package Metodos;

public class Aula2ParametrosEmMétodos {
    
    // Criando um método que recebe o argumento name e printa na tela
    static void myMethod(String name) {
        System.out.println(String.format("Meu nome é %s", name));
    }

    // Criando um método que recebe múltiplos parametros
    static void myMultiParamMethod(String name, int age) {
        System.out.println(String.format("Meu nome é %s e eu tenho %d anos", name, age));
    }

    // Exemplo de método: Checagem de idade
    static void checkAge(int age) {
        if(age >= 18) {
            System.out.println("Você pode entrar na festa!");
        } else {
            System.out.println("Não é permitida a entrada de menores de idade na festa :( !");
        }
    } 

    public static void main(String[] args) {
        myMethod("Caique"); // Meu nome é Caique
        myMethod("Marcia"); // Meu nome é Marcia
        myMethod("Eduardo"); // Meu nome é Eduardo

        myMultiParamMethod("Nicolau", 18);

        checkAge(17);
    }
}
