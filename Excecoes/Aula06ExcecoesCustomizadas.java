package Excecoes;

public class Aula06ExcecoesCustomizadas {

    public static void exibirNome(String nome) throws ExcecaoCustomizadaException {
        if(nome.contains("c")) 
            throw new ExcecaoCustomizadaException();

        System.out.println("OK ".concat(nome));
    }

    public static void exibirHabilidadeTecnica(String habilidade) throws ExcecaoCustomizada1Exception {
        if(habilidade.contains("dormir")) 
            throw new ExcecaoCustomizada1Exception();

        System.out.println("OK ".concat(habilidade));
    }


    public static void main(String[] args) {

        // Pelo fato de ExcecaoCustomizadaException herdar de RuntimeExeption ela nao precisa ser tratada com try catch
        // exibirNome("caique"); // Lança uma ExececaoCustomizada exception
        exibirNome("kaique"); // OK


        // Obrigada a tratar com try catch pois herda diretamente de Exception
        try {
            exibirHabilidadeTecnica("Programar em java");
        } catch (ExcecaoCustomizada1Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}


class ExcecaoCustomizadaException extends RuntimeException {
    public ExcecaoCustomizadaException() {
        super("Exceçao customizada Exception");
    };
}
 
class ExcecaoCustomizada1Exception extends Exception {
    public ExcecaoCustomizada1Exception() {
        super("Essa nao é uma habilidade técnica valida");
    };
}