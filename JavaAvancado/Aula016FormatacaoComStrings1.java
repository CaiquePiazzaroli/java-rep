package JavaAvancado;

import java.time.LocalDate;

public class Aula016FormatacaoComStrings1 {
    public static void main(String[] args) {

        String nome = "Caique kevin piaçaroli"; // Deve ter no maximo 30 caracteres e ser alinhado a esquerda
        Integer matricula = 1032; // Deve totalizar 6 caracteres e preencher os vazios com 0
        Double salario = 10497.32; // Deve conter marcação de milhar e duas casas decimais e ter 15 espaços
        LocalDate data = LocalDate.now(); // Deve estar no formatod de dd/mm/yyyy e usar apenas uma variavel no argumento

        String stringFormatada = String.format(
                "%-30.30s - %06d - %,15.2f R$ - %td/%<tm/%<tY"
                ,nome, matricula, salario, data);

        System.out.println(stringFormatada);

    }
}
