import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));
        
        // Criando um diretório -> C:\revisaofiles
        Path diretorio = Path.of("C:", "revisaoFiles");
        if (!Files.exists(diretorio)) {
            try {
            Path criado = Files.createDirectory(diretorio);
            System.out.println("O a pasta foi criada: " + criado);
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("O diretório ja existe!");
        }
        
        // Criando um arquivo -> C:\revisaofiles\meuArquivoDeRevisaoOutro.txt
        // diretorio -> C:\revisaoFiles
        // resolve("meuarquivo.txt") -> C:revisaofiles\meuarquivo.txt (Monta uma url)
        Path caminhoArquivo = diretorio.resolve("meuArquivoDeRevisaoOutro.txt");
        if(!Files.exists(caminhoArquivo)) {
            try {
            Path arquivoCriado = Files.createFile(caminhoArquivo);
            System.out.printf("O arquivo foi criado %s", arquivoCriado.toString());
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("O arquivo ja existe na pasta!");
        }
        

        // Escrevendo no arquivo 
        // Limpa o arquivo e escreve por cima (não concatena com o que ja tem) (writeString)
        String textoASerEscrito = "Olá Mundo!";
        try {
            Files.writeString(caminhoArquivo, textoASerEscrito);
            System.out.println("O Arquivo foi apagado e reescrito com sucesso!");
        } catch (IOException e) {
            System.out.println(e);
        }


        // Anexa a string ao final do arquivo (writeString)
        String textoASerEscritoNoFinal = "\nEsta linha foi anexada ao final do arquivo";
        try {
            Files.writeString(caminhoArquivo, textoASerEscritoNoFinal, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("A string foi anexada a o final do arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Anexa uma lista de elementos String ao fim do arquivo (write)
        List<String> marcas = List.of("\nFord", "Honda", "BYD");
        try {
            Files.write(caminhoArquivo, marcas, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("A string foi anexada a o final do arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Leitura de arquivos
        try {
            // Lendo o arquivo inteiro e retornando uma string
            // String leitura = Files.readString(caminhoArquivo);
            // System.out.printf("O conteúdo do arquivo é: %s", leitura);

            // Lendo e retornando com o um array de strings
            // List<String> linhas = Files.readAllLines(caminhoArquivo);
            // int cont = 1;
            // for(String linha: linhas) {
            //     System.out.printf("\n%d - %s", cont++, linha);
            // }

            // Lendo a partir de um fluxo de dados (Stream - Ideal para arquivos grandes)
            try (Stream<String> stream = Files.lines(caminhoArquivo)) {
                stream.filter(e -> e.contains("Ford")).forEach(e -> System.out.println(e.toUpperCase()));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        


    }
}
