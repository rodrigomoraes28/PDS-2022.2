import java.util.ArrayList;

public class Carrinho2 {

  ArrayList<Produto> produtos;
  IFrete2 frete;

  public Carrinho2(IFrete2 frete){
    produtos = new ArrayList<Produto>();
    this.frete = frete;
  }


  public void adicionarProduto(Produto produtonovo){
    this.produtos.add(produtonovo); //vai adicionar ao atributo do tipo arraylist ali em cima ArrayList<Produto> produtos a variavel do tipo Produto que tem o nome de produtonovo que esta no parametro dessa função
  }

  public void setFrete(IFrete2 freteescolhido){ //aqui é mole, vai trocar de frete, tem a variavel do tipo que quero trocar que chama IFrete2 no paraemtro e atribuo o atributo que criei la em cima fora do metodo com this.atributo e ponho = nome da variavel no para
    this.frete = freteescolhido;
  }

  
  public float calcularFrete(){
    return this.frete.calcularFrete(produtos);  //ae calcula o frete, que é um metodo da interface IFrete, que usa a variavel produtos que é do tipo ArrayList de um objeto chamado Prodocut que contem peso e nome
  }
 
}
