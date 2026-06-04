package JavaAvancado;

public class Aula15FormatacaoComStrings {
    public static void main(String[] args) {

        String nome = "Caique";
        String sobrenome = "Mendes";
        Integer idade = 29;
        Double peso = 70.0;
        Double salario = 2499.45;

        String textoFormatado = String
                .format("Eu me chamo %s %s tenho %d anos, peso %.2f kg e tenho uma renda de %,.2f R$",
                        nome, sobrenome, idade, peso, salario);
        
        System.out.println(textoFormatado);
    }
}
