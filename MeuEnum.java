public enum MeuEnum {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5); // As constantes do enum

    private int numeroMes;

    private MeuEnum(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public int getNumeroMes() {
        return numeroMes;
    } 
}
