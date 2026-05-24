public class Main {
    public static void main(String[] args) {
        
        // Declaração
        int numeros1[];
        int[] numeros2; // -> Mais recomendado!

        // Declaração + inicialização
        int[] numeros3 = new int[5];

        // Lendo array sem atribuição -> Imprime zeros
        for(int numero : numeros3) {
            System.out.println(numero); // 0
        }

        // Atribuindo valores aos elementos do array
        for(int i = 0; i < numeros3.length; i++) {
            numeros3[i] = 10; // 10
        }

        // Re imprimindo o array
        for(int numero : numeros3) {
            System.out.println(numero); // 10
        }


        // Inicialização com valores
        String[] nomes = new String[] {"Caique", "Joao", "Maria"};
        String[] nomes1 = {"Marcelo", "Elisandra", "Jandira"};


        // Acessando elementos
        System.out.println(nomes1[0]);
        System.out.println(nomes1[1]);
        System.out.println(nomes1[2]);
        try {
            
            System.out.println(nomes1[3]); // java.lang.ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Não foi possivel acessar o elemento: " + e);
        }


        // Alterando elemento de um array
        nomes1[2] = "Julaide";
        System.out.println(nomes1[2]); // Julaide

        // Matriz

        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        System.out.println(myNumbers[1][0]);

        // Imprimindo uma matriz
        for(int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // Comparando arrays
        int[] arrayComparativo1 = new int[] {1,2,3};
        int[] arrayComparativo2 = new int[] {1,2,3};
        System.out.println(arrayComparativo1.equals(arrayComparativo2)); // False

    }
}
