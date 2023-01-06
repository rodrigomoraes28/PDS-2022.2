import java.util.ArrayList;

public class Carrinho {

  ArrayList<Product> produtos;

  IFrete frete;

  public Carrinho(IFrete frete){
    produtos = new ArrayList<Product>();
    this.frete = frete;
  }

  public void adicionarProduto(Product produto){
    this.produtos.add(produto); //adicionou um novo produto no arraylist com o metodo add que é reservado do java
  }

  public void setFrete(IFrete frete){ //mudou o frete, o set muda o frete
    this.frete = frete;
  }

  public float calcularFrete(){   //ae calcula o frete, que é um metodo da interface IFrete, que usa a variavel produtos que é do tipo ArrayList de um objeto chamado Prodocut que contem peso e nome
    return this.frete.calcularFrete(this.produtos);
  }

  
}
