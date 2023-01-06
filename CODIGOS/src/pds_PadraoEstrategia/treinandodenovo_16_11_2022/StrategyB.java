import java.util.ArrayList;

public class StrategyB implements IStrategy{

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {

     float precoTotal = 0; //incializa como zero pra poder entrar no foreach e somar as coisas la

     for (Produto produto2 : produto) {
      precoTotal += produto2.getPreco();
     }
     
      precoTotal += produto.size();      //isso aqui é um problema 
      

     return precoTotal;
  }
  
}
