package Sintaxe;

public class Aula9TiposDeDados {
    public static void main(String[] args) {
        System.out.println("Tipos de dados");

        // Type boolean
        boolean myBool = true;  // Boolean
        System.out.println(myBool); // True
        boolean myBool2; // OK variavel sem valor
        System.out.println(myBool2); // ERRO: variavel não inicializada

        // Type byte
        byte myByte = -128; // Byte pode ser armazenar do -128 até o 127
        byte myByte2 = -129; // ERRO: pois vai além do tramanho do byte
        byte myByte2 = 128; // ERRO: pois vai além do tamanho do byte
        byte myByte3;
        System.out.println(myByte3); // ERRO: Variavel não inicializada

        // char
        char myLetter = 'D'; // OK cria uma variavel char
        System.out.println(myLetter); // OK: D
        char myLetter1 = 'c'; // OK cria uma variavel char
        System.out.println(myLetter1); // OK: c
        char myLetter2;
        System.out.println(myLetter2); // ERRO: Variavel não inicializada

        // Short
        short myShort = -32768; // OK
        System.out.println(myShort); // OK: -32768
        short myShort1 = 32767; // OK
        System.out.println(myShort1); // OK: 32767
        short myShort2 = -32769; // ERRO: extrapola o tamanho do tipo de dado
        short myShort3 = 32768; // ERRO: extrapola o tamanho do tipo de dado
        short myShort4;
        System.out.println(myShort4); // ERRO: variavel nãi inicializada

        // int
        int myInt = 2147483647; // Ok 
        int myInt1 = 2147483648; // ERRO: fora do limite Limite
        int myInt2 = -2147483648; // OK dentro do limite
        int myInt3 = -2147483649; // ERRO: fora do limite Limite
        int myInt4;
        System.out.println(myInt4); // ERRO: variavel nao inicializada

        // Float
        float myFloat = 79.9f; // OK
        System.out.println(myFloat); // OK
        float myFloat1 = -1235.4654f; //OK
        System.out.println(myFloat1);
        float myFloat2 = 13456.465487987987f; // OK 
        System.out.println(myFloat2); // ARREDONDA PARA CIMA por causa da baixa precisao: 13456.466
        float myFloat4;
        System.out.println(myFloat4); // ERRO: variavel nao inicializada
        float myFloat5 = 10.00; // Erro de compilação (faltou o sufixo f)

        // Long 
        long myLong = 5465798798798798879L; // OK
        long myLong1 = 65465798798798; // ERRO de compilação pois falto o L

        // double
        double myDouble = 4.99; // OK
        System.out.println(myDouble); // OK
        double myDouble1 = 4.999789798; // OK
        System.out.println(myDouble1); // OK imprime corretamente devido a precisao
        double myDouble3 = 0.2;
        double myDouble4 = 0.3;
        System.out.println(myDouble3 + myDouble4);

        // String
        String nome = "Caique Mendes";
        System.out.println(nome);

    }
}

