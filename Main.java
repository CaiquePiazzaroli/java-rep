import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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

        // Set -> Conjuntos -> Não possuem elementos repetidos

        // HashSet -> Sem ordem
        Set<String> nomes = new HashSet<>();
        nomes.add("Caique Mendes");
        nomes.add("Joao Aparecido");
        nomes.add("Cleide Soares");
        nomes.remove("Joao Aparecido");
        nomes.contains("Caique Mendes");
        nomes.size();
        nomes.clear();

        // TreeSet -> Ordem natural ou pela implementação do compareTo + hashCode
        Set<AlunoClasse> turma = new TreeSet<>();
        turma.add(new AlunoClasse("Caique Mendes", 9.2));
        turma.add(new AlunoClasse("Joao Aparecido", 6.0));
        turma.add(new AlunoClasse("Clotilde Almeida", 7.2));
        turma.add(new AlunoClasse("Joao Guelrras", 4.45));
        System.out.println(turma); // Ordem alfabetica


        // LinkedHashSet -> Por ordem de chegada
        Set<AlunoClasse> turmaOrdemDeChegada = new LinkedHashSet<>();
        turmaOrdemDeChegada.add(new AlunoClasse("Caique Mendes", 9.2));
        turmaOrdemDeChegada.add(new AlunoClasse("Joao Aparecido", 6.0));
        turmaOrdemDeChegada.add(new AlunoClasse("Clotilde Almeida", 7.2));
        turmaOrdemDeChegada.add(new AlunoClasse("Joao Guelrras", 4.45));
        System.out.println(turmaOrdemDeChegada);
    }

}
