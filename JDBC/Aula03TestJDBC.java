public class Aula03TestJDBC {
    public static void main(String[] args) {
        try {
            //Carrega o driver especificado
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!"+e);
        }
    }
}
