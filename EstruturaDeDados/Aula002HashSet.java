package EstruturaDeDados;

import java.util.HashSet;

public class Aula002HashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Volvo");
        hashSet.add("Ford");
        hashSet.add("Ford");
        System.out.println(hashSet);
    }
}
