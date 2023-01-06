import java.util.ArrayList;

public class StrategyA implements IStrategy{

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {

    float precoTotal = 0;
    for (Produto produto2 : produto) {
      precoTotal += produto2.getPreco();   //preco dos produtos
    }

    precoTotal += 25; //frete fixo
    
    return precoTotal;
  }

  
  
}
