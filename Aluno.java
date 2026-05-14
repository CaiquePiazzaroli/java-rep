public class Aluno {
    private String nome;
    private double nota;


    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
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
        // TODO Auto-generated method stub
        return this.nome;
    }
}
