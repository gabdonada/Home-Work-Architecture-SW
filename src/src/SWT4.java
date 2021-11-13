
package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Donada
 */
public class SWT4 {
    private static Estoque estoque = new Estoque();
    private static Caixa caixa = new Caixa();
    private static MovimentacaoCaixa mocCaixa = new MovimentacaoCaixa();
    private static MovimentacaoEstoque mocEstoque = new MovimentacaoEstoque();


    
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        
        int opt = 10;
        while(opt != 0){
            System.out.println("---- Menu ---- \n ");
            System.out.println("Selecione Opção: \n");
            System.out.println("1 - Registrar produto no Estoque.\n");
            System.out.println("2 - Remover do Estoque. \n");
            System.out.println("3 - Atualizar produto no Estoque. \n");
            System.out.println("4 - Consultar produto.\n");
            System.out.println("5 - Adicionar produtos ao Caixa. \n ");
            System.out.println("6 - Finalizar compra. \n");
            System.out.println("7 - Remover produto do Caixa. \n");
            System.out.println("8 - Visualizar movimentação do Estoque. \n");
            System.out.println("9 - Visualizar movimentação do caixa. \n");
            System.out.println("0 - Finalizar APP. \n");
            
            opt = scanner.nextInt();
            if(opt != 0){
                distribui(opt);
            }
        }
        
        
    }  
    
    public static void distribui(int i){
        Scanner sc = new Scanner(System.in);
        Produto prod;
        switch (i){
            case 1:                
                System.out.println("Digite codigo, nome, categoria, ano vencimento, quantidade e valor unitario" );
                prod = new Produto(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
              
                estoque.adicionarAoEstoque(prod);
                break;
             
            case 2:
                System.out.println("Digite Cogido do produto e quantidae a ser removida");
                estoque.subtrairDoEstoque(sc.nextInt(), sc.nextInt());
                break;
                
            case 3:
                System.out.println("Digite codigo existente, nome, categoria, ano vencimento, quantidade e valor unitario" );
                prod = new Produto(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                estoque.atualizarProdutoNoEstoque(prod);
                break;
                
            case 4:
                prod = null;
                System.out.println("Digite Cogido do produto");
                prod = estoque.consultarProduto(sc.nextInt());
                
                if (prod != null){
                    System.out.println(prod);
                }
                break;
                
            case 5:
                int p = 3;
                while(p !=0){
                    prod = null;
                    System.out.println("Digite Cogido do produto desejado e a quantidade");
                    prod = estoque.consultarProduto(sc.nextInt());
                    int quant = sc.nextInt();
                    
                    //if(prod !=null && prod.getQuantidade() < quant){
                        prod.setQuantidade(quant);
                        caixa.adicionarALista(prod);
                    //}else{
                        //System.out.println("Quantidade em estoque é inferior a desejada");
                    //}
                    System.out.println("1- Para adicionar outro produto ou 0 - Para retornar ao Menu");
                    p = sc.nextInt();
                }
                break;
                
            case 6:
                ArrayList<Produto> prods = new ArrayList<>();
                mocCaixa.somarValor(caixa.getValorTotal());
                prods = caixa.finalizarCompra();
                
                for(Produto pr : prods){
                    estoque.subtrairDoEstoque(pr.getCodigo(), pr.getQuantidade());
                }
                
                mocEstoque.adicionarMov(prods);
                
                caixa = new Caixa();
                prods = new ArrayList<>();
                break;
            
            case 7:
                System.out.println("Digite codigo a remover da lista do Caixa");
                caixa.remoderDaLista(sc.nextInt());
                break;
                
            case 8:
                System.out.println("---- Movimentação Estoque ----");
                mocEstoque.listarEstoque();
                break;
        
            case 9:
                System.out.println("---- Valor em Caixa ----");
                System.out.println("Valor Total em Caixa: "+mocCaixa.getValorGanho());
                break;
        }
    }
}
