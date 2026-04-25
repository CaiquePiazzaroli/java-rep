package test;

public class TelevisorMarcaX extends Televisor{

    @Override
    public void ligar() {
        System.out.println("O televisor da marca X acabou de ser ligado!");
        System.out.println("Herdado de " + super.name);
    }
}
