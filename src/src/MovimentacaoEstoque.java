
package src;

import java.util.ArrayList;

public class MovimentacaoEstoque {
    private ArrayList<Produto> movimentacao = new ArrayList<>();
    
    public void adicionarMov(ArrayList<Produto> prods){
        for(Produto p : prods){
            movimentacao.add(p);
        }
    }

    @Override
    public String toString() {
        return "MovimentacaoEstoque{" + "Movimentacao = " + movimentacao + '}';
    }
}
