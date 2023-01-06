import java.util.ArrayList;

public class Carrinho {


  IFrete frete;

  ArrayList<Produto> produtos;

  Carrinho( IFrete frete_padrao){
    this.frete = frete_padrao;
    this.produtos = new ArrayList<Produto>();
  }

  public void addProduto(Produto produto){
    this.produtos.add(produto);
  }

  public void setFrete(IFrete frete) {
    this.frete = frete;
  }
  
  public float leFrete(){
    return this.frete.calculaFrete(produtos);
  }
}
