import java.util.ArrayList;

public class Carrinho3 {


  IFrete3 frete;
  ArrayList<Produto3> produto;

  public Carrinho3(IFrete3 frete){
    produto = new ArrayList<>();
    this.frete = frete;
  }

  public void adicionarProduto(Produto3 produto3){
    this.produto.add(produto3);
  }
 

  public void setFrete(IFrete3 frete) {
    this.frete = frete;
  }


  public float calcularFrete(){
    return this.frete.calcularFrete(produto);
  }
  
}
