package src;


public class Produto {
    private int codigo;
    private String nome;
    private String categoria;
    private int vencimento;
    private int quantidade;
    private double valorUnit;

    public Produto(int codigo, String nome, String categoria, int vencimento, int quantidade, double valorUnit) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.vencimento = vencimento;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVencimento() {
        return vencimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", vencimento=" + vencimento + ", quantidade=" + quantidade + ", valorUnit=" + valorUnit + '}';
    }    
            
}
