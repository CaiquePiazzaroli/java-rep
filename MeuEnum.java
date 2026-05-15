public enum MeuEnum {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5); // As constantes do enum

    private Integer numeroMes;

    private MeuEnum(Integer numeroMes) {
        this.numeroMes = numeroMes;
    }

    public Integer getNumeroMes() {
        return numeroMes;
    } 
}
