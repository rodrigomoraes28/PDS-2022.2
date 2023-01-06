package Strategy;

import java.util.ArrayList;

public class Carrinho {


  IFrete frete;
  ArrayList<Produto> produtos;


  Carrinho(IFrete frete_ex){
    this.frete = frete_ex;
    this.produtos = new ArrayList<Produto>();
  }


  public void setFrete(IFrete frete) {
    this.frete = frete;
  }
  
  
  public void addProduto(Produto produto_add){
    this.produtos.add(produto_add);
  }

  public float lePrecoFrete(){
    return this.frete.lePreco(produtos);
  }


}
