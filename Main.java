public class Main {
    public static void main(String[] args) {

        // Declarei e nao atribuí nenhum valor
        int numero;

        //System.out.println(numero); // Erro: endereço de memória nao foi limpo previamente

        MinhaClasse mc = new MinhaClasse(); 
        System.out.println(mc.numero); // 0 => Endereço de memória foi limpo previamente e atribuido valores padrao
        
    }
}

class MinhaClasse {
    public int numero;
}
