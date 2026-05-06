public class Main {
    public static void main(String[] args) {
        
        // Usando um enum
        MeuEnum meses = MeuEnum.MAIO;
        System.out.println(meses.getNumeroMes());

        // Listando as constantes do enum
        for(MeuEnum en : MeuEnum.values()) {
            System.out.println(en);
        }

        // Atribuindo um valor de enum a uma variavel por uma strings
        String abril = "abril";
        MeuEnum mesDeAbril = MeuEnum.valueOf(abril.toUpperCase());
        System.out.println(new StringBuilder( "Mes selecionado: ").append(mesDeAbril));


    }
}
