package Classes;

class AnimalAula20ClassesAnonimas {
    public void makeSound() {
        System.out.println("ANIMAL TERRESTRE FAZENDO BARULHO");
    }
}

interface VeiculoAula20ClassesAnonimas {
    void acelerar();
}


public class Aula20ClassesAnonimas {
    public static void main(String[] args) {
        // Criando uma classes anonima
        AnimalAula20ClassesAnonimas animalMarciano = new AnimalAula20ClassesAnonimas() {
            public void makeSound() {
                System.out.println("Em marte, animais fazer um barulho estranho....");
            }
        };
        animalMarciano.makeSound();


        // Criando uma classe anonima que implementa uma interface
        VeiculoAula20ClassesAnonimas veiculoEspacial = new VeiculoAula20ClassesAnonimas() {
            public void acelerar() {
                System.out.println("Veiculo espacial acelerando...");
            }
        };
        veiculoEspacial.acelerar();
    }
}


