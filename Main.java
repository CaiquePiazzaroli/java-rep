import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Caique", 10);
        Aluno b2 = new Aluno("Caique", 10);
        Aluno c3 = new Aluno("Caique", 10);

        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(a1);
        alunos.add(b2);
        alunos.add(c3);

        System.out.println(alunos); // [Caique, Caique, Caique]
    }
}
