import java.util.ArrayList;

public class StrategyC implements IFrete2 {

  @Override
  public float calcularFrete(ArrayList<Produto> produtos) {
     return produtos.size() * 7.5f; 
  }
  
}
