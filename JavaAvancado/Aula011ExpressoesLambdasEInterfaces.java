package JavaAvancado;

interface StringFunction {
    String run(String str);
}

public class Aula011ExpressoesLambdasEInterfaces {
    public static void main(String[] args) {
        
        // --- FORMA 1: Lambda Tradicional (O "Atalho" moderno) ---
        StringFunction lambdaGrito = (s) -> s.toUpperCase() + "!!!";
        
        
        // --- FORMA 2: "Por debaixo dos panos" (Classe Anônima) ---
        // É assim que o Java interpretava antes das Lambdas existirem
        StringFunction classeGrito = new StringFunction() {
            @Override
            public String run(String s) {
                return s.toUpperCase() + "!!!";
            }
        };

        // Testando ambos (o resultado é idêntico)
        System.out.println(lambdaGrito.run("olá"));   // Saída: OLÁ!!!
        System.out.println(classeGrito.run("olá"));   // Saída: OLÁ!!!
    }
}
