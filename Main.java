import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> nomes = new TreeSet<>();
        nomes.add("caique");
        nomes.add("joao");
        nomes.add("maria");
        nomes.add("ana");

        for(String e : nomes) {
            System.out.println(e);
        }

    }    
  
      
}
