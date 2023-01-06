import java.util.ArrayList;

public class StrategyUnidade implements IFrete {
 
  @Override
  public float calcularFrete(ArrayList<Product> products) {
    return products.size() *7.5f;
  }
  
}
