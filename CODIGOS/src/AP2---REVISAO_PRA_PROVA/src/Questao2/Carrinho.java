package Questao2;

import java.util.ArrayList;

public class Carrinho {


  ITransportadora itransportadora;
  ArrayList<Produto> produto;


  Carrinho(ITransportadora itransportadora_ex){
    // this.produto = produto_ex;
    this.itransportadora = itransportadora_ex;
    produto = new ArrayList<Produto>();    
  }


  void adicionaItemAoCarrinho(Produto produto_ex){
    this.produto.add(produto_ex);
  }

  void setTransportadora(ITransportadora iTransportadora_set){
    this.itransportadora = iTransportadora_set;
  }

   
  public float lePrecoFrete(){
    return this.itransportadora.calcularFrete(this.produto);
  }
  
  
}
