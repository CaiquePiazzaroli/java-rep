package ClasseString;

public class Aula004MetodosIsBlankEIsEmpty {
    public static void main(String[] args) {
        String vazio = "";
        String espaco = " ";
        String vazioNew = new String();
        String nulo = null;

        System.out.println(vazio.isBlank()); // true
        System.out.println(espaco.isBlank()); // true 
        System.out.println(vazioNew.isBlank()); // true
        // System.out.println(nulo.isBlank()); // NullPointerException

        System.out.println(vazio.isEmpty()); // true
        System.out.println(espaco.isEmpty()); // false - pois tem espaço 
        System.out.println(vazioNew.isEmpty()); // false - nao tem nada na string
        // System.out.println(nulo.isEmpty()); // NullPointerException


    }
}
