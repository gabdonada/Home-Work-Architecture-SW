
package src;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarAoEstoque(Produto prod){
        produtos.add(prod);
    }
    
    public void subtrairDoEstoque(int codigo, int quantidade){
        for(Produto produto : produtos){
            if(produto.getCodigo()==codigo){
                if(produto.getQuantidade()>= quantidade){
                    int novaQuantidade = produto.getQuantidade() - quantidade;
                    Produto prod = new Produto(produto.getCodigo(), produto.getNome(), produto.getCategoria(), 
                            produto.getVencimento(), novaQuantidade, produto.getValorUnit());
                    
                    atualizarProdutoNoEstoque(prod);
                    break;
                }else{
                    System.out.println("Quantidade do produto "+codigo+" insuficiente. Quantidade atual: "+produto.getQuantidade());                    
                }
            }
        }
        
        System.out.println("Produto "+codigo+" não encontrado.");                    
        
    }
    
    public void atualizarProdutoNoEstoque(Produto prod){
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == prod.getCodigo()){
                produtos.set(i, prod);
            }
            break;
        }
        
        System.out.println("Produto "+prod.getCodigo()+" não encontrado.");                    
    }
    
    public Produto consultarProduto(int cod){
        Produto ret = null;
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == cod){
                return produtos.get(i);
            }
            
        }
        
        System.out.println("Produto "+cod+" não encontrado.");                    
        return ret;
    }
    
    
    
    
}
