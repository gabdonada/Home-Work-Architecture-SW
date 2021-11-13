
package src;

import java.util.ArrayList;

public class MovimentacaoEstoque {
    private ArrayList<Produto> movimentacao = new ArrayList<>();
    
    public void adicionarMov(ArrayList<Produto> prods){
        for(Produto p : prods){
            movimentacao.add(p);
        }
    }
    
    public void listarEstoque(){   
        for(Produto p : movimentacao){
            System.out.println("Movimentacao: codigo = "+p.getCodigo()+", Nome = "+p.getNome()+", Categoria = "+p.getCategoria()
                    +", Vencimento = "+p.getVencimento()+", Quantidade = "+p.getQuantidade()+", Valor = "+p.getValorUnit());
        }
    }
    
}
