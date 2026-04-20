package ClasseStringBuilder;

public class Aula002InstanciandoStringsBuilder {
    public static void main(String[] args) {
        

        // Criando Um StringBuilder Vazio com capacidade inicial padrão
        StringBuilder sb = new StringBuilder();
        System.out.println(sb); // Vazio

        // Passando um valor inicial
        StringBuilder sb1 = new StringBuilder("java");
        System.out.println(sb1); // java

        // Definindo a capacidade inicial
        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2); // Vazio

        // A partir de uma String
        String texto = "java";
        StringBuilder sb3 = new StringBuilder(texto);
        System.out.println(sb3); // java

    }
}
