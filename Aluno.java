public class Aluno implements Comparable<Aluno>{
    private String nome;
    private double nota;
    private MeuEnum mesEntrada;


    Aluno(String nome, double nota, MeuEnum mesEntrada) {
        this.nome = nome;
        this.nota = nota;
        this.mesEntrada = mesEntrada;
    }
    
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public MeuEnum getMesEntrada() {
        return mesEntrada;
    }

    @Override
    public boolean equals(Object obj) {
        // Dois alunos serão considerados iguais quando seus nomes forem iguais
        Aluno aluno = (Aluno) obj;
        return this.getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        // O hashCode de aluno será representado pelo hashCode do nome dele
        return this.nome.hashCode();
    }


    @Override
    public String toString() {
        return this.nome + " " + this.mesEntrada.getNumeroMes();
    }

    @Override
    public int compareTo(Aluno o) {
        return this.mesEntrada.getNumeroMes().compareTo(o.getMesEntrada().getNumeroMes());
    }
}
