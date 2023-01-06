import java.util.ArrayList;

public class StrategyC implements IStrategy {

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {

    float precoTotal = 0;

    for (Produto produto2 : produto) {
      precoTotal += produto2.getPreco();
      precoTotal += produto2.getPeso() * 2f; //cada kilo é 2, lembrar de por o peso depois em kg (dae poe 0.2, 0.4, 1.5 e nao em gramas)
    }
 
    return precoTotal;
  }
  
}
