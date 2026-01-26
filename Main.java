import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animalEscolhido;
        
        String categoria1Animal = sc.next();
        String categoria2Animal = sc.next();
        String categoria3Animal = sc.next();
        
        if(categoria1Animal.equals("vertebrado")) {
            if(categoria2Animal.equals("ave")) {
                if(categoria3Animal.equals("carnivoro")) {
                    animalEscolhido = "aguia";
                } else {
                    animalEscolhido = "pomba";
                }
            } else {
                if(categoria3Animal.equals("onivoro")) {
                    animalEscolhido = "homem";
                } else {
                    animalEscolhido = "vaca";
                }
            }
        } else {
            if(categoria2Animal.equals("inseto")) {
                if(categoria3Animal.equals("hematofago")) {
                    animalEscolhido = "pulga";
                } else {
                    animalEscolhido = "lagarta";
                }
            } else {
                if(categoria3Animal.equals("hematofago")) {
                    animalEscolhido = "sanguessuga";
                } else {
                    animalEscolhido = "minhoca";
                }
            }
        }
        System.out.println(animalEscolhido);
    
    }
}