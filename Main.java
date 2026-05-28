import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Tipos primitivos
		// Valores brutos que sao armazenados na memoria
		// byte, short, int, long (inteiros: 20 30 40), float, double (decimais: 0.2, 15.7),
		// char (caracter: 'c', 'z')
		// boolean (verdadeiro ou falso: true ou false)
		
		Integer estoque = 15;
		Double preco = 3999.99;
		String nomeProduto = "Televisao Smart";
        String data = "07/08/2023"; 
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeFabricacao = LocalDate.parse(data, formatador); // 2023-08-07
        String linha = String.join(" - ", nomeProduto, estoque.toString(), preco.toString(), dataDeFabricacao.toString());
        System.out.println(linha);

        // nio 
        // Files, Path, Paths
    


    }    
  
      
}
