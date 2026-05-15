import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue <Aluno> alunos = new PriorityQueue<>();
        alunos.add(new Aluno("Felipe Alves", 10.0 , MeuEnum.ABRIL));
        alunos.add(new Aluno("Marcelo", 10.0 , MeuEnum.JANEIRO));
        alunos.add(new Aluno("Amanda", 10.0 , MeuEnum.MAIO));
        alunos.add(new Aluno("Natanael", 10.0 , MeuEnum.FEVEREIRO));
        alunos.add(new Aluno("Amorim", 10.0 , MeuEnum.ABRIL));

        System.out.println(alunos.poll()); // Marcelo
        System.out.println(alunos.poll()); // Natanael 2
        System.out.println(alunos.poll()); // Felipe Alves 4
        System.out.println(alunos.poll()); // Amorim 4
        System.out.println(alunos.poll()); // Amanda 5
        
    }
}
