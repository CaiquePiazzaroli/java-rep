package JavaAvancado;

class Caixa<T> {

    private T coisaNaCaixa;

    public Caixa(T valor) {
        this.coisaNaCaixa = valor;
    }

    public T getCoisa() {
        return coisaNaCaixa;
    }

    public static <T> void listarArray(T[] array) {
        for(T item: array) {
            System.out.println(item);
        }
    }
}

public class Aula002Generics {
    public static void main(String[] args) {
        Caixote<String> caixaString = new Caixote<String>("Uma String na caixa");
        System.out.println(caixaString.getCoisa());

        Caixote<Integer> caixaInteger = new Caixote<Integer>(10);
        System.out.println(caixaInteger.getCoisa());

        Integer[] array = {1, 2, 3, 4, 5};
        Caixote.listarArray(array);
    }
}
