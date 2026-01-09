public class Aula21ObjetoStringConcatenacao {
    public static void main(String[] args) {
        // Usando o método concat para concatenar strings
        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);

        // É SEMPRE MAIS COMUM utilizar o + para concatenar strings
        String nome = "Caique";
        String sobrenome = " Mendes";
        System.out.println(nome + sobrenome); // Caique Mendes
    }
}
