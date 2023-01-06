import java.util.ArrayList;

public class Carrinho {


  IFrete frete;
  ArrayList<Produto> produto;

  public Carrinho(IFrete frete_ex){
    this.frete = frete_ex;
    produto = new ArrayList<Produto>();
  }

  public void addProduto(Produto produto_novo){
    this.produto.add(produto_novo);
  }


  public void setFrete(IFrete frete) {
    this.frete = frete;
  }


  public float calculaFrete(){
    return this.frete.calculaFrete(produto);
  }
  
}
