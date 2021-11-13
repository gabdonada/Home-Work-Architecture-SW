
package src;


import java.util.ArrayList;

public class Caixa {
    private ArrayList<Produto> listaDeCompras = new ArrayList<>();
    private double valorTotal = 0;

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void adicionarALista(Produto prod){
        listaDeCompras.add(prod);
        this.valorTotal += prod.getQuantidade()*prod.getValorUnit();
    }
    
    public void remoderDaLista(int p){
        boolean encontrouProd = false;
        for (int i = 0; i < listaDeCompras.size(); i++) {
            if(listaDeCompras.get(i).getCodigo() == p){
                listaDeCompras.remove(i);
                encontrouProd = true;
            }
        }
        if(encontrouProd){
            System.out.println("Removido com sucesso.");
        }else{
              System.out.println("Produto não encontrado.");
        }
    
    }
    
    public ArrayList<Produto> finalizarCompra(){
        
        System.out.println("---- Nota da Compra ----");

        for(Produto prods : listaDeCompras){
            System.out.println(prods);
        }
        
        System.out.println("Valor a pagar: "+valorTotal);

        return listaDeCompras;
    }
    
}
