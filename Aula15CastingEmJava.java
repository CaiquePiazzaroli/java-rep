public class Aula15CastingEmJava {
    public static void main(String[] args) {

        // Cast implícito ou Widening Casting
        int myint = 9;
        double myDouble = myint; //Nesse caso, o cast é feito implicitamente
        System.out.println(myDouble); //9.0

        // Cast Explícito ou Narrowing Casting
        double tipoMaior = 496.46d;
        int tipoMenor = (int) tipoMaior; //Nesse caso, foi usada o (int) explicitamente para initicar um casting
        System.out.println(tipoMenor); // 496
    }
}
