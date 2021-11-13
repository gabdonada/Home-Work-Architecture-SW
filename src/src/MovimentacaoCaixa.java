
package src;

public class MovimentacaoCaixa {
    private double valorGanho;

    public double getValorGanho() {
        return valorGanho;
    }

    public void setValorGanho(double valorGanho) {
        this.valorGanho = valorGanho;
    }
    
    public void somarValor(double novoValor){
        this.valorGanho += novoValor;
    }
}