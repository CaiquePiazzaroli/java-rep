package Classes;

class PersonEncapsulamento {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}



public class Aula10Encapsulamento {
    public static void main(String[] args) {
        
        // Instanciando uma classe do tipo PersonEncpsulamento
        PersonEncapsulamento pe = new PersonEncapsulamento();
        
        // Executando o método getNome()
        System.out.println(pe.getNome()); // null

        // Usando o método setNome para atribuir um valor para a variavel nome
        pe.setNome("Caique");
        System.out.println(pe.getNome()); // Caique

        // Tentando atribuir valores a variavel nome diretamente (Erro)
        // pe.nome = "Joao";
        
    }
    
}
