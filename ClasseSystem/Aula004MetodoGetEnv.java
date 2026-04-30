package ClasseSystem;

class Aula004MetodoGetEnv {

    public static void main(String[] args) {

        // Listando as variaveis de ambiente do sistema
        String path = System.getenv("JAVA_HOME");
        System.out.println(path);

    }
}