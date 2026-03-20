package JavaAvancado;

class DeprecatedClass {

    @Deprecated
    void showInfo() {
        System.out.println("odiahwioduha");
    }
}

public class Aula005NotationsDeprecated {
    public static void main(String[] args) {
        DeprecatedClass dep = new DeprecatedClass();
        dep.showInfo();
    }
}
