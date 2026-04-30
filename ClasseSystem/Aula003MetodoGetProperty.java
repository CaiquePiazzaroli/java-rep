package ClasseSystem;

public class Aula003MetodoGetProperty {
    public static void main(String[] args) {
        // Nome do sistema operacioinal 
        String os = System.getProperty("os.name");
        System.out.println(os);

        // Versão do java
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
    }
}
