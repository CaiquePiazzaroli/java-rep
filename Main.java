public class Main {
    public static void main(String[] args) {

        boolean b1 = false; // 1 bit
        
        byte n1 = 127; // 8 bits ou 1 Byte
        byte n2 = -128; 
        
        short n3 = -32768; // 16 bits ou 2 Bytes
        short n4 = 32767;
        char c1 = 'b'; // 16 bits => aspas simples

        int n5 = 80545; // 32 bits ou 4 Bytes -2bi até +2bi
        float n6 = 7.55687789f; // 32 bits ou 4 Bytes => 6 casas decimais de precisao
        System.out.println(n6);


        long n7 = 43901273816L; // 64 bits ou 8 Bytes
        double n8 = 7.55687789; // 64 bit ou 8 Bytes => Alta precisao de casas decimais
        
    }
}
