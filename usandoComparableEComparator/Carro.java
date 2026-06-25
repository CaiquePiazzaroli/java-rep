package usandoComparableEComparator;

public class Carro implements Comparable<Carro>{
    
    private Long ano;
    private String marca;

    public Carro(Long ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int compareTo(Carro o) {
        if(this.getAno().longValue() > o.getAno().longValue()) return -1; // Esse carro deve vir na frente do outro
        if(this.getAno().intValue() < o.getAno().intValue()) return 1; // o outro deve vir na frente
        return 0; // Tanto faz
    }

    @Override
    public String toString() {
        return this.marca;
    }

    


}
