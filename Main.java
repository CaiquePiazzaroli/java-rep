import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class AlunoClasse implements Comparable<AlunoClasse>{

    private String nome;
    private Double nota;

    public AlunoClasse(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    

    public String getNome() {
        return nome;
    }



    public Double getNota() {
        return nota;
    }



    @Override
    public int compareTo(AlunoClasse o) {
        if(this.getNota() > o.getNota()) {
            return 1;
        } else if (this.getNota() < o.getNota()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {  
        return this.nome.hashCode();
    }
    
    @Override
    public String toString() {
        return this.nome.toString();
    }
}




public class Main {

    public static void main(String[] args) {

        // Map -> Chave e Valor
        // HashMap -> Sem ordem
        Map<String, Integer> veiculos = new HashMap<>();
    
        // Adiciona
        veiculos.put("ford", 2006);
        veiculos.put("corsa", 2001);
        veiculos.put("hyundai", 2010);
        
        // Resgata
        veiculos.get("corsa");
        
        // Remove
        veiculos.remove("ford");

        // Verifica se existe a chave
        veiculos.containsKey("hyundai");

        // Retorna as chaves
        veiculos.keySet();

        // Retorna os valores
        veiculos.values();

        System.out.println(veiculos);

        // TreeMap -> Ordenado pelas chaves
        Map<String, Integer> veiculosOrdenados = new TreeMap<>();
        veiculosOrdenados.put("ford", 2006); // 2
        veiculosOrdenados.put("corsa", 2001); // 1 
        veiculosOrdenados.put("hyundai", 2010); // 3

        System.out.println(veiculosOrdenados);

        // LinkedHashMap -> Por ordem de inserção
        Map<String, Integer> ordemInsercao = new LinkedHashMap<>();
        ordemInsercao.put("ford", 2006);
        ordemInsercao.put("corsa", 2001); 
        ordemInsercao.put("hyundai", 2010); 

        System.out.println(ordemInsercao);
    }

}
