package JavaAvancado;

interface InterfaceString {
    String run(String texto); 
} 

class FormatadorDeTexto {
    String formatar(String texto, InterfaceString formatador) {
        return formatador.run(texto);
    }
}


public class Aula012ExpressoesLambdasEmParametrosDeMetodos {
    public static void main(String[] args) {

        // Criando os formatadores
        InterfaceString formatadorExclamacao = (s) -> s + "!!!";
        InterfaceString formatadorInterrogacao = (s) -> s + "???";

        // Instanciando a classe formatadora
        FormatadorDeTexto formatador = new FormatadorDeTexto();

        // O método formatar recebe como parametro uma string e uma função lambda 
        String textoFormatadoEx = formatador.formatar("Olá mundo", formatadorExclamacao);
        System.out.println(textoFormatadoEx);

        // O método formatar recebe como parametro uma string e uma função lambda 
        String textoFormatadoInt = formatador.formatar("Olá mundo", formatadorInterrogacao);
        System.out.println(textoFormatadoInt);
    }
}