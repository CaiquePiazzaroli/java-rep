package JavaAvancado;

class Caixote<T extends Number> {
    
    T itemNaCaixa;
    
    public Caixote(T valor) {
        this.itemNaCaixa = valor;
    }

    public T getItemNaCaixa() {
        return itemNaCaixa;
    }
}

public class Aula003Generics {
    public static void main(String[] args) {
        Caixote<Integer> caixaDeNumeros = new Caixote<>(10);
        System.out.println(caixaDeNumeros.getItemNaCaixa());

        Caixote<String> caixaDeString = new Caixote<>("string"); // The type String não é valido
    }
}
